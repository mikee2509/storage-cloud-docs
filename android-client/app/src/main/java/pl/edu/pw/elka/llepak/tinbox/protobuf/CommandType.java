// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package pl.edu.pw.elka.llepak.tinbox.protobuf;

/**
 * Protobuf enum {@code StorageCloud.CommandType}
 */
public enum CommandType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>NULL1 = 0;</code>
   */
  NULL1(0),
  /**
   * <code>LOGIN = 1;</code>
   */
  LOGIN(1),
  /**
   * <code>RELOGIN = 2;</code>
   */
  RELOGIN(2),
  /**
   * <code>LOGOUT = 3;</code>
   */
  LOGOUT(3),
  /**
   * <code>REGISTER = 4;</code>
   */
  REGISTER(4),
  /**
   * <code>GET_STAT = 5;</code>
   */
  GET_STAT(5),
  /**
   * <code>LIST_FILES = 6;</code>
   */
  LIST_FILES(6),
  /**
   * <code>MKDIR = 7;</code>
   */
  MKDIR(7),
  /**
   * <code>DELETE = 8;</code>
   */
  DELETE(8),
  /**
   * <code>RENAME = 9;</code>
   */
  RENAME(9),
  /**
   * <code>SHARE = 10;</code>
   */
  SHARE(10),
  /**
   * <code>SHARE_INFO = 11;</code>
   */
  SHARE_INFO(11),
  /**
   * <code>MOVE = 12;</code>
   */
  MOVE(12),
  /**
   * <code>DOWNLOAD = 13;</code>
   */
  DOWNLOAD(13),
  /**
   * <code>METADATA = 14;</code>
   */
  METADATA(14),
  /**
   * <code>USR_DATA = 15;</code>
   */
  USR_DATA(15),
  /**
   * <code>UNSHARE = 16;</code>
   */
  UNSHARE(16),
  /**
   * <code>DELETE_USER = 17;</code>
   */
  DELETE_USER(17),
  /**
   * <code>CHANGE_USER_PASS = 18;</code>
   */
  CHANGE_USER_PASS(18),
  /**
   * <code>USER_STAT = 19;</code>
   */
  USER_STAT(19),
  /**
   * <code>LIST_USER_FILES = 20;</code>
   */
  LIST_USER_FILES(20),
  /**
   * <code>DELETE_USER_FILE = 21;</code>
   */
  DELETE_USER_FILE(21),
  /**
   * <code>ADMIN_UNSHARE = 22;</code>
   */
  ADMIN_UNSHARE(22),
  /**
   * <code>ADMIN_SHARE_INFO = 23;</code>
   */
  ADMIN_SHARE_INFO(23),
  /**
   * <code>WARN = 24;</code>
   */
  WARN(24),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NULL1 = 0;</code>
   */
  public static final int NULL1_VALUE = 0;
  /**
   * <code>LOGIN = 1;</code>
   */
  public static final int LOGIN_VALUE = 1;
  /**
   * <code>RELOGIN = 2;</code>
   */
  public static final int RELOGIN_VALUE = 2;
  /**
   * <code>LOGOUT = 3;</code>
   */
  public static final int LOGOUT_VALUE = 3;
  /**
   * <code>REGISTER = 4;</code>
   */
  public static final int REGISTER_VALUE = 4;
  /**
   * <code>GET_STAT = 5;</code>
   */
  public static final int GET_STAT_VALUE = 5;
  /**
   * <code>LIST_FILES = 6;</code>
   */
  public static final int LIST_FILES_VALUE = 6;
  /**
   * <code>MKDIR = 7;</code>
   */
  public static final int MKDIR_VALUE = 7;
  /**
   * <code>DELETE = 8;</code>
   */
  public static final int DELETE_VALUE = 8;
  /**
   * <code>RENAME = 9;</code>
   */
  public static final int RENAME_VALUE = 9;
  /**
   * <code>SHARE = 10;</code>
   */
  public static final int SHARE_VALUE = 10;
  /**
   * <code>SHARE_INFO = 11;</code>
   */
  public static final int SHARE_INFO_VALUE = 11;
  /**
   * <code>MOVE = 12;</code>
   */
  public static final int MOVE_VALUE = 12;
  /**
   * <code>DOWNLOAD = 13;</code>
   */
  public static final int DOWNLOAD_VALUE = 13;
  /**
   * <code>METADATA = 14;</code>
   */
  public static final int METADATA_VALUE = 14;
  /**
   * <code>USR_DATA = 15;</code>
   */
  public static final int USR_DATA_VALUE = 15;
  /**
   * <code>UNSHARE = 16;</code>
   */
  public static final int UNSHARE_VALUE = 16;
  /**
   * <code>DELETE_USER = 17;</code>
   */
  public static final int DELETE_USER_VALUE = 17;
  /**
   * <code>CHANGE_USER_PASS = 18;</code>
   */
  public static final int CHANGE_USER_PASS_VALUE = 18;
  /**
   * <code>USER_STAT = 19;</code>
   */
  public static final int USER_STAT_VALUE = 19;
  /**
   * <code>LIST_USER_FILES = 20;</code>
   */
  public static final int LIST_USER_FILES_VALUE = 20;
  /**
   * <code>DELETE_USER_FILE = 21;</code>
   */
  public static final int DELETE_USER_FILE_VALUE = 21;
  /**
   * <code>ADMIN_UNSHARE = 22;</code>
   */
  public static final int ADMIN_UNSHARE_VALUE = 22;
  /**
   * <code>ADMIN_SHARE_INFO = 23;</code>
   */
  public static final int ADMIN_SHARE_INFO_VALUE = 23;
  /**
   * <code>WARN = 24;</code>
   */
  public static final int WARN_VALUE = 24;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CommandType valueOf(int value) {
    return forNumber(value);
  }

  public static CommandType forNumber(int value) {
    switch (value) {
      case 0: return NULL1;
      case 1: return LOGIN;
      case 2: return RELOGIN;
      case 3: return LOGOUT;
      case 4: return REGISTER;
      case 5: return GET_STAT;
      case 6: return LIST_FILES;
      case 7: return MKDIR;
      case 8: return DELETE;
      case 9: return RENAME;
      case 10: return SHARE;
      case 11: return SHARE_INFO;
      case 12: return MOVE;
      case 13: return DOWNLOAD;
      case 14: return METADATA;
      case 15: return USR_DATA;
      case 16: return UNSHARE;
      case 17: return DELETE_USER;
      case 18: return CHANGE_USER_PASS;
      case 19: return USER_STAT;
      case 20: return LIST_USER_FILES;
      case 21: return DELETE_USER_FILE;
      case 22: return ADMIN_UNSHARE;
      case 23: return ADMIN_SHARE_INFO;
      case 24: return WARN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommandType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
          public CommandType findValueByNumber(int number) {
            return CommandType.forNumber(number);
          }
        };

  private final int value;

  private CommandType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:StorageCloud.CommandType)
}

