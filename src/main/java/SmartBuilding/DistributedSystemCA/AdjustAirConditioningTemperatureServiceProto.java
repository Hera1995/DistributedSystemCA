// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdjustAirConditioningTemperatureService.proto

package SmartBuilding.DistributedSystemCA;

public final class AdjustAirConditioningTemperatureServiceProto {
  private AdjustAirConditioningTemperatureServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_TemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_TemperatureResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n-AdjustAirConditioningTemperatureServic" +
      "e.proto\022\023DistributedSystemCA\"9\n\022Temperat" +
      "ureRequest\022\016\n\006roomID\030\001 \001(\t\022\023\n\013temperatur" +
      "e\030\002 \001(\002\"&\n\023TemperatureResponse\022\017\n\007messag" +
      "e\030\001 \001(\t2\220\001\n\'AdjustAirConditioningTempera" +
      "tureService\022e\n\016SetTemperature\022\'.Distribu" +
      "tedSystemCA.TemperatureRequest\032(.Distrib" +
      "utedSystemCA.TemperatureResponse(\001BX\n!Sm" +
      "artBuilding.DistributedSystemCAB,AdjustA" +
      "irConditioningTemperatureServiceProtoP\001\242" +
      "\002\002SBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DistributedSystemCA_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DistributedSystemCA_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_TemperatureRequest_descriptor,
        new String[] { "RoomID", "Temperature", });
    internal_static_DistributedSystemCA_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DistributedSystemCA_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_TemperatureResponse_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
