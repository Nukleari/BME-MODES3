// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SegmentOccupancy.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public interface SegmentOccupancyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:modes3.protobuf.SegmentOccupancy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 segmentID = 1;</code>
   */
  int getSegmentID();

  /**
   * <code>optional .modes3.protobuf.SegmentOccupancyValue state = 2;</code>
   */
  int getStateValue();
  /**
   * <code>optional .modes3.protobuf.SegmentOccupancyValue state = 2;</code>
   */
  hu.bme.mit.inf.modes3.messaging.mms.messages.SegmentOccupancyValue getState();
}
