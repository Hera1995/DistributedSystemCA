// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartBuilding.proto

package SmartBuilding.DistributedSystemCA;

public final class SmartBuildingProto {
  private SmartBuildingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_AccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_AccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_AccessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_AccessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_LockStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_LockStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_LockStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_LockStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_LightControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_LightControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DistributedSystemCA_LightControlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DistributedSystemCA_LightControlResponse_fieldAccessorTable;
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
      "\n\023SmartBuilding.proto\022\023DistributedSystem" +
      "CA\"/\n\rAccessRequest\022\016\n\006userID\030\001 \001(\t\022\016\n\006r" +
      "oomID\030\002 \001(\t\",\n\016AccessResponse\022\032\n\022permiss" +
      "ionsGranted\030\001 \001(\010\"#\n\021LockStatusRequest\022\016" +
      "\n\006roomID\030\001 \001(\t\"6\n\022LockStatusResponse\022\016\n\006" +
      "lockID\030\001 \001(\t\022\020\n\010isLocked\030\002 \001(\010\"8\n\023LightC" +
      "ontrolRequest\022\016\n\006roomID\030\001 \001(\t\022\021\n\tsetStat" +
      "us\030\002 \001(\010\"7\n\024LightControlResponse\022\016\n\006stat" +
      "us\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\"9\n\022Temperature" +
      "Request\022\016\n\006roomID\030\001 \001(\t\022\023\n\013temperature\030\002" +
      " \001(\002\"&\n\023TemperatureResponse\022\017\n\007message\030\001" +
      " \001(\t2\320\001\n\017SecurityService\022V\n\013GrantAccess\022" +
      "\".DistributedSystemCA.AccessRequest\032#.Di" +
      "stributedSystemCA.AccessResponse\022e\n\020Stre" +
      "amLockStatus\022&.DistributedSystemCA.LockS" +
      "tatusRequest\032\'.DistributedSystemCA.LockS" +
      "tatusResponse0\0012\214\001\n\026LightingControlServi" +
      "ce\022r\n\027MonitorAndControlLights\022(.Distribu" +
      "tedSystemCA.LightControlRequest\032).Distri" +
      "butedSystemCA.LightControlResponse(\0010\0012\220" +
      "\001\n\'AdjustAirConditioningTemperatureServi" +
      "ce\022e\n\016SetTemperature\022\'.DistributedSystem" +
      "CA.TemperatureRequest\032(.DistributedSyste" +
      "mCA.TemperatureResponse(\001B>\n!SmartBuildi" +
      "ng.DistributedSystemCAB\022SmartBuildingPro" +
      "toP\001\242\002\002SBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DistributedSystemCA_AccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DistributedSystemCA_AccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_AccessRequest_descriptor,
        new String[] { "UserID", "RoomID", });
    internal_static_DistributedSystemCA_AccessResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DistributedSystemCA_AccessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_AccessResponse_descriptor,
        new String[] { "PermissionsGranted", });
    internal_static_DistributedSystemCA_LockStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DistributedSystemCA_LockStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_LockStatusRequest_descriptor,
        new String[] { "RoomID", });
    internal_static_DistributedSystemCA_LockStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_DistributedSystemCA_LockStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_LockStatusResponse_descriptor,
        new String[] { "LockID", "IsLocked", });
    internal_static_DistributedSystemCA_LightControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DistributedSystemCA_LightControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_LightControlRequest_descriptor,
        new String[] { "RoomID", "SetStatus", });
    internal_static_DistributedSystemCA_LightControlResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DistributedSystemCA_LightControlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_LightControlResponse_descriptor,
        new String[] { "Status", "Message", });
    internal_static_DistributedSystemCA_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DistributedSystemCA_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_TemperatureRequest_descriptor,
        new String[] { "RoomID", "Temperature", });
    internal_static_DistributedSystemCA_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_DistributedSystemCA_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DistributedSystemCA_TemperatureResponse_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
