// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enums.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf enum {@code YakinduConnectionDirection}
 */
public enum YakinduConnectionDirection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEFT = 0;</code>
   */
  LEFT(0),
  /**
   * <code>RIGHT = 1;</code>
   */
  RIGHT(1),
  /**
   * <code>BOTTOM = 2;</code>
   */
  BOTTOM(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEFT = 0;</code>
   */
  public static final int LEFT_VALUE = 0;
  /**
   * <code>RIGHT = 1;</code>
   */
  public static final int RIGHT_VALUE = 1;
  /**
   * <code>BOTTOM = 2;</code>
   */
  public static final int BOTTOM_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static YakinduConnectionDirection valueOf(int value) {
    return forNumber(value);
  }

  public static YakinduConnectionDirection forNumber(int value) {
    switch (value) {
      case 0: return LEFT;
      case 1: return RIGHT;
      case 2: return BOTTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<YakinduConnectionDirection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      YakinduConnectionDirection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<YakinduConnectionDirection>() {
          public YakinduConnectionDirection findValueByNumber(int number) {
            return YakinduConnectionDirection.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor()
        .getEnumTypes().get(5);
  }

  private static final YakinduConnectionDirection[] VALUES = values();

  public static YakinduConnectionDirection valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private YakinduConnectionDirection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:YakinduConnectionDirection)
}
