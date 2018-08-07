/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_created;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Promotion extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7812422480224372720L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Promotion\",\"namespace\":\"com.pickme.events.trip.trip_created\",\"fields\":[{\"name\":\"code\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Promotion> ENCODER =
      new BinaryMessageEncoder<Promotion>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Promotion> DECODER =
      new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Promotion> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Promotion> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Promotion to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Promotion from a ByteBuffer. */
  public static Promotion fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence code;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Promotion() {}

  /**
   * All-args constructor.
   * @param code The new value for code
   */
  public Promotion(java.lang.CharSequence code) {
    this.code = code;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return code;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: code = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Creates a new Promotion RecordBuilder.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Promotion.Builder newBuilder() {
    return new com.pickme.events.trip.trip_created.Promotion.Builder();
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Promotion.Builder newBuilder(com.pickme.events.trip.trip_created.Promotion.Builder other) {
    return new com.pickme.events.trip.trip_created.Promotion.Builder(other);
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Promotion instance.
   * @param other The existing instance to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Promotion.Builder newBuilder(com.pickme.events.trip.trip_created.Promotion other) {
    return new com.pickme.events.trip.trip_created.Promotion.Builder(other);
  }

  /**
   * RecordBuilder for Promotion instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Promotion>
    implements org.apache.avro.data.RecordBuilder<Promotion> {

    private java.lang.CharSequence code;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Promotion.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Promotion instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Promotion other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }

    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Promotion.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Promotion.Builder clearCode() {
      code = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Promotion build() {
      try {
        Promotion record = new Promotion();
        record.code = fieldSetFlags()[0] ? this.code : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Promotion>
    WRITER$ = (org.apache.avro.io.DatumWriter<Promotion>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Promotion>
    READER$ = (org.apache.avro.io.DatumReader<Promotion>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
