// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YakinduReleaseTo.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public final class YakinduReleaseToOuterClass {
  private YakinduReleaseToOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_modes3_protobuf_YakinduReleaseTo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_modes3_protobuf_YakinduReleaseTo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026YakinduReleaseTo.proto\022\017modes3.protobu" +
      "f\032\013Enums.proto\"d\n\020YakinduReleaseTo\022\020\n\010ta" +
      "rgetID\030\001 \001(\r\022>\n\tdirection\030\002 \001(\0162+.modes3" +
      ".protobuf.YakinduConnectionDirectionB0\n," +
      "hu.bme.mit.inf.modes3.messaging.mms.mess" +
      "agesP\001b\006proto3"
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
    internal_static_modes3_protobuf_YakinduReleaseTo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_modes3_protobuf_YakinduReleaseTo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_modes3_protobuf_YakinduReleaseTo_descriptor,
        new java.lang.String[] { "TargetID", "Direction", });
    hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
