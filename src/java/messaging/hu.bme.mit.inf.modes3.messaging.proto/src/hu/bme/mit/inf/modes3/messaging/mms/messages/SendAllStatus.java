// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SendAllStatus.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf type {@code modes3.protobuf.SendAllStatus}
 */
public  final class SendAllStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:modes3.protobuf.SendAllStatus)
    SendAllStatusOrBuilder {
  // Use SendAllStatus.newBuilder() to construct.
  private SendAllStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendAllStatus() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SendAllStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
    return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOuterClass.internal_static_modes3_protobuf_SendAllStatus_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOuterClass.internal_static_modes3_protobuf_SendAllStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.class, hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.Builder.class);
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus)) {
      return super.equals(obj);
    }
    hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus other = (hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus) obj;

    boolean result = true;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parseFrom(
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
  public static Builder newBuilder(hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus prototype) {
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
   * Protobuf type {@code modes3.protobuf.SendAllStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:modes3.protobuf.SendAllStatus)
      hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOuterClass.internal_static_modes3_protobuf_SendAllStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOuterClass.internal_static_modes3_protobuf_SendAllStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.class, hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.Builder.class);
    }

    // Construct using hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.newBuilder()
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatusOuterClass.internal_static_modes3_protobuf_SendAllStatus_descriptor;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus getDefaultInstanceForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.getDefaultInstance();
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus build() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus buildPartial() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus result = new hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus(this);
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
      if (other instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus) {
        return mergeFrom((hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus other) {
      if (other == hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus.getDefaultInstance()) return this;
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
      hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:modes3.protobuf.SendAllStatus)
  }

  // @@protoc_insertion_point(class_scope:modes3.protobuf.SendAllStatus)
  private static final hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus();
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendAllStatus>
      PARSER = new com.google.protobuf.AbstractParser<SendAllStatus>() {
    public SendAllStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendAllStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendAllStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendAllStatus> getParserForType() {
    return PARSER;
  }

  public hu.bme.mit.inf.modes3.messaging.mms.messages.SendAllStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

