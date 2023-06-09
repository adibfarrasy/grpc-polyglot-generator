//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: HelloWorld.proto

package common.agriaku.grpc_kotlin_test_app;

@kotlin.jvm.JvmName("-initializehelloRequestList")
public inline fun helloRequestList(block: common.agriaku.grpc_kotlin_test_app.HelloRequestListKt.Dsl.() -> kotlin.Unit): common.agriaku.grpc_kotlin_test_app.HelloRequestList =
  common.agriaku.grpc_kotlin_test_app.HelloRequestListKt.Dsl._create(common.agriaku.grpc_kotlin_test_app.HelloRequestList.newBuilder()).apply { block() }._build()
public object HelloRequestListKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: common.agriaku.grpc_kotlin_test_app.HelloRequestList.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: common.agriaku.grpc_kotlin_test_app.HelloRequestList.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): common.agriaku.grpc_kotlin_test_app.HelloRequestList = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class NamesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string names = 1;</code>
     * @return A list containing the names.
     */
    public val names: com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNamesList()
      )
    /**
     * <code>repeated string names = 1;</code>
     * @param value The names to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.add(value: kotlin.String) {
      _builder.addNames(value)
    }
    /**
     * <code>repeated string names = 1;</code>
     * @param value The names to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNames")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string names = 1;</code>
     * @param values The names to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllNames(values)
    }
    /**
     * <code>repeated string names = 1;</code>
     * @param values The names to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNames")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string names = 1;</code>
     * @param index The index to set the value at.
     * @param value The names to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNames")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setNames(index, value)
    }/**
     * <code>repeated string names = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NamesProxy>.clear() {
      _builder.clearNames()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun common.agriaku.grpc_kotlin_test_app.HelloRequestList.copy(block: common.agriaku.grpc_kotlin_test_app.HelloRequestListKt.Dsl.() -> kotlin.Unit): common.agriaku.grpc_kotlin_test_app.HelloRequestList =
  common.agriaku.grpc_kotlin_test_app.HelloRequestListKt.Dsl._create(this.toBuilder()).apply { block() }._build()

