// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartBuilding.proto

package SmartBuilding.DistributedSystemCA;

public interface TemperatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DistributedSystemCA.TemperatureRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string roomID = 1;</code>
   * @return The roomID.
   */
  String getRoomID();
  /**
   * <code>string roomID = 1;</code>
   * @return The bytes for roomID.
   */
  com.google.protobuf.ByteString
      getRoomIDBytes();

  /**
   * <code>float temperature = 2;</code>
   * @return The temperature.
   */
  float getTemperature();
}