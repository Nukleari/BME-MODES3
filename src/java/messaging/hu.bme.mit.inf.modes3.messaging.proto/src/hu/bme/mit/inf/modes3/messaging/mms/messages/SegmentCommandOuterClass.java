// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SegmentCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public final class SegmentCommandOuterClass {
  private SegmentCommandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_modes3_protobuf_SegmentCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_modes3_protobuf_SegmentCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SegmentCommand.proto\022\017modes3.protobuf\032" +
      "\013Enums.proto\"V\n\016SegmentCommand\022\021\n\tsegmen" +
      "tID\030\001 \001(\r\0221\n\005state\030\002 \001(\0162\".modes3.protob" +
      "uf.SegmentStateValueB0\n,hu.bme.mit.inf.m" +
      "odes3.messaging.mms.messagesP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor(),
        }, assigner);
    internal_static_modes3_protobuf_SegmentCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_modes3_protobuf_SegmentCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_modes3_protobuf_SegmentCommand_descriptor,
        new java.lang.String[] { "SegmentID", "State", });
    hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
