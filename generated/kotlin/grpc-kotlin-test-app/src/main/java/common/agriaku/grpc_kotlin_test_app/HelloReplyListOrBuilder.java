// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package common.agriaku.grpc_kotlin_test_app;

public interface HelloReplyListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HelloReplyList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string greetings = 1;</code>
   * @return A list containing the greetings.
   */
  java.util.List<java.lang.String>
      getGreetingsList();
  /**
   * <code>repeated string greetings = 1;</code>
   * @return The count of greetings.
   */
  int getGreetingsCount();
  /**
   * <code>repeated string greetings = 1;</code>
   * @param index The index of the element to return.
   * @return The greetings at the given index.
   */
  java.lang.String getGreetings(int index);
  /**
   * <code>repeated string greetings = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the greetings at the given index.
   */
  com.google.protobuf.ByteString
      getGreetingsBytes(int index);
}
