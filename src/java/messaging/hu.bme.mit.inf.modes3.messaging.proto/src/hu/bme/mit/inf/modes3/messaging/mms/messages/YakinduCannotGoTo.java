// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YakinduCannotGoTo.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf type {@code modes3.protobuf.YakinduCannotGoTo}
 */
public  final class YakinduCannotGoTo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:modes3.protobuf.YakinduCannotGoTo)
    YakinduCannotGoToOrBuilder {
  // Use YakinduCannotGoTo.newBuilder() to construct.
  private YakinduCannotGoTo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YakinduCannotGoTo() {
    targetID_ = 0;
    direction_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private YakinduCannotGoTo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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

            targetID_ = input.readUInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            direction_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOuterClass.internal_static_modes3_protobuf_YakinduCannotGoTo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOuterClass.internal_static_modes3_protobuf_YakinduCannotGoTo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.class, hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.Builder.class);
  }

  public static final int TARGETID_FIELD_NUMBER = 1;
  private int targetID_;
  /**
   * <code>optional uint32 targetID = 1;</code>
   */
  public int getTargetID() {
    return targetID_;
  }

  public static final int DIRECTION_FIELD_NUMBER = 2;
  private int direction_;
  /**
   * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
   */
  public int getDirectionValue() {
    return direction_;
  }
  /**
   * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
   */
  public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection getDirection() {
    hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection result = hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.valueOf(direction_);
    return result == null ? hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (targetID_ != 0) {
      output.writeUInt32(1, targetID_);
    }
    if (direction_ != hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.CW.getNumber()) {
      output.writeEnum(2, direction_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, targetID_);
    }
    if (direction_ != hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.CW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, direction_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo)) {
      return super.equals(obj);
    }
    hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo other = (hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo) obj;

    boolean result = true;
    result = result && (getTargetID()
        == other.getTargetID());
    result = result && direction_ == other.direction_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TARGETID_FIELD_NUMBER;
    hash = (53 * hash) + getTargetID();
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + direction_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code modes3.protobuf.YakinduCannotGoTo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:modes3.protobuf.YakinduCannotGoTo)
      hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOuterClass.internal_static_modes3_protobuf_YakinduCannotGoTo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOuterClass.internal_static_modes3_protobuf_YakinduCannotGoTo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.class, hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.Builder.class);
    }

    // Construct using hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      targetID_ = 0;

      direction_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoToOuterClass.internal_static_modes3_protobuf_YakinduCannotGoTo_descriptor;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo getDefaultInstanceForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.getDefaultInstance();
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo build() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo buildPartial() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo result = new hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo(this);
      result.targetID_ = targetID_;
      result.direction_ = direction_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo) {
        return mergeFrom((hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo other) {
      if (other == hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo.getDefaultInstance()) return this;
      if (other.getTargetID() != 0) {
        setTargetID(other.getTargetID());
      }
      if (other.direction_ != 0) {
        setDirectionValue(other.getDirectionValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int targetID_ ;
    /**
     * <code>optional uint32 targetID = 1;</code>
     */
    public int getTargetID() {
      return targetID_;
    }
    /**
     * <code>optional uint32 targetID = 1;</code>
     */
    public Builder setTargetID(int value) {
      
      targetID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 targetID = 1;</code>
     */
    public Builder clearTargetID() {
      
      targetID_ = 0;
      onChanged();
      return this;
    }

    private int direction_ = 0;
    /**
     * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
     */
    public int getDirectionValue() {
      return direction_;
    }
    /**
     * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
     */
    public Builder setDirectionValue(int value) {
      direction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
     */
    public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection getDirection() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection result = hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.valueOf(direction_);
      return result == null ? hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
     */
    public Builder setDirection(hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      direction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
     */
    public Builder clearDirection() {
      
      direction_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:modes3.protobuf.YakinduCannotGoTo)
  }

  // @@protoc_insertion_point(class_scope:modes3.protobuf.YakinduCannotGoTo)
  private static final hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo();
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YakinduCannotGoTo>
      PARSER = new com.google.protobuf.AbstractParser<YakinduCannotGoTo>() {
    public YakinduCannotGoTo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new YakinduCannotGoTo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<YakinduCannotGoTo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YakinduCannotGoTo> getParserForType() {
    return PARSER;
  }

  public hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduCannotGoTo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

