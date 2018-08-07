/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DriverAssigned extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4672284148440201311L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DriverAssigned\",\"namespace\":\"com.pickme.events.trip\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"body\",\"type\":{\"type\":\"record\",\"name\":\"Body\",\"namespace\":\"com.pickme.events.trip.driver_assigned\",\"fields\":[{\"name\":\"trip_id\",\"type\":\"int\"},{\"name\":\"driver_id\",\"type\":\"int\"},{\"name\":\"eta\",\"type\":\"double\"},{\"name\":\"vehicle_type\",\"type\":\"int\"},{\"name\":\"selection_type\",\"type\":\"int\"}]}},{\"name\":\"created_at\",\"type\":\"long\"},{\"name\":\"expiry\",\"type\":\"long\",\"default\":0},{\"name\":\"version\",\"type\":\"int\",\"default\":0},{\"name\":\"trace_info\",\"type\":{\"type\":\"record\",\"name\":\"TraceInfo\",\"fields\":[{\"name\":\"trace_id\",\"type\":{\"type\":\"record\",\"name\":\"TraceId\",\"fields\":[{\"name\":\"high\",\"type\":\"long\",\"default\":0},{\"name\":\"low\",\"type\":\"long\",\"default\":0}]}},{\"name\":\"span_id\",\"type\":\"long\",\"default\":0},{\"name\":\"parent_id\",\"type\":\"long\",\"default\":0},{\"name\":\"sampled\",\"type\":\"boolean\",\"default\":false}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DriverAssigned> ENCODER =
      new BinaryMessageEncoder<DriverAssigned>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DriverAssigned> DECODER =
      new BinaryMessageDecoder<DriverAssigned>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DriverAssigned> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DriverAssigned> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DriverAssigned>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DriverAssigned to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DriverAssigned from a ByteBuffer. */
  public static DriverAssigned fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public com.pickme.events.trip.driver_assigned.Body body;
  @Deprecated public long created_at;
  @Deprecated public long expiry;
  @Deprecated public int version;
  @Deprecated public com.pickme.events.trip.TraceInfo trace_info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DriverAssigned() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param type The new value for type
   * @param body The new value for body
   * @param created_at The new value for created_at
   * @param expiry The new value for expiry
   * @param version The new value for version
   * @param trace_info The new value for trace_info
   */
  public DriverAssigned(java.lang.CharSequence id, java.lang.CharSequence type, com.pickme.events.trip.driver_assigned.Body body, java.lang.Long created_at, java.lang.Long expiry, java.lang.Integer version, com.pickme.events.trip.TraceInfo trace_info) {
    this.id = id;
    this.type = type;
    this.body = body;
    this.created_at = created_at;
    this.expiry = expiry;
    this.version = version;
    this.trace_info = trace_info;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return type;
    case 2: return body;
    case 3: return created_at;
    case 4: return expiry;
    case 5: return version;
    case 6: return trace_info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: type = (java.lang.CharSequence)value$; break;
    case 2: body = (com.pickme.events.trip.driver_assigned.Body)value$; break;
    case 3: created_at = (java.lang.Long)value$; break;
    case 4: expiry = (java.lang.Long)value$; break;
    case 5: version = (java.lang.Integer)value$; break;
    case 6: trace_info = (com.pickme.events.trip.TraceInfo)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'body' field.
   * @return The value of the 'body' field.
   */
  public com.pickme.events.trip.driver_assigned.Body getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(com.pickme.events.trip.driver_assigned.Body value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public java.lang.Long getCreatedAt() {
    return created_at;
  }

  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.Long value) {
    this.created_at = value;
  }

  /**
   * Gets the value of the 'expiry' field.
   * @return The value of the 'expiry' field.
   */
  public java.lang.Long getExpiry() {
    return expiry;
  }

  /**
   * Sets the value of the 'expiry' field.
   * @param value the value to set.
   */
  public void setExpiry(java.lang.Long value) {
    this.expiry = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'trace_info' field.
   * @return The value of the 'trace_info' field.
   */
  public com.pickme.events.trip.TraceInfo getTraceInfo() {
    return trace_info;
  }

  /**
   * Sets the value of the 'trace_info' field.
   * @param value the value to set.
   */
  public void setTraceInfo(com.pickme.events.trip.TraceInfo value) {
    this.trace_info = value;
  }

  /**
   * Creates a new DriverAssigned RecordBuilder.
   * @return A new DriverAssigned RecordBuilder
   */
  public static com.pickme.events.trip.DriverAssigned.Builder newBuilder() {
    return new com.pickme.events.trip.DriverAssigned.Builder();
  }

  /**
   * Creates a new DriverAssigned RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DriverAssigned RecordBuilder
   */
  public static com.pickme.events.trip.DriverAssigned.Builder newBuilder(com.pickme.events.trip.DriverAssigned.Builder other) {
    return new com.pickme.events.trip.DriverAssigned.Builder(other);
  }

  /**
   * Creates a new DriverAssigned RecordBuilder by copying an existing DriverAssigned instance.
   * @param other The existing instance to copy.
   * @return A new DriverAssigned RecordBuilder
   */
  public static com.pickme.events.trip.DriverAssigned.Builder newBuilder(com.pickme.events.trip.DriverAssigned other) {
    return new com.pickme.events.trip.DriverAssigned.Builder(other);
  }

  /**
   * RecordBuilder for DriverAssigned instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DriverAssigned>
    implements org.apache.avro.data.RecordBuilder<DriverAssigned> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence type;
    private com.pickme.events.trip.driver_assigned.Body body;
    private com.pickme.events.trip.driver_assigned.Body.Builder bodyBuilder;
    private long created_at;
    private long expiry;
    private int version;
    private com.pickme.events.trip.TraceInfo trace_info;
    private com.pickme.events.trip.TraceInfo.Builder trace_infoBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.DriverAssigned.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
      if (other.hasBodyBuilder()) {
        this.bodyBuilder = com.pickme.events.trip.driver_assigned.Body.newBuilder(other.getBodyBuilder());
      }
      if (isValidValue(fields()[3], other.created_at)) {
        this.created_at = data().deepCopy(fields()[3].schema(), other.created_at);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiry)) {
        this.expiry = data().deepCopy(fields()[4].schema(), other.expiry);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.version)) {
        this.version = data().deepCopy(fields()[5].schema(), other.version);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.trace_info)) {
        this.trace_info = data().deepCopy(fields()[6].schema(), other.trace_info);
        fieldSetFlags()[6] = true;
      }
      if (other.hasTraceInfoBuilder()) {
        this.trace_infoBuilder = com.pickme.events.trip.TraceInfo.newBuilder(other.getTraceInfoBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DriverAssigned instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.DriverAssigned other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
      this.bodyBuilder = null;
      if (isValidValue(fields()[3], other.created_at)) {
        this.created_at = data().deepCopy(fields()[3].schema(), other.created_at);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiry)) {
        this.expiry = data().deepCopy(fields()[4].schema(), other.expiry);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.version)) {
        this.version = data().deepCopy(fields()[5].schema(), other.version);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.trace_info)) {
        this.trace_info = data().deepCopy(fields()[6].schema(), other.trace_info);
        fieldSetFlags()[6] = true;
      }
      this.trace_infoBuilder = null;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'body' field.
      * @return The value.
      */
    public com.pickme.events.trip.driver_assigned.Body getBody() {
      return body;
    }

    /**
      * Sets the value of the 'body' field.
      * @param value The value of 'body'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setBody(com.pickme.events.trip.driver_assigned.Body value) {
      validate(fields()[2], value);
      this.bodyBuilder = null;
      this.body = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'body' field has been set.
      * @return True if the 'body' field has been set, false otherwise.
      */
    public boolean hasBody() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'body' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.pickme.events.trip.driver_assigned.Body.Builder getBodyBuilder() {
      if (bodyBuilder == null) {
        if (hasBody()) {
          setBodyBuilder(com.pickme.events.trip.driver_assigned.Body.newBuilder(body));
        } else {
          setBodyBuilder(com.pickme.events.trip.driver_assigned.Body.newBuilder());
        }
      }
      return bodyBuilder;
    }

    /**
     * Sets the Builder instance for the 'body' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.pickme.events.trip.DriverAssigned.Builder setBodyBuilder(com.pickme.events.trip.driver_assigned.Body.Builder value) {
      clearBody();
      bodyBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'body' field has an active Builder instance
     * @return True if the 'body' field has an active Builder instance
     */
    public boolean hasBodyBuilder() {
      return bodyBuilder != null;
    }

    /**
      * Clears the value of the 'body' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearBody() {
      body = null;
      bodyBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public java.lang.Long getCreatedAt() {
      return created_at;
    }

    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setCreatedAt(long value) {
      validate(fields()[3], value);
      this.created_at = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearCreatedAt() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'expiry' field.
      * @return The value.
      */
    public java.lang.Long getExpiry() {
      return expiry;
    }

    /**
      * Sets the value of the 'expiry' field.
      * @param value The value of 'expiry'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setExpiry(long value) {
      validate(fields()[4], value);
      this.expiry = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'expiry' field has been set.
      * @return True if the 'expiry' field has been set, false otherwise.
      */
    public boolean hasExpiry() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'expiry' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearExpiry() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.Integer getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setVersion(int value) {
      validate(fields()[5], value);
      this.version = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearVersion() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'trace_info' field.
      * @return The value.
      */
    public com.pickme.events.trip.TraceInfo getTraceInfo() {
      return trace_info;
    }

    /**
      * Sets the value of the 'trace_info' field.
      * @param value The value of 'trace_info'.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder setTraceInfo(com.pickme.events.trip.TraceInfo value) {
      validate(fields()[6], value);
      this.trace_infoBuilder = null;
      this.trace_info = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'trace_info' field has been set.
      * @return True if the 'trace_info' field has been set, false otherwise.
      */
    public boolean hasTraceInfo() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'trace_info' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.pickme.events.trip.TraceInfo.Builder getTraceInfoBuilder() {
      if (trace_infoBuilder == null) {
        if (hasTraceInfo()) {
          setTraceInfoBuilder(com.pickme.events.trip.TraceInfo.newBuilder(trace_info));
        } else {
          setTraceInfoBuilder(com.pickme.events.trip.TraceInfo.newBuilder());
        }
      }
      return trace_infoBuilder;
    }

    /**
     * Sets the Builder instance for the 'trace_info' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.pickme.events.trip.DriverAssigned.Builder setTraceInfoBuilder(com.pickme.events.trip.TraceInfo.Builder value) {
      clearTraceInfo();
      trace_infoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'trace_info' field has an active Builder instance
     * @return True if the 'trace_info' field has an active Builder instance
     */
    public boolean hasTraceInfoBuilder() {
      return trace_infoBuilder != null;
    }

    /**
      * Clears the value of the 'trace_info' field.
      * @return This builder.
      */
    public com.pickme.events.trip.DriverAssigned.Builder clearTraceInfo() {
      trace_info = null;
      trace_infoBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DriverAssigned build() {
      try {
        DriverAssigned record = new DriverAssigned();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (bodyBuilder != null) {
          record.body = this.bodyBuilder.build();
        } else {
          record.body = fieldSetFlags()[2] ? this.body : (com.pickme.events.trip.driver_assigned.Body) defaultValue(fields()[2]);
        }
        record.created_at = fieldSetFlags()[3] ? this.created_at : (java.lang.Long) defaultValue(fields()[3]);
        record.expiry = fieldSetFlags()[4] ? this.expiry : (java.lang.Long) defaultValue(fields()[4]);
        record.version = fieldSetFlags()[5] ? this.version : (java.lang.Integer) defaultValue(fields()[5]);
        if (trace_infoBuilder != null) {
          record.trace_info = this.trace_infoBuilder.build();
        } else {
          record.trace_info = fieldSetFlags()[6] ? this.trace_info : (com.pickme.events.trip.TraceInfo) defaultValue(fields()[6]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DriverAssigned>
    WRITER$ = (org.apache.avro.io.DatumWriter<DriverAssigned>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DriverAssigned>
    READER$ = (org.apache.avro.io.DatumReader<DriverAssigned>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
