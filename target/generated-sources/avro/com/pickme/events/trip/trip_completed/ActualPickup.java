/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_completed;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ActualPickup extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1149815504225658193L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ActualPickup\",\"namespace\":\"com.pickme.events.trip.trip_completed\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"lat\",\"type\":\"float\"},{\"name\":\"lng\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ActualPickup> ENCODER =
      new BinaryMessageEncoder<ActualPickup>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ActualPickup> DECODER =
      new BinaryMessageDecoder<ActualPickup>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ActualPickup> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ActualPickup> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ActualPickup>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ActualPickup to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ActualPickup from a ByteBuffer. */
  public static ActualPickup fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence address;
  @Deprecated public float lat;
  @Deprecated public float lng;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ActualPickup() {}

  /**
   * All-args constructor.
   * @param address The new value for address
   * @param lat The new value for lat
   * @param lng The new value for lng
   */
  public ActualPickup(java.lang.CharSequence address, java.lang.Float lat, java.lang.Float lng) {
    this.address = address;
    this.lat = lat;
    this.lng = lng;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return address;
    case 1: return lat;
    case 2: return lng;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: address = (java.lang.CharSequence)value$; break;
    case 1: lat = (java.lang.Float)value$; break;
    case 2: lng = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'lat' field.
   * @return The value of the 'lat' field.
   */
  public java.lang.Float getLat() {
    return lat;
  }

  /**
   * Sets the value of the 'lat' field.
   * @param value the value to set.
   */
  public void setLat(java.lang.Float value) {
    this.lat = value;
  }

  /**
   * Gets the value of the 'lng' field.
   * @return The value of the 'lng' field.
   */
  public java.lang.Float getLng() {
    return lng;
  }

  /**
   * Sets the value of the 'lng' field.
   * @param value the value to set.
   */
  public void setLng(java.lang.Float value) {
    this.lng = value;
  }

  /**
   * Creates a new ActualPickup RecordBuilder.
   * @return A new ActualPickup RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.ActualPickup.Builder newBuilder() {
    return new com.pickme.events.trip.trip_completed.ActualPickup.Builder();
  }

  /**
   * Creates a new ActualPickup RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ActualPickup RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.ActualPickup.Builder newBuilder(com.pickme.events.trip.trip_completed.ActualPickup.Builder other) {
    return new com.pickme.events.trip.trip_completed.ActualPickup.Builder(other);
  }

  /**
   * Creates a new ActualPickup RecordBuilder by copying an existing ActualPickup instance.
   * @param other The existing instance to copy.
   * @return A new ActualPickup RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.ActualPickup.Builder newBuilder(com.pickme.events.trip.trip_completed.ActualPickup other) {
    return new com.pickme.events.trip.trip_completed.ActualPickup.Builder(other);
  }

  /**
   * RecordBuilder for ActualPickup instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ActualPickup>
    implements org.apache.avro.data.RecordBuilder<ActualPickup> {

    private java.lang.CharSequence address;
    private float lat;
    private float lng;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_completed.ActualPickup.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lat)) {
        this.lat = data().deepCopy(fields()[1].schema(), other.lat);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lng)) {
        this.lng = data().deepCopy(fields()[2].schema(), other.lng);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ActualPickup instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_completed.ActualPickup other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lat)) {
        this.lat = data().deepCopy(fields()[1].schema(), other.lat);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lng)) {
        this.lng = data().deepCopy(fields()[2].schema(), other.lng);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.address = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder clearAddress() {
      address = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lat' field.
      * @return The value.
      */
    public java.lang.Float getLat() {
      return lat;
    }

    /**
      * Sets the value of the 'lat' field.
      * @param value The value of 'lat'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder setLat(float value) {
      validate(fields()[1], value);
      this.lat = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lat' field has been set.
      * @return True if the 'lat' field has been set, false otherwise.
      */
    public boolean hasLat() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lat' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder clearLat() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lng' field.
      * @return The value.
      */
    public java.lang.Float getLng() {
      return lng;
    }

    /**
      * Sets the value of the 'lng' field.
      * @param value The value of 'lng'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder setLng(float value) {
      validate(fields()[2], value);
      this.lng = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lng' field has been set.
      * @return True if the 'lng' field has been set, false otherwise.
      */
    public boolean hasLng() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lng' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.ActualPickup.Builder clearLng() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ActualPickup build() {
      try {
        ActualPickup record = new ActualPickup();
        record.address = fieldSetFlags()[0] ? this.address : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lat = fieldSetFlags()[1] ? this.lat : (java.lang.Float) defaultValue(fields()[1]);
        record.lng = fieldSetFlags()[2] ? this.lng : (java.lang.Float) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ActualPickup>
    WRITER$ = (org.apache.avro.io.DatumWriter<ActualPickup>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ActualPickup>
    READER$ = (org.apache.avro.io.DatumReader<ActualPickup>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
