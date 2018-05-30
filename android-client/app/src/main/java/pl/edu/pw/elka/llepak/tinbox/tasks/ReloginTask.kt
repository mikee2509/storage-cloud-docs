package pl.edu.pw.elka.llepak.tinbox.tasks

import android.os.AsyncTask
import pl.edu.pw.elka.llepak.tinbox.Connection
import pl.edu.pw.elka.llepak.tinbox.protobuf.CommandType
import pl.edu.pw.elka.llepak.tinbox.protobuf.ResponseType
import pl.edu.pw.elka.llepak.tinbox.protobuf.ServerResponse

class ReloginTask: AsyncTask<Unit, Unit, Boolean>() {
    override fun doInBackground(vararg params: Unit?): Boolean {
        val sidParam = Connection.messageBuilder.buildParam("sid", Connection.sid)
        val userParam = Connection.messageBuilder.buildParam("username", Connection.username)

        val command = Connection.messageBuilder.buildCommand(CommandType.RELOGIN, mutableListOf(sidParam, userParam))

        var response: ServerResponse = ServerResponse.getDefaultInstance()
        var responseType: ResponseType = ResponseType.NULL5
        try {
            response = Connection.sendCommandWithResponse(command)
            responseType = response.type
        }
        catch (e: Exception) {}
        return when(responseType) {
            ResponseType.LOGGED -> {
                Connection.sid = response.getParams(0).bParamVal
                true
            }
            ResponseType.ERROR -> false
            else -> false
        }
    }
}