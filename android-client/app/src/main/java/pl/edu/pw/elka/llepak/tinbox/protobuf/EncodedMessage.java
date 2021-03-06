// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package pl.edu.pw.elka.llepak.tinbox.protobuf;

/**
 * Protobuf type {@code StorageCloud.EncodedMessage}
 */
public  final class EncodedMessage extends
    com.google.protobuf.GeneratedMessageLite<
        EncodedMessage, EncodedMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:StorageCloud.EncodedMessage)
    EncodedMessageOrBuilder {
  private EncodedMessage() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int DATASIZE_FIELD_NUMBER = 1;
  private long dataSize_;
  /**
   * <code>optional uint64 dataSize = 1;</code>
   */
  public long getDataSize() {
    return dataSize_;
  }
  /**
   * <code>optional uint64 dataSize = 1;</code>
   */
  private void setDataSize(long value) {
    
    dataSize_ = value;
  }
  /**
   * <code>optional uint64 dataSize = 1;</code>
   */
  private void clearDataSize() {
    
    dataSize_ = 0L;
  }

  public static final int HASHALGORITHM_FIELD_NUMBER = 2;
  private int hashAlgorithm_;
  /**
   * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
   */
  public int getHashAlgorithmValue() {
    return hashAlgorithm_;
  }
  /**
   * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
   */
  public pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm getHashAlgorithm() {
    pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm result = pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm.forNumber(hashAlgorithm_);
    return result == null ? pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
   */
  private void setHashAlgorithmValue(int value) {
      hashAlgorithm_ = value;
  }
  /**
   * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
   */
  private void setHashAlgorithm(pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    hashAlgorithm_ = value.getNumber();
  }
  /**
   * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
   */
  private void clearHashAlgorithm() {
    
    hashAlgorithm_ = 0;
  }

  public static final int HASH_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString hash_;
  /**
   * <code>optional bytes hash = 3;</code>
   */
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }
  /**
   * <code>optional bytes hash = 3;</code>
   */
  private void setHash(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    hash_ = value;
  }
  /**
   * <code>optional bytes hash = 3;</code>
   */
  private void clearHash() {
    
    hash_ = getDefaultInstance().getHash();
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>optional .StorageCloud.MessageType type = 4;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .StorageCloud.MessageType type = 4;</code>
   */
  public pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType getType() {
    pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType result = pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType.forNumber(type_);
    return result == null ? pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .StorageCloud.MessageType type = 4;</code>
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <code>optional .StorageCloud.MessageType type = 4;</code>
   */
  private void setType(pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    type_ = value.getNumber();
  }
  /**
   * <code>optional .StorageCloud.MessageType type = 4;</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>optional bytes data = 5;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }
  /**
   * <code>optional bytes data = 5;</code>
   */
  private void setData(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    data_ = value;
  }
  /**
   * <code>optional bytes data = 5;</code>
   */
  private void clearData() {
    
    data_ = getDefaultInstance().getData();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dataSize_ != 0L) {
      output.writeUInt64(1, dataSize_);
    }
    if (hashAlgorithm_ != pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm.NULL2.getNumber()) {
      output.writeEnum(2, hashAlgorithm_);
    }
    if (!hash_.isEmpty()) {
      output.writeBytes(3, hash_);
    }
    if (type_ != pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType.NULL3.getNumber()) {
      output.writeEnum(4, type_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(5, data_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (dataSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, dataSize_);
    }
    if (hashAlgorithm_ != pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm.NULL2.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, hashAlgorithm_);
    }
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, hash_);
    }
    if (type_ != pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType.NULL3.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code StorageCloud.EncodedMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:StorageCloud.EncodedMessage)
      pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessageOrBuilder {
    // Construct using pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint64 dataSize = 1;</code>
     */
    public long getDataSize() {
      return instance.getDataSize();
    }
    /**
     * <code>optional uint64 dataSize = 1;</code>
     */
    public Builder setDataSize(long value) {
      copyOnWrite();
      instance.setDataSize(value);
      return this;
    }
    /**
     * <code>optional uint64 dataSize = 1;</code>
     */
    public Builder clearDataSize() {
      copyOnWrite();
      instance.clearDataSize();
      return this;
    }

    /**
     * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
     */
    public int getHashAlgorithmValue() {
      return instance.getHashAlgorithmValue();
    }
    /**
     * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
     */
    public Builder setHashAlgorithmValue(int value) {
      copyOnWrite();
      instance.setHashAlgorithmValue(value);
      return this;
    }
    /**
     * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
     */
    public pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm getHashAlgorithm() {
      return instance.getHashAlgorithm();
    }
    /**
     * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
     */
    public Builder setHashAlgorithm(pl.edu.pw.elka.llepak.tinbox.protobuf.HashAlgorithm value) {
      copyOnWrite();
      instance.setHashAlgorithm(value);
      return this;
    }
    /**
     * <code>optional .StorageCloud.HashAlgorithm hashAlgorithm = 2;</code>
     */
    public Builder clearHashAlgorithm() {
      copyOnWrite();
      instance.clearHashAlgorithm();
      return this;
    }

    /**
     * <code>optional bytes hash = 3;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return instance.getHash();
    }
    /**
     * <code>optional bytes hash = 3;</code>
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHash(value);
      return this;
    }
    /**
     * <code>optional bytes hash = 3;</code>
     */
    public Builder clearHash() {
      copyOnWrite();
      instance.clearHash();
      return this;
    }

    /**
     * <code>optional .StorageCloud.MessageType type = 4;</code>
     */
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <code>optional .StorageCloud.MessageType type = 4;</code>
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <code>optional .StorageCloud.MessageType type = 4;</code>
     */
    public pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType getType() {
      return instance.getType();
    }
    /**
     * <code>optional .StorageCloud.MessageType type = 4;</code>
     */
    public Builder setType(pl.edu.pw.elka.llepak.tinbox.protobuf.MessageType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .StorageCloud.MessageType type = 4;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>optional bytes data = 5;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return instance.getData();
    }
    /**
     * <code>optional bytes data = 5;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setData(value);
      return this;
    }
    /**
     * <code>optional bytes data = 5;</code>
     */
    public Builder clearData() {
      copyOnWrite();
      instance.clearData();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:StorageCloud.EncodedMessage)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage other = (pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage) arg1;
        dataSize_ = visitor.visitLong(dataSize_ != 0L, dataSize_,
            other.dataSize_ != 0L, other.dataSize_);
        hashAlgorithm_ = visitor.visitInt(hashAlgorithm_ != 0, hashAlgorithm_,    other.hashAlgorithm_ != 0, other.hashAlgorithm_);
        hash_ = visitor.visitByteString(hash_ != com.google.protobuf.ByteString.EMPTY, hash_,
            other.hash_ != com.google.protobuf.ByteString.EMPTY, other.hash_);
        type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
        data_ = visitor.visitByteString(data_ != com.google.protobuf.ByteString.EMPTY, data_,
            other.data_ != com.google.protobuf.ByteString.EMPTY, other.data_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                dataSize_ = input.readUInt64();
                break;
              }
              case 16: {
                int rawValue = input.readEnum();

                hashAlgorithm_ = rawValue;
                break;
              }
              case 26: {

                hash_ = input.readBytes();
                break;
              }
              case 32: {
                int rawValue = input.readEnum();

                type_ = rawValue;
                break;
              }
              case 42: {

                data_ = input.readBytes();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:StorageCloud.EncodedMessage)
  private static final pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new EncodedMessage();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static pl.edu.pw.elka.llepak.tinbox.protobuf.EncodedMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EncodedMessage> PARSER;

  public static com.google.protobuf.Parser<EncodedMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

