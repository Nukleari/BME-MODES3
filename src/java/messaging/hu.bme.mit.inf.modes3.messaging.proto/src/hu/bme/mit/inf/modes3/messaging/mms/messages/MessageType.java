// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enums.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf enum {@code modes3.protobuf.MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NULL = 0;</code>
   */
  NULL(0),
  /**
   * <code>SEGMENT_COMMAND = 1;</code>
   */
  SEGMENT_COMMAND(1),
  /**
   * <code>SEGMENT_STATE = 2;</code>
   */
  SEGMENT_STATE(2),
  /**
   * <code>TRAIN_CURRENT_SEGMENT = 3;</code>
   */
  TRAIN_CURRENT_SEGMENT(3),
  /**
   * <code>TRAIN_CURRENT_SPEED = 4;</code>
   */
  TRAIN_CURRENT_SPEED(4),
  /**
   * <code>TRAIN_DIRECTION_COMMAND = 5;</code>
   */
  TRAIN_DIRECTION_COMMAND(5),
  /**
   * <code>TRAIN_REFERENCE_SPEED = 7;</code>
   */
  TRAIN_REFERENCE_SPEED(7),
  /**
   * <code>TRAIN_REFERENCE_SPEED_COMMAND = 8;</code>
   */
  TRAIN_REFERENCE_SPEED_COMMAND(8),
  /**
   * <code>TURNOUT_COMMAND = 9;</code>
   */
  TURNOUT_COMMAND(9),
  /**
   * <code>TURNOUT_STATE = 10;</code>
   */
  TURNOUT_STATE(10),
  /**
   * <code>SEGMENT_OCCUPANCY = 11;</code>
   */
  SEGMENT_OCCUPANCY(11),
  /**
   * <code>YAKINDU_RELEASE_TO = 12;</code>
   */
  YAKINDU_RELEASE_TO(12),
  /**
   * <code>YAKINDU_CAN_GO_TO = 13;</code>
   */
  YAKINDU_CAN_GO_TO(13),
  /**
   * <code>YAKINDU_CANNOT_GO_TO = 14;</code>
   */
  YAKINDU_CANNOT_GO_TO(14),
  /**
   * <code>YAKINDU_RESERVE_TO = 15;</code>
   */
  YAKINDU_RESERVE_TO(15),
  /**
   * <code>TURNOUT_REFERENCE_COMMAND = 16;</code>
   */
  TURNOUT_REFERENCE_COMMAND(16),
  /**
   * <code>TURNOUT_REFERENCE_STATE = 17;</code>
   */
  TURNOUT_REFERENCE_STATE(17),
  /**
   * <code>TRAIN_FUNCTION_COMMAND = 18;</code>
   */
  TRAIN_FUNCTION_COMMAND(18),
  /**
   * <code>TRAIN_FUNCTION_STATE = 19;</code>
   */
  TRAIN_FUNCTION_STATE(19),
  /**
   * <code>DCC_OPERATIONS_COMMAND = 20;</code>
   */
  DCC_OPERATIONS_COMMAND(20),
  /**
   * <code>DCC_OPERATIONS_STATE = 21;</code>
   */
  DCC_OPERATIONS_STATE(21),
  /**
   * <code>SEND_ALL_STATUS = 22;</code>
   */
  SEND_ALL_STATUS(22),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NULL = 0;</code>
   */
  public static final int NULL_VALUE = 0;
  /**
   * <code>SEGMENT_COMMAND = 1;</code>
   */
  public static final int SEGMENT_COMMAND_VALUE = 1;
  /**
   * <code>SEGMENT_STATE = 2;</code>
   */
  public static final int SEGMENT_STATE_VALUE = 2;
  /**
   * <code>TRAIN_CURRENT_SEGMENT = 3;</code>
   */
  public static final int TRAIN_CURRENT_SEGMENT_VALUE = 3;
  /**
   * <code>TRAIN_CURRENT_SPEED = 4;</code>
   */
  public static final int TRAIN_CURRENT_SPEED_VALUE = 4;
  /**
   * <code>TRAIN_DIRECTION_COMMAND = 5;</code>
   */
  public static final int TRAIN_DIRECTION_COMMAND_VALUE = 5;
  /**
   * <code>TRAIN_REFERENCE_SPEED = 7;</code>
   */
  public static final int TRAIN_REFERENCE_SPEED_VALUE = 7;
  /**
   * <code>TRAIN_REFERENCE_SPEED_COMMAND = 8;</code>
   */
  public static final int TRAIN_REFERENCE_SPEED_COMMAND_VALUE = 8;
  /**
   * <code>TURNOUT_COMMAND = 9;</code>
   */
  public static final int TURNOUT_COMMAND_VALUE = 9;
  /**
   * <code>TURNOUT_STATE = 10;</code>
   */
  public static final int TURNOUT_STATE_VALUE = 10;
  /**
   * <code>SEGMENT_OCCUPANCY = 11;</code>
   */
  public static final int SEGMENT_OCCUPANCY_VALUE = 11;
  /**
   * <code>YAKINDU_RELEASE_TO = 12;</code>
   */
  public static final int YAKINDU_RELEASE_TO_VALUE = 12;
  /**
   * <code>YAKINDU_CAN_GO_TO = 13;</code>
   */
  public static final int YAKINDU_CAN_GO_TO_VALUE = 13;
  /**
   * <code>YAKINDU_CANNOT_GO_TO = 14;</code>
   */
  public static final int YAKINDU_CANNOT_GO_TO_VALUE = 14;
  /**
   * <code>YAKINDU_RESERVE_TO = 15;</code>
   */
  public static final int YAKINDU_RESERVE_TO_VALUE = 15;
  /**
   * <code>TURNOUT_REFERENCE_COMMAND = 16;</code>
   */
  public static final int TURNOUT_REFERENCE_COMMAND_VALUE = 16;
  /**
   * <code>TURNOUT_REFERENCE_STATE = 17;</code>
   */
  public static final int TURNOUT_REFERENCE_STATE_VALUE = 17;
  /**
   * <code>TRAIN_FUNCTION_COMMAND = 18;</code>
   */
  public static final int TRAIN_FUNCTION_COMMAND_VALUE = 18;
  /**
   * <code>TRAIN_FUNCTION_STATE = 19;</code>
   */
  public static final int TRAIN_FUNCTION_STATE_VALUE = 19;
  /**
   * <code>DCC_OPERATIONS_COMMAND = 20;</code>
   */
  public static final int DCC_OPERATIONS_COMMAND_VALUE = 20;
  /**
   * <code>DCC_OPERATIONS_STATE = 21;</code>
   */
  public static final int DCC_OPERATIONS_STATE_VALUE = 21;
  /**
   * <code>SEND_ALL_STATUS = 22;</code>
   */
  public static final int SEND_ALL_STATUS_VALUE = 22;


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
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return NULL;
      case 1: return SEGMENT_COMMAND;
      case 2: return SEGMENT_STATE;
      case 3: return TRAIN_CURRENT_SEGMENT;
      case 4: return TRAIN_CURRENT_SPEED;
      case 5: return TRAIN_DIRECTION_COMMAND;
      case 7: return TRAIN_REFERENCE_SPEED;
      case 8: return TRAIN_REFERENCE_SPEED_COMMAND;
      case 9: return TURNOUT_COMMAND;
      case 10: return TURNOUT_STATE;
      case 11: return SEGMENT_OCCUPANCY;
      case 12: return YAKINDU_RELEASE_TO;
      case 13: return YAKINDU_CAN_GO_TO;
      case 14: return YAKINDU_CANNOT_GO_TO;
      case 15: return YAKINDU_RESERVE_TO;
      case 16: return TURNOUT_REFERENCE_COMMAND;
      case 17: return TURNOUT_REFERENCE_STATE;
      case 18: return TRAIN_FUNCTION_COMMAND;
      case 19: return TRAIN_FUNCTION_STATE;
      case 20: return DCC_OPERATIONS_COMMAND;
      case 21: return DCC_OPERATIONS_STATE;
      case 22: return SEND_ALL_STATUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
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
        .getEnumTypes().get(1);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
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

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:modes3.protobuf.MessageType)
}

