// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package common.agriaku.grpc_kotlin_test_app;

/**
 * Protobuf type {@code HelloRequestNonPrimitiveList}
 */
public final class HelloRequestNonPrimitiveList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HelloRequestNonPrimitiveList)
    HelloRequestNonPrimitiveListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloRequestNonPrimitiveList.newBuilder() to construct.
  private HelloRequestNonPrimitiveList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloRequestNonPrimitiveList() {
    names_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloRequestNonPrimitiveList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.internal_static_HelloRequestNonPrimitiveList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.internal_static_HelloRequestNonPrimitiveList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.class, common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.Builder.class);
  }

  public static final int NAMES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName> names_;
  /**
   * <code>repeated .NonPrimitiveName names = 1;</code>
   */
  @java.lang.Override
  public java.util.List<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName> getNamesList() {
    return names_;
  }
  /**
   * <code>repeated .NonPrimitiveName names = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder> 
      getNamesOrBuilderList() {
    return names_;
  }
  /**
   * <code>repeated .NonPrimitiveName names = 1;</code>
   */
  @java.lang.Override
  public int getNamesCount() {
    return names_.size();
  }
  /**
   * <code>repeated .NonPrimitiveName names = 1;</code>
   */
  @java.lang.Override
  public common.agriaku.grpc_kotlin_test_app.NonPrimitiveName getNames(int index) {
    return names_.get(index);
  }
  /**
   * <code>repeated .NonPrimitiveName names = 1;</code>
   */
  @java.lang.Override
  public common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder getNamesOrBuilder(
      int index) {
    return names_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < names_.size(); i++) {
      output.writeMessage(1, names_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < names_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, names_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList)) {
      return super.equals(obj);
    }
    common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList other = (common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList) obj;

    if (!getNamesList()
        .equals(other.getNamesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HelloRequestNonPrimitiveList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HelloRequestNonPrimitiveList)
      common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.internal_static_HelloRequestNonPrimitiveList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.internal_static_HelloRequestNonPrimitiveList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.class, common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.Builder.class);
    }

    // Construct using common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (namesBuilder_ == null) {
        names_ = java.util.Collections.emptyList();
      } else {
        names_ = null;
        namesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.internal_static_HelloRequestNonPrimitiveList_descriptor;
    }

    @java.lang.Override
    public common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList getDefaultInstanceForType() {
      return common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.getDefaultInstance();
    }

    @java.lang.Override
    public common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList build() {
      common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList buildPartial() {
      common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList result = new common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList result) {
      if (namesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          names_ = java.util.Collections.unmodifiableList(names_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.names_ = names_;
      } else {
        result.names_ = namesBuilder_.build();
      }
    }

    private void buildPartial0(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList) {
        return mergeFrom((common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList other) {
      if (other == common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.getDefaultInstance()) return this;
      if (namesBuilder_ == null) {
        if (!other.names_.isEmpty()) {
          if (names_.isEmpty()) {
            names_ = other.names_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNamesIsMutable();
            names_.addAll(other.names_);
          }
          onChanged();
        }
      } else {
        if (!other.names_.isEmpty()) {
          if (namesBuilder_.isEmpty()) {
            namesBuilder_.dispose();
            namesBuilder_ = null;
            names_ = other.names_;
            bitField0_ = (bitField0_ & ~0x00000001);
            namesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNamesFieldBuilder() : null;
          } else {
            namesBuilder_.addAllMessages(other.names_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              common.agriaku.grpc_kotlin_test_app.NonPrimitiveName m =
                  input.readMessage(
                      common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.parser(),
                      extensionRegistry);
              if (namesBuilder_ == null) {
                ensureNamesIsMutable();
                names_.add(m);
              } else {
                namesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName> names_ =
      java.util.Collections.emptyList();
    private void ensureNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        names_ = new java.util.ArrayList<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName>(names_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        common.agriaku.grpc_kotlin_test_app.NonPrimitiveName, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder, common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder> namesBuilder_;

    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public java.util.List<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName> getNamesList() {
      if (namesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(names_);
      } else {
        return namesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public int getNamesCount() {
      if (namesBuilder_ == null) {
        return names_.size();
      } else {
        return namesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public common.agriaku.grpc_kotlin_test_app.NonPrimitiveName getNames(int index) {
      if (namesBuilder_ == null) {
        return names_.get(index);
      } else {
        return namesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder setNames(
        int index, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName value) {
      if (namesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamesIsMutable();
        names_.set(index, value);
        onChanged();
      } else {
        namesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder setNames(
        int index, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder builderForValue) {
      if (namesBuilder_ == null) {
        ensureNamesIsMutable();
        names_.set(index, builderForValue.build());
        onChanged();
      } else {
        namesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder addNames(common.agriaku.grpc_kotlin_test_app.NonPrimitiveName value) {
      if (namesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamesIsMutable();
        names_.add(value);
        onChanged();
      } else {
        namesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder addNames(
        int index, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName value) {
      if (namesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamesIsMutable();
        names_.add(index, value);
        onChanged();
      } else {
        namesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder addNames(
        common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder builderForValue) {
      if (namesBuilder_ == null) {
        ensureNamesIsMutable();
        names_.add(builderForValue.build());
        onChanged();
      } else {
        namesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder addNames(
        int index, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder builderForValue) {
      if (namesBuilder_ == null) {
        ensureNamesIsMutable();
        names_.add(index, builderForValue.build());
        onChanged();
      } else {
        namesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder addAllNames(
        java.lang.Iterable<? extends common.agriaku.grpc_kotlin_test_app.NonPrimitiveName> values) {
      if (namesBuilder_ == null) {
        ensureNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, names_);
        onChanged();
      } else {
        namesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder clearNames() {
      if (namesBuilder_ == null) {
        names_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        namesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public Builder removeNames(int index) {
      if (namesBuilder_ == null) {
        ensureNamesIsMutable();
        names_.remove(index);
        onChanged();
      } else {
        namesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder getNamesBuilder(
        int index) {
      return getNamesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder getNamesOrBuilder(
        int index) {
      if (namesBuilder_ == null) {
        return names_.get(index);  } else {
        return namesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public java.util.List<? extends common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder> 
         getNamesOrBuilderList() {
      if (namesBuilder_ != null) {
        return namesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(names_);
      }
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder addNamesBuilder() {
      return getNamesFieldBuilder().addBuilder(
          common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.getDefaultInstance());
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder addNamesBuilder(
        int index) {
      return getNamesFieldBuilder().addBuilder(
          index, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.getDefaultInstance());
    }
    /**
     * <code>repeated .NonPrimitiveName names = 1;</code>
     */
    public java.util.List<common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder> 
         getNamesBuilderList() {
      return getNamesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        common.agriaku.grpc_kotlin_test_app.NonPrimitiveName, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder, common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder> 
        getNamesFieldBuilder() {
      if (namesBuilder_ == null) {
        namesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            common.agriaku.grpc_kotlin_test_app.NonPrimitiveName, common.agriaku.grpc_kotlin_test_app.NonPrimitiveName.Builder, common.agriaku.grpc_kotlin_test_app.NonPrimitiveNameOrBuilder>(
                names_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        names_ = null;
      }
      return namesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HelloRequestNonPrimitiveList)
  }

  // @@protoc_insertion_point(class_scope:HelloRequestNonPrimitiveList)
  private static final common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList();
  }

  public static common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloRequestNonPrimitiveList>
      PARSER = new com.google.protobuf.AbstractParser<HelloRequestNonPrimitiveList>() {
    @java.lang.Override
    public HelloRequestNonPrimitiveList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HelloRequestNonPrimitiveList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloRequestNonPrimitiveList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

