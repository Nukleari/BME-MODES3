// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YakinduCanGoTo.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public interface YakinduCanGoToOrBuilder extends
    // @@protoc_insertion_point(interface_extends:modes3.protobuf.YakinduCanGoTo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 targetID = 1;</code>
   */
  int getTargetID();

  /**
   * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
   */
  int getDirectionValue();
  /**
   * <code>optional .modes3.protobuf.YakinduConnectionDirection direction = 2;</code>
   */
  hu.bme.mit.inf.modes3.messaging.mms.messages.YakinduConnectionDirection getDirection();
}
