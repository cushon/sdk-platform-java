// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * Response message for reporting on a session.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.ReportSessionResponse}
 */
public final class ReportSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.ReportSessionResponse)
    ReportSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportSessionResponse.newBuilder() to construct.
  private ReportSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportSessionResponse() {
    result_ = 0;
    testRuns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportSessionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              testRuns_ = new java.util.ArrayList<com.google.showcase.v1beta1.TestRun>();
              mutable_bitField0_ |= 0x00000001;
            }
            testRuns_.add(
                input.readMessage(com.google.showcase.v1beta1.TestRun.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        testRuns_ = java.util.Collections.unmodifiableList(testRuns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ReportSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ReportSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.ReportSessionResponse.class, com.google.showcase.v1beta1.ReportSessionResponse.Builder.class);
  }

  /**
   * <pre>
   * The topline state of the report.
   * </pre>
   *
   * Protobuf enum {@code google.showcase.v1beta1.ReportSessionResponse.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RESULT_UNSPECIFIED = 0;</code>
     */
    RESULT_UNSPECIFIED(0),
    /**
     * <pre>
     * The session is complete, and everything passed.
     * </pre>
     *
     * <code>PASSED = 1;</code>
     */
    PASSED(1),
    /**
     * <pre>
     * The session had an explicit failure.
     * </pre>
     *
     * <code>FAILED = 2;</code>
     */
    FAILED(2),
    /**
     * <pre>
     * The session is incomplete. This is a failure response.
     * </pre>
     *
     * <code>INCOMPLETE = 3;</code>
     */
    INCOMPLETE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RESULT_UNSPECIFIED = 0;</code>
     */
    public static final int RESULT_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The session is complete, and everything passed.
     * </pre>
     *
     * <code>PASSED = 1;</code>
     */
    public static final int PASSED_VALUE = 1;
    /**
     * <pre>
     * The session had an explicit failure.
     * </pre>
     *
     * <code>FAILED = 2;</code>
     */
    public static final int FAILED_VALUE = 2;
    /**
     * <pre>
     * The session is incomplete. This is a failure response.
     * </pre>
     *
     * <code>INCOMPLETE = 3;</code>
     */
    public static final int INCOMPLETE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return RESULT_UNSPECIFIED;
        case 1: return PASSED;
        case 2: return FAILED;
        case 3: return INCOMPLETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.ReportSessionResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.showcase.v1beta1.ReportSessionResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <pre>
   * The state of the report.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <pre>
   * The state of the report.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public com.google.showcase.v1beta1.ReportSessionResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    com.google.showcase.v1beta1.ReportSessionResponse.Result result = com.google.showcase.v1beta1.ReportSessionResponse.Result.valueOf(result_);
    return result == null ? com.google.showcase.v1beta1.ReportSessionResponse.Result.UNRECOGNIZED : result;
  }

  public static final int TEST_RUNS_FIELD_NUMBER = 2;
  private java.util.List<com.google.showcase.v1beta1.TestRun> testRuns_;
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.showcase.v1beta1.TestRun> getTestRunsList() {
    return testRuns_;
  }
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.showcase.v1beta1.TestRunOrBuilder> 
      getTestRunsOrBuilderList() {
    return testRuns_;
  }
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  @java.lang.Override
  public int getTestRunsCount() {
    return testRuns_.size();
  }
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.TestRun getTestRuns(int index) {
    return testRuns_.get(index);
  }
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.TestRunOrBuilder getTestRunsOrBuilder(
      int index) {
    return testRuns_.get(index);
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
    if (result_ != com.google.showcase.v1beta1.ReportSessionResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, result_);
    }
    for (int i = 0; i < testRuns_.size(); i++) {
      output.writeMessage(2, testRuns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != com.google.showcase.v1beta1.ReportSessionResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    for (int i = 0; i < testRuns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, testRuns_.get(i));
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
    if (!(obj instanceof com.google.showcase.v1beta1.ReportSessionResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.ReportSessionResponse other = (com.google.showcase.v1beta1.ReportSessionResponse) obj;

    if (result_ != other.result_) return false;
    if (!getTestRunsList()
        .equals(other.getTestRunsList())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (getTestRunsCount() > 0) {
      hash = (37 * hash) + TEST_RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getTestRunsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ReportSessionResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.ReportSessionResponse prototype) {
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
   * <pre>
   * Response message for reporting on a session.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.ReportSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.ReportSessionResponse)
      com.google.showcase.v1beta1.ReportSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ReportSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ReportSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.ReportSessionResponse.class, com.google.showcase.v1beta1.ReportSessionResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.ReportSessionResponse.newBuilder()
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
        getTestRunsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (testRunsBuilder_ == null) {
        testRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        testRunsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ReportSessionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ReportSessionResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.ReportSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ReportSessionResponse build() {
      com.google.showcase.v1beta1.ReportSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ReportSessionResponse buildPartial() {
      com.google.showcase.v1beta1.ReportSessionResponse result = new com.google.showcase.v1beta1.ReportSessionResponse(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (testRunsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          testRuns_ = java.util.Collections.unmodifiableList(testRuns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.testRuns_ = testRuns_;
      } else {
        result.testRuns_ = testRunsBuilder_.build();
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
      if (other instanceof com.google.showcase.v1beta1.ReportSessionResponse) {
        return mergeFrom((com.google.showcase.v1beta1.ReportSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.ReportSessionResponse other) {
      if (other == com.google.showcase.v1beta1.ReportSessionResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (testRunsBuilder_ == null) {
        if (!other.testRuns_.isEmpty()) {
          if (testRuns_.isEmpty()) {
            testRuns_ = other.testRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTestRunsIsMutable();
            testRuns_.addAll(other.testRuns_);
          }
          onChanged();
        }
      } else {
        if (!other.testRuns_.isEmpty()) {
          if (testRunsBuilder_.isEmpty()) {
            testRunsBuilder_.dispose();
            testRunsBuilder_ = null;
            testRuns_ = other.testRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            testRunsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestRunsFieldBuilder() : null;
          } else {
            testRunsBuilder_.addAllMessages(other.testRuns_);
          }
        }
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
      com.google.showcase.v1beta1.ReportSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.showcase.v1beta1.ReportSessionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <pre>
     * The state of the report.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <pre>
     * The state of the report.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the report.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public com.google.showcase.v1beta1.ReportSessionResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      com.google.showcase.v1beta1.ReportSessionResponse.Result result = com.google.showcase.v1beta1.ReportSessionResponse.Result.valueOf(result_);
      return result == null ? com.google.showcase.v1beta1.ReportSessionResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state of the report.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(com.google.showcase.v1beta1.ReportSessionResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the report.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.showcase.v1beta1.TestRun> testRuns_ =
      java.util.Collections.emptyList();
    private void ensureTestRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testRuns_ = new java.util.ArrayList<com.google.showcase.v1beta1.TestRun>(testRuns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.TestRun, com.google.showcase.v1beta1.TestRun.Builder, com.google.showcase.v1beta1.TestRunOrBuilder> testRunsBuilder_;

    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.TestRun> getTestRunsList() {
      if (testRunsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(testRuns_);
      } else {
        return testRunsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public int getTestRunsCount() {
      if (testRunsBuilder_ == null) {
        return testRuns_.size();
      } else {
        return testRunsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public com.google.showcase.v1beta1.TestRun getTestRuns(int index) {
      if (testRunsBuilder_ == null) {
        return testRuns_.get(index);
      } else {
        return testRunsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder setTestRuns(
        int index, com.google.showcase.v1beta1.TestRun value) {
      if (testRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestRunsIsMutable();
        testRuns_.set(index, value);
        onChanged();
      } else {
        testRunsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder setTestRuns(
        int index, com.google.showcase.v1beta1.TestRun.Builder builderForValue) {
      if (testRunsBuilder_ == null) {
        ensureTestRunsIsMutable();
        testRuns_.set(index, builderForValue.build());
        onChanged();
      } else {
        testRunsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder addTestRuns(com.google.showcase.v1beta1.TestRun value) {
      if (testRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestRunsIsMutable();
        testRuns_.add(value);
        onChanged();
      } else {
        testRunsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder addTestRuns(
        int index, com.google.showcase.v1beta1.TestRun value) {
      if (testRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestRunsIsMutable();
        testRuns_.add(index, value);
        onChanged();
      } else {
        testRunsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder addTestRuns(
        com.google.showcase.v1beta1.TestRun.Builder builderForValue) {
      if (testRunsBuilder_ == null) {
        ensureTestRunsIsMutable();
        testRuns_.add(builderForValue.build());
        onChanged();
      } else {
        testRunsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder addTestRuns(
        int index, com.google.showcase.v1beta1.TestRun.Builder builderForValue) {
      if (testRunsBuilder_ == null) {
        ensureTestRunsIsMutable();
        testRuns_.add(index, builderForValue.build());
        onChanged();
      } else {
        testRunsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder addAllTestRuns(
        java.lang.Iterable<? extends com.google.showcase.v1beta1.TestRun> values) {
      if (testRunsBuilder_ == null) {
        ensureTestRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, testRuns_);
        onChanged();
      } else {
        testRunsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder clearTestRuns() {
      if (testRunsBuilder_ == null) {
        testRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testRunsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public Builder removeTestRuns(int index) {
      if (testRunsBuilder_ == null) {
        ensureTestRunsIsMutable();
        testRuns_.remove(index);
        onChanged();
      } else {
        testRunsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public com.google.showcase.v1beta1.TestRun.Builder getTestRunsBuilder(
        int index) {
      return getTestRunsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public com.google.showcase.v1beta1.TestRunOrBuilder getTestRunsOrBuilder(
        int index) {
      if (testRunsBuilder_ == null) {
        return testRuns_.get(index);  } else {
        return testRunsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public java.util.List<? extends com.google.showcase.v1beta1.TestRunOrBuilder> 
         getTestRunsOrBuilderList() {
      if (testRunsBuilder_ != null) {
        return testRunsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(testRuns_);
      }
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public com.google.showcase.v1beta1.TestRun.Builder addTestRunsBuilder() {
      return getTestRunsFieldBuilder().addBuilder(
          com.google.showcase.v1beta1.TestRun.getDefaultInstance());
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public com.google.showcase.v1beta1.TestRun.Builder addTestRunsBuilder(
        int index) {
      return getTestRunsFieldBuilder().addBuilder(
          index, com.google.showcase.v1beta1.TestRun.getDefaultInstance());
    }
    /**
     * <pre>
     * The test runs of this session.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.TestRun.Builder> 
         getTestRunsBuilderList() {
      return getTestRunsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.TestRun, com.google.showcase.v1beta1.TestRun.Builder, com.google.showcase.v1beta1.TestRunOrBuilder> 
        getTestRunsFieldBuilder() {
      if (testRunsBuilder_ == null) {
        testRunsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.showcase.v1beta1.TestRun, com.google.showcase.v1beta1.TestRun.Builder, com.google.showcase.v1beta1.TestRunOrBuilder>(
                testRuns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        testRuns_ = null;
      }
      return testRunsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.ReportSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.ReportSessionResponse)
  private static final com.google.showcase.v1beta1.ReportSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.ReportSessionResponse();
  }

  public static com.google.showcase.v1beta1.ReportSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReportSessionResponse>() {
    @java.lang.Override
    public ReportSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.ReportSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
