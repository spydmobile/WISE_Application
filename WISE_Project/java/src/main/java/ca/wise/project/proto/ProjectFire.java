// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: projectIgnition.proto

package ca.wise.project.proto;

/**
 * Protobuf type {@code WISE.ProjectProto.ProjectFire}
 */
@java.lang.Deprecated public final class ProjectFire extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WISE.ProjectProto.ProjectFire)
    ProjectFireOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectFire.newBuilder() to construct.
  private ProjectFire(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectFire() {
    name_ = "";
    comments_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProjectFire();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProjectFire(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            version_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            comments_ = s;
            break;
          }
          case 32: {

            color_ = input.readUInt32();
            break;
          }
          case 40: {

            fillColor_ = input.readUInt32();
            break;
          }
          case 48: {

            size_ = input.readUInt32();
            break;
          }
          case 56: {

            imported_ = input.readBool();
            break;
          }
          case 64: {

            symbol_ = input.readUInt32();
            break;
          }
          case 74: {
            ca.wise.fire.proto.CwfgmIgnition.Builder subBuilder = null;
            if (ignition_ != null) {
              subBuilder = ignition_.toBuilder();
            }
            ignition_ = input.readMessage(ca.wise.fire.proto.CwfgmIgnition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ignition_);
              ignition_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ca.wise.project.proto.ProjectIgnition.internal_static_WISE_ProjectProto_ProjectFire_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ca.wise.project.proto.ProjectIgnition.internal_static_WISE_ProjectProto_ProjectFire_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ca.wise.project.proto.ProjectFire.class, ca.wise.project.proto.ProjectFire.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENTS_FIELD_NUMBER = 3;
  private volatile java.lang.Object comments_;
  /**
   * <code>string comments = 3;</code>
   * @return The comments.
   */
  @java.lang.Override
  public java.lang.String getComments() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comments_ = s;
      return s;
    }
  }
  /**
   * <code>string comments = 3;</code>
   * @return The bytes for comments.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentsBytes() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comments_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLOR_FIELD_NUMBER = 4;
  private int color_;
  /**
   * <code>uint32 color = 4;</code>
   * @return The color.
   */
  @java.lang.Override
  public int getColor() {
    return color_;
  }

  public static final int FILLCOLOR_FIELD_NUMBER = 5;
  private int fillColor_;
  /**
   * <code>uint32 fillColor = 5;</code>
   * @return The fillColor.
   */
  @java.lang.Override
  public int getFillColor() {
    return fillColor_;
  }

  public static final int SIZE_FIELD_NUMBER = 6;
  private int size_;
  /**
   * <code>uint32 size = 6;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int IMPORTED_FIELD_NUMBER = 7;
  private boolean imported_;
  /**
   * <code>bool imported = 7;</code>
   * @return The imported.
   */
  @java.lang.Override
  public boolean getImported() {
    return imported_;
  }

  public static final int SYMBOL_FIELD_NUMBER = 8;
  private int symbol_;
  /**
   * <code>uint32 symbol = 8;</code>
   * @return The symbol.
   */
  @java.lang.Override
  public int getSymbol() {
    return symbol_;
  }

  public static final int IGNITION_FIELD_NUMBER = 9;
  private ca.wise.fire.proto.CwfgmIgnition ignition_;
  /**
   * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
   * @return Whether the ignition field is set.
   */
  @java.lang.Override
  public boolean hasIgnition() {
    return ignition_ != null;
  }
  /**
   * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
   * @return The ignition.
   */
  @java.lang.Override
  public ca.wise.fire.proto.CwfgmIgnition getIgnition() {
    return ignition_ == null ? ca.wise.fire.proto.CwfgmIgnition.getDefaultInstance() : ignition_;
  }
  /**
   * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
   */
  @java.lang.Override
  public ca.wise.fire.proto.CwfgmIgnitionOrBuilder getIgnitionOrBuilder() {
    return getIgnition();
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
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getCommentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, comments_);
    }
    if (color_ != 0) {
      output.writeUInt32(4, color_);
    }
    if (fillColor_ != 0) {
      output.writeUInt32(5, fillColor_);
    }
    if (size_ != 0) {
      output.writeUInt32(6, size_);
    }
    if (imported_ != false) {
      output.writeBool(7, imported_);
    }
    if (symbol_ != 0) {
      output.writeUInt32(8, symbol_);
    }
    if (ignition_ != null) {
      output.writeMessage(9, getIgnition());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getCommentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, comments_);
    }
    if (color_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, color_);
    }
    if (fillColor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, fillColor_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, size_);
    }
    if (imported_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, imported_);
    }
    if (symbol_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, symbol_);
    }
    if (ignition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getIgnition());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ca.wise.project.proto.ProjectFire)) {
      return super.equals(obj);
    }
    ca.wise.project.proto.ProjectFire other = (ca.wise.project.proto.ProjectFire) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getComments()
        .equals(other.getComments())) return false;
    if (getColor()
        != other.getColor()) return false;
    if (getFillColor()
        != other.getFillColor()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getImported()
        != other.getImported()) return false;
    if (getSymbol()
        != other.getSymbol()) return false;
    if (hasIgnition() != other.hasIgnition()) return false;
    if (hasIgnition()) {
      if (!getIgnition()
          .equals(other.getIgnition())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getComments().hashCode();
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor();
    hash = (37 * hash) + FILLCOLOR_FIELD_NUMBER;
    hash = (53 * hash) + getFillColor();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + IMPORTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getImported());
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol();
    if (hasIgnition()) {
      hash = (37 * hash) + IGNITION_FIELD_NUMBER;
      hash = (53 * hash) + getIgnition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ca.wise.project.proto.ProjectFire parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ca.wise.project.proto.ProjectFire parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ca.wise.project.proto.ProjectFire parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ca.wise.project.proto.ProjectFire parseFrom(
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
  public static Builder newBuilder(ca.wise.project.proto.ProjectFire prototype) {
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
   * Protobuf type {@code WISE.ProjectProto.ProjectFire}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WISE.ProjectProto.ProjectFire)
      ca.wise.project.proto.ProjectFireOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ca.wise.project.proto.ProjectIgnition.internal_static_WISE_ProjectProto_ProjectFire_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ca.wise.project.proto.ProjectIgnition.internal_static_WISE_ProjectProto_ProjectFire_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ca.wise.project.proto.ProjectFire.class, ca.wise.project.proto.ProjectFire.Builder.class);
    }

    // Construct using ca.wise.project.proto.ProjectFire.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = 0;

      name_ = "";

      comments_ = "";

      color_ = 0;

      fillColor_ = 0;

      size_ = 0;

      imported_ = false;

      symbol_ = 0;

      if (ignitionBuilder_ == null) {
        ignition_ = null;
      } else {
        ignition_ = null;
        ignitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ca.wise.project.proto.ProjectIgnition.internal_static_WISE_ProjectProto_ProjectFire_descriptor;
    }

    @java.lang.Override
    public ca.wise.project.proto.ProjectFire getDefaultInstanceForType() {
      return ca.wise.project.proto.ProjectFire.getDefaultInstance();
    }

    @java.lang.Override
    public ca.wise.project.proto.ProjectFire build() {
      ca.wise.project.proto.ProjectFire result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ca.wise.project.proto.ProjectFire buildPartial() {
      ca.wise.project.proto.ProjectFire result = new ca.wise.project.proto.ProjectFire(this);
      result.version_ = version_;
      result.name_ = name_;
      result.comments_ = comments_;
      result.color_ = color_;
      result.fillColor_ = fillColor_;
      result.size_ = size_;
      result.imported_ = imported_;
      result.symbol_ = symbol_;
      if (ignitionBuilder_ == null) {
        result.ignition_ = ignition_;
      } else {
        result.ignition_ = ignitionBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof ca.wise.project.proto.ProjectFire) {
        return mergeFrom((ca.wise.project.proto.ProjectFire)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ca.wise.project.proto.ProjectFire other) {
      if (other == ca.wise.project.proto.ProjectFire.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getComments().isEmpty()) {
        comments_ = other.comments_;
        onChanged();
      }
      if (other.getColor() != 0) {
        setColor(other.getColor());
      }
      if (other.getFillColor() != 0) {
        setFillColor(other.getFillColor());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getImported() != false) {
        setImported(other.getImported());
      }
      if (other.getSymbol() != 0) {
        setSymbol(other.getSymbol());
      }
      if (other.hasIgnition()) {
        mergeIgnition(other.getIgnition());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ca.wise.project.proto.ProjectFire parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ca.wise.project.proto.ProjectFire) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <code>int32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object comments_ = "";
    /**
     * <code>string comments = 3;</code>
     * @return The comments.
     */
    public java.lang.String getComments() {
      java.lang.Object ref = comments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string comments = 3;</code>
     * @return The bytes for comments.
     */
    public com.google.protobuf.ByteString
        getCommentsBytes() {
      java.lang.Object ref = comments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string comments = 3;</code>
     * @param value The comments to set.
     * @return This builder for chaining.
     */
    public Builder setComments(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comments_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string comments = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearComments() {
      
      comments_ = getDefaultInstance().getComments();
      onChanged();
      return this;
    }
    /**
     * <code>string comments = 3;</code>
     * @param value The bytes for comments to set.
     * @return This builder for chaining.
     */
    public Builder setCommentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comments_ = value;
      onChanged();
      return this;
    }

    private int color_ ;
    /**
     * <code>uint32 color = 4;</code>
     * @return The color.
     */
    @java.lang.Override
    public int getColor() {
      return color_;
    }
    /**
     * <code>uint32 color = 4;</code>
     * @param value The color to set.
     * @return This builder for chaining.
     */
    public Builder setColor(int value) {
      
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 color = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearColor() {
      
      color_ = 0;
      onChanged();
      return this;
    }

    private int fillColor_ ;
    /**
     * <code>uint32 fillColor = 5;</code>
     * @return The fillColor.
     */
    @java.lang.Override
    public int getFillColor() {
      return fillColor_;
    }
    /**
     * <code>uint32 fillColor = 5;</code>
     * @param value The fillColor to set.
     * @return This builder for chaining.
     */
    public Builder setFillColor(int value) {
      
      fillColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fillColor = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFillColor() {
      
      fillColor_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>uint32 size = 6;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <code>uint32 size = 6;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private boolean imported_ ;
    /**
     * <code>bool imported = 7;</code>
     * @return The imported.
     */
    @java.lang.Override
    public boolean getImported() {
      return imported_;
    }
    /**
     * <code>bool imported = 7;</code>
     * @param value The imported to set.
     * @return This builder for chaining.
     */
    public Builder setImported(boolean value) {
      
      imported_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool imported = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearImported() {
      
      imported_ = false;
      onChanged();
      return this;
    }

    private int symbol_ ;
    /**
     * <code>uint32 symbol = 8;</code>
     * @return The symbol.
     */
    @java.lang.Override
    public int getSymbol() {
      return symbol_;
    }
    /**
     * <code>uint32 symbol = 8;</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(int value) {
      
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 symbol = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      
      symbol_ = 0;
      onChanged();
      return this;
    }

    private ca.wise.fire.proto.CwfgmIgnition ignition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ca.wise.fire.proto.CwfgmIgnition, ca.wise.fire.proto.CwfgmIgnition.Builder, ca.wise.fire.proto.CwfgmIgnitionOrBuilder> ignitionBuilder_;
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     * @return Whether the ignition field is set.
     */
    public boolean hasIgnition() {
      return ignitionBuilder_ != null || ignition_ != null;
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     * @return The ignition.
     */
    public ca.wise.fire.proto.CwfgmIgnition getIgnition() {
      if (ignitionBuilder_ == null) {
        return ignition_ == null ? ca.wise.fire.proto.CwfgmIgnition.getDefaultInstance() : ignition_;
      } else {
        return ignitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public Builder setIgnition(ca.wise.fire.proto.CwfgmIgnition value) {
      if (ignitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ignition_ = value;
        onChanged();
      } else {
        ignitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public Builder setIgnition(
        ca.wise.fire.proto.CwfgmIgnition.Builder builderForValue) {
      if (ignitionBuilder_ == null) {
        ignition_ = builderForValue.build();
        onChanged();
      } else {
        ignitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public Builder mergeIgnition(ca.wise.fire.proto.CwfgmIgnition value) {
      if (ignitionBuilder_ == null) {
        if (ignition_ != null) {
          ignition_ =
            ca.wise.fire.proto.CwfgmIgnition.newBuilder(ignition_).mergeFrom(value).buildPartial();
        } else {
          ignition_ = value;
        }
        onChanged();
      } else {
        ignitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public Builder clearIgnition() {
      if (ignitionBuilder_ == null) {
        ignition_ = null;
        onChanged();
      } else {
        ignition_ = null;
        ignitionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public ca.wise.fire.proto.CwfgmIgnition.Builder getIgnitionBuilder() {
      
      onChanged();
      return getIgnitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    public ca.wise.fire.proto.CwfgmIgnitionOrBuilder getIgnitionOrBuilder() {
      if (ignitionBuilder_ != null) {
        return ignitionBuilder_.getMessageOrBuilder();
      } else {
        return ignition_ == null ?
            ca.wise.fire.proto.CwfgmIgnition.getDefaultInstance() : ignition_;
      }
    }
    /**
     * <code>.WISE.FireEngineProto.CwfgmIgnition ignition = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ca.wise.fire.proto.CwfgmIgnition, ca.wise.fire.proto.CwfgmIgnition.Builder, ca.wise.fire.proto.CwfgmIgnitionOrBuilder> 
        getIgnitionFieldBuilder() {
      if (ignitionBuilder_ == null) {
        ignitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ca.wise.fire.proto.CwfgmIgnition, ca.wise.fire.proto.CwfgmIgnition.Builder, ca.wise.fire.proto.CwfgmIgnitionOrBuilder>(
                getIgnition(),
                getParentForChildren(),
                isClean());
        ignition_ = null;
      }
      return ignitionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:WISE.ProjectProto.ProjectFire)
  }

  // @@protoc_insertion_point(class_scope:WISE.ProjectProto.ProjectFire)
  private static final ca.wise.project.proto.ProjectFire DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ca.wise.project.proto.ProjectFire();
  }

  public static ca.wise.project.proto.ProjectFire getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectFire>
      PARSER = new com.google.protobuf.AbstractParser<ProjectFire>() {
    @java.lang.Override
    public ProjectFire parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProjectFire(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectFire> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectFire> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ca.wise.project.proto.ProjectFire getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
