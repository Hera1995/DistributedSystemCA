// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartBuilding.proto

package SmartBuilding.DistributedSystemCA;

/**
 * <pre>
 *service1: SecurityService
 *function1: GrantAccess - unary
 * </pre>
 *
 * Protobuf type {@code DistributedSystemCA.AccessRequest}
 */
public final class AccessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DistributedSystemCA.AccessRequest)
    AccessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccessRequest.newBuilder() to construct.
  private AccessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccessRequest() {
    userID_ = "";
    roomID_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccessRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SmartBuildingProto.internal_static_DistributedSystemCA_AccessRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SmartBuildingProto.internal_static_DistributedSystemCA_AccessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AccessRequest.class, Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object userID_ = "";
  /**
   * <code>string userID = 1;</code>
   * @return The userID.
   */
  @Override
  public String getUserID() {
    Object ref = userID_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      userID_ = s;
      return s;
    }
  }
  /**
   * <code>string userID = 1;</code>
   * @return The bytes for userID.
   */
  @Override
  public com.google.protobuf.ByteString
      getUserIDBytes() {
    Object ref = userID_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      userID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOMID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object roomID_ = "";
  /**
   * <code>string roomID = 2;</code>
   * @return The roomID.
   */
  @Override
  public String getRoomID() {
    Object ref = roomID_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      roomID_ = s;
      return s;
    }
  }
  /**
   * <code>string roomID = 2;</code>
   * @return The bytes for roomID.
   */
  @Override
  public com.google.protobuf.ByteString
      getRoomIDBytes() {
    Object ref = roomID_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      roomID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roomID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomID_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roomID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomID_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AccessRequest)) {
      return super.equals(obj);
    }
    AccessRequest other = (AccessRequest) obj;

    if (!getUserID()
        .equals(other.getUserID())) return false;
    if (!getRoomID()
        .equals(other.getRoomID())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserID().hashCode();
    hash = (37 * hash) + ROOMID_FIELD_NUMBER;
    hash = (53 * hash) + getRoomID().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AccessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AccessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AccessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AccessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AccessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AccessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AccessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AccessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AccessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AccessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AccessRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *service1: SecurityService
   *function1: GrantAccess - unary
   * </pre>
   *
   * Protobuf type {@code DistributedSystemCA.AccessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DistributedSystemCA.AccessRequest)
      AccessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SmartBuildingProto.internal_static_DistributedSystemCA_AccessRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SmartBuildingProto.internal_static_DistributedSystemCA_AccessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AccessRequest.class, Builder.class);
    }

    // Construct using SmartBuilding.DistributedSystemCA.AccessRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userID_ = "";
      roomID_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SmartBuildingProto.internal_static_DistributedSystemCA_AccessRequest_descriptor;
    }

    @Override
    public AccessRequest getDefaultInstanceForType() {
      return AccessRequest.getDefaultInstance();
    }

    @Override
    public AccessRequest build() {
      AccessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AccessRequest buildPartial() {
      AccessRequest result = new AccessRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(AccessRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userID_ = userID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.roomID_ = roomID_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AccessRequest) {
        return mergeFrom((AccessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AccessRequest other) {
      if (other == AccessRequest.getDefaultInstance()) return this;
      if (!other.getUserID().isEmpty()) {
        userID_ = other.userID_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRoomID().isEmpty()) {
        roomID_ = other.roomID_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              userID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              roomID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Object userID_ = "";
    /**
     * <code>string userID = 1;</code>
     * @return The userID.
     */
    public String getUserID() {
      Object ref = userID_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userID_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string userID = 1;</code>
     * @return The bytes for userID.
     */
    public com.google.protobuf.ByteString
        getUserIDBytes() {
      Object ref = userID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userID = 1;</code>
     * @param value The userID to set.
     * @return This builder for chaining.
     */
    public Builder setUserID(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      userID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string userID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserID() {
      userID_ = getDefaultInstance().getUserID();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string userID = 1;</code>
     * @param value The bytes for userID to set.
     * @return This builder for chaining.
     */
    public Builder setUserIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private Object roomID_ = "";
    /**
     * <code>string roomID = 2;</code>
     * @return The roomID.
     */
    public String getRoomID() {
      Object ref = roomID_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        roomID_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string roomID = 2;</code>
     * @return The bytes for roomID.
     */
    public com.google.protobuf.ByteString
        getRoomIDBytes() {
      Object ref = roomID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        roomID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roomID = 2;</code>
     * @param value The roomID to set.
     * @return This builder for chaining.
     */
    public Builder setRoomID(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      roomID_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string roomID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoomID() {
      roomID_ = getDefaultInstance().getRoomID();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string roomID = 2;</code>
     * @param value The bytes for roomID to set.
     * @return This builder for chaining.
     */
    public Builder setRoomIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      roomID_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DistributedSystemCA.AccessRequest)
  }

  // @@protoc_insertion_point(class_scope:DistributedSystemCA.AccessRequest)
  private static final AccessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AccessRequest();
  }

  public static AccessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessRequest>
      PARSER = new com.google.protobuf.AbstractParser<AccessRequest>() {
    @Override
    public AccessRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AccessRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AccessRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public AccessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
