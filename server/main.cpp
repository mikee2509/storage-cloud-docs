#include "main.h"
#include "utils.h"
#include "Client.h"
#include "Logger.h"
#include "Database.h"
#include "User.h"

list<connection*> connections;

using namespace std;

using namespace StorageCloud;

bool should_exit = false;

Logger logger(&should_exit);
Database db(&logger);

void sig_handler(int signo)
{
    if (signo == SIGTERM) {
        logger.log("sig_handler", "received SIGTERM " + to_string(getpid()));
        should_exit = true;
    }
}

void process(int sock, connection* conn) {

    int optval = 1;
    socklen_t optlen = sizeof(optval);

    setsockopt(sock, SOL_SOCKET, SO_KEEPALIVE, &optval, optlen);

    optval = 2;

    setsockopt(sock, IPPROTO_TCP, TCP_KEEPCNT, &optval, optlen);

    optval = 10;

    setsockopt(sock, IPPROTO_TCP, TCP_KEEPIDLE, &optval, optlen);

    optval = 5;

    setsockopt(sock, IPPROTO_TCP, TCP_KEEPINTVL, &optval, optlen);

    Client client(sock, conn, &should_exit, &logger);

    client.loop();

//    "closed connection process "<<EncryptionAlgorithm_Name(conn->encryption)<<endl;

    close(sock);

    conn->running = false;
}

void server() {
    int sock;
    unsigned int length;
    struct sockaddr_in server;
    int msgsock = -1;

    sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock == -1) {
        logger.err("server", "error while opening stream socket", errno);
        should_exit = true;
        return;
    }

    /* dowiaz adres do gniazda */

    server.sin_family = AF_INET;
    server.sin_addr.s_addr = INADDR_ANY;
    server.sin_port = htons(52137);
    if (bind(sock, (struct sockaddr *) &server, sizeof server) == -1) {
        logger.err("server", "error while binding stream socket", errno);
        should_exit = true;
        return;
    }

    /* wydrukuj na konsoli przydzielony port */
    length = sizeof(server);
    if (getsockname(sock,(struct sockaddr *) &server, &length) == -1) {
        logger.err("server", "getting socket name", errno);
        should_exit = true;
        return;
    }
    logger.info("server", "Socket port #" + to_string(ntohs(server.sin_port)));

    listen(sock, 5);

    fd_set set;
    struct timeval timeout;
    int rv;

    do {
        FD_ZERO(&set); /* clear the set */
        FD_SET(sock, &set); /* add our file descriptor to the set */
        timeout.tv_sec = 2;
        timeout.tv_usec = 0;
        rv = select(sock + 1, &set, nullptr, nullptr, &timeout);

        if (rv == -1) {
            break;
        } else if (rv != 0) {
            struct sockaddr_in clientaddr;
            unsigned int len = sizeof(clientaddr);

            msgsock = accept(sock, (struct sockaddr *) &clientaddr, &len);

            if (msgsock == -1)
                logger.err("server", "error while accepting connection", errno);
            else {
                string conn(inet_ntoa(clientaddr.sin_addr));
                logger.info("server", "accepted connection from " + conn + ":" + to_string(ntohs(clientaddr.sin_port)));

                connection* new_connection = new connection;
                new_connection->encryption = DEFAULT_ENCRYPTION_ALGORITHM;
                new_connection->hash_algorithm = DEFAULT_HASHING_ALGORITHM;
                string tmp_addr;
                tmp_addr = inet_ntoa(clientaddr.sin_addr);
                tmp_addr.copy(new_connection->addr, tmp_addr.size());
                new_connection->addr[tmp_addr.size()] = 0;
                new_connection->port = (int) ntohs(clientaddr.sin_port);
                new_connection->running = true;

                connections.push_back(new_connection);

                new_connection->t = thread(process, msgsock, new_connection);
//                    close(msgsock); //needed?
            }
        }

        for(auto it=connections.begin(); it != connections.end();) {
            if(!((*it)->running)) {
                (*it)->t.join();
                delete (*it);
                it = connections.erase(it);
                logger.log("server", "connection removed");
            } else {
                it++;
            }
        }

    } while(!should_exit);

    logger.info("server", "closing all connections");

    for(auto it=connections.begin(); it != connections.end();) {
        (*it)->t.join();
        delete (*it);
        it = connections.erase(it);
    }

    close(sock);

    logger.info("server", "closed main server process");
}

int main(int argc, char **argv) {
    thread server_t = std::thread(server);

    string cmd;
    char c;

    logger.set_input_string(&cmd);

    UserManager u_m = UserManager::getInstance(&db, &logger);

//    vector<User> allUsers;
//    db.listUsers(allUsers);

//    map<string, bsoncxx::document::element> elM;
//
//    elM.emplace("username", bsoncxx::document::element{});
//    elM.emplace("surname", bsoncxx::document::element{});
//    elM.emplace("name", bsoncxx::document::element{});
//
//    db.getFields("users", allUsers[0].id, elM);

//    for(const auto &val: elM) {
//        cout<<val.first<<": "<<bsoncxx::string::to_string(val.second.get_utf8().value)<<endl;
//    }

//    map<bsoncxx::oid, map<string, bsoncxx::document::element> > mmap;
//
//    vector<string> fields;
//    fields.emplace_back("username");
//    fields.emplace_back("surname");
//    fields.emplace_back("name");

//    cout<<"XD:"<<endl;



//    cout<<((db.getFields("users", fields, mmap)) ? "ok" : "not ok")<<endl;
//
//    for(auto &usr: mmap) {
//        cout<<"id:"<<usr.first.to_string()<<endl;
//        for(auto &flds: usr.second) {
//            cout<<flds.first<<": "<<flds.second.get_utf8().value<<endl;
//        }
//    }

//    cout<<":XD"<<endl;
//
//    map<string, bsoncxx::types::value> elMi;
//
//    elMi.emplace("username", bsoncxx::types::value{bsoncxx::types::b_utf8{"miloszXD"}});
//    elMi.emplace("name", bsoncxx::types::value{bsoncxx::types::b_utf8{"MiloszTest"}});
//    elMi.emplace("surname", bsoncxx::types::value{bsoncxx::types::b_utf8{"SuRnAmE"}});
//    elMi.emplace("password", bsoncxx::types::value{bsoncxx::types::b_utf8{"safepasswd"}});
//
//    bsoncxx::oid i_id;

    //db.insertDoc("users", i_id, elMi);

    //cout<<"inserted id: "<<i_id.to_string()<<endl;

//    string tmpi = "WELP";

//    db.setField("users", "testField", allUsers[0].id, tmpi);


//    string u_name = "lukasz";
//    User u(u_name, u_m);
//
//    vector<UFile> users;
//    u.listShared(users);
//
//    for(auto& usr: users) {
//        logger.info("main/users", usr.filename);
//        logger.info("main/users", "|-> " + usr.owner_name);
//        logger.info("main/users", "|-> " + usr.owner_username);
//        logger.info("main/users", "|-> total space:" + to_string(usr.size) + "B");
//    }

//    u.deleteUserFile("miloszXD", "/test_dirXD/lol2");

//    string passwd = "nicepasswd";
//    string newSid;
//    u.loginByPassword(passwd, newSid);
//
//    UFile f;
//    f.filename = "/dir/dir23/file24.test";
//    f.size = 254345;
//    f.creation_date = time(0);
//    f.type = FILE_REGULAR;
//
//    string s_tmp("/dir/dir23");
//
//    vector<UFile> fields;
//
//    u.listFilesinPath(s_tmp, fields);
//
//    for(auto&& file: fields) {
//        logger.info("FILES", file.filename + " " + file.owner_name);
//    }

//    u.addFile(f);

//    cout<<(u.getName(u_name) ? "got user name" : "error while getting user name")<<endl;
//
//    cout<<"received user name: "<<u_name<<" ("<<u_name.size()<<")"<<endl;
//
//    string passwd = "nicepasswd";

//    u.setPassword(passwd);

//    string newSid;

//    cout<<(u.loginByPassword(passwd, newSid) ? "passwd ok" : "passwd wrong")<<" sid: "<<newSid<<endl;

//    bool xd_ok;
//    UDetails tmp_u;
//    tmp_u.surname = "Nazwisko";
//    tmp_u.name = "MiłoszTest";
//    tmp_u.username = "miloszXD";
//    tmp_u.role = USER_ADMIN;
//    UserManager::getInstance().registerUser(tmp_u, passwd, xd_ok);

    auto tmp_id = bsoncxx::oid{string("5b134cabe206a52f873c0d43")};

//    UserManager::getInstance().deletePath(tmp_id, "/test_dirXD/lol3/lol");

    while(!should_exit) {
        c = getch();

        if(c == 10 || c == 13) {
            if (cmd == "exit") {
                cmd = "";
                logger.set_input_string(nullptr);
                logger.info("main", "closing app");
                should_exit = true;
                break;
            } else if (cmd == "list") {
                logger.info("main", "There are " + to_string(connections.size()) + " active connections");
                for (auto &connection : connections) {
                    string conn(connection->addr);
                    conn += ":" + to_string(connection->port);
                    logger.info("main", conn);
                }
            } else if (cmd == "help") {
                logger.info("main", "Available commands:\n  exit - closes server\n  list - lists active connections");
            } else if (cmd == "users") {
                logger.info("main", "All users:");
                vector<UDetails> users;
                u_m.listAllUsers(users);

                for(auto& usr: users) {
                    logger.info("main/users", usr.username);
                    logger.info("main/users", "|-> " + usr.name);
                    logger.info("main/users", "|-> " + usr.surname);
                    logger.info("main/users", string("|-> ") + (usr.role == USER_ADMIN ? "admin" : "regular user"));
                    logger.info("main/users", "|-> total space:" + to_string(usr.totalSpace) + "B");
                    logger.info("main/users", "'-> used space: " + to_string(usr.usedSpace) + "B");
                }
            } else {
                logger.warn("main", "Unknown command, try help");
            }

            cmd = "";
        } else if(c == 127) {
            cmd.pop_back();
        } else {
            cmd += c;
        }

        logger.notify();
    }

    server_t.join();

    logger.info("main", "closing database connection");
//    db.~Database();
//    log"server closed"<<endl;
    logger.info("main", "bye!");
    logger.~Logger();
    return 0;
}

/**

 filename
hash
size
creationDate
owner
isComplete
lastValid

 **/