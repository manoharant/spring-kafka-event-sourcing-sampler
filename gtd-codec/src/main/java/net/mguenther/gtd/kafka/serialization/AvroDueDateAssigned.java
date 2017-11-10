/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package net.mguenther.gtd.kafka.serialization;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroDueDateAssigned extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1861909984661059955L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroDueDateAssigned\",\"namespace\":\"net.mguenther.gtd.kafka.serialization\",\"fields\":[{\"name\":\"itemId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dueDate\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String itemId;
  @Deprecated public long dueDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroDueDateAssigned() {}

  /**
   * All-args constructor.
   * @param itemId The new value for itemId
   * @param dueDate The new value for dueDate
   */
  public AvroDueDateAssigned(java.lang.String itemId, java.lang.Long dueDate) {
    this.itemId = itemId;
    this.dueDate = dueDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return itemId;
    case 1: return dueDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: itemId = (java.lang.String)value$; break;
    case 1: dueDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'itemId' field.
   * @return The value of the 'itemId' field.
   */
  public java.lang.String getItemId() {
    return itemId;
  }

  /**
   * Sets the value of the 'itemId' field.
   * @param value the value to set.
   */
  public void setItemId(java.lang.String value) {
    this.itemId = value;
  }

  /**
   * Gets the value of the 'dueDate' field.
   * @return The value of the 'dueDate' field.
   */
  public java.lang.Long getDueDate() {
    return dueDate;
  }

  /**
   * Sets the value of the 'dueDate' field.
   * @param value the value to set.
   */
  public void setDueDate(java.lang.Long value) {
    this.dueDate = value;
  }

  /**
   * Creates a new AvroDueDateAssigned RecordBuilder.
   * @return A new AvroDueDateAssigned RecordBuilder
   */
  public static net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder newBuilder() {
    return new net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder();
  }

  /**
   * Creates a new AvroDueDateAssigned RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroDueDateAssigned RecordBuilder
   */
  public static net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder newBuilder(net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder other) {
    return new net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder(other);
  }

  /**
   * Creates a new AvroDueDateAssigned RecordBuilder by copying an existing AvroDueDateAssigned instance.
   * @param other The existing instance to copy.
   * @return A new AvroDueDateAssigned RecordBuilder
   */
  public static net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder newBuilder(net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned other) {
    return new net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder(other);
  }

  /**
   * RecordBuilder for AvroDueDateAssigned instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroDueDateAssigned>
    implements org.apache.avro.data.RecordBuilder<AvroDueDateAssigned> {

    private java.lang.String itemId;
    private long dueDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.itemId)) {
        this.itemId = data().deepCopy(fields()[0].schema(), other.itemId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dueDate)) {
        this.dueDate = data().deepCopy(fields()[1].schema(), other.dueDate);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroDueDateAssigned instance
     * @param other The existing instance to copy.
     */
    private Builder(net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.itemId)) {
        this.itemId = data().deepCopy(fields()[0].schema(), other.itemId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dueDate)) {
        this.dueDate = data().deepCopy(fields()[1].schema(), other.dueDate);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'itemId' field.
      * @return The value.
      */
    public java.lang.String getItemId() {
      return itemId;
    }

    /**
      * Sets the value of the 'itemId' field.
      * @param value The value of 'itemId'.
      * @return This builder.
      */
    public net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder setItemId(java.lang.String value) {
      validate(fields()[0], value);
      this.itemId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'itemId' field has been set.
      * @return True if the 'itemId' field has been set, false otherwise.
      */
    public boolean hasItemId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'itemId' field.
      * @return This builder.
      */
    public net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder clearItemId() {
      itemId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'dueDate' field.
      * @return The value.
      */
    public java.lang.Long getDueDate() {
      return dueDate;
    }

    /**
      * Sets the value of the 'dueDate' field.
      * @param value The value of 'dueDate'.
      * @return This builder.
      */
    public net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder setDueDate(long value) {
      validate(fields()[1], value);
      this.dueDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'dueDate' field has been set.
      * @return True if the 'dueDate' field has been set, false otherwise.
      */
    public boolean hasDueDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'dueDate' field.
      * @return This builder.
      */
    public net.mguenther.gtd.kafka.serialization.AvroDueDateAssigned.Builder clearDueDate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AvroDueDateAssigned build() {
      try {
        AvroDueDateAssigned record = new AvroDueDateAssigned();
        record.itemId = fieldSetFlags()[0] ? this.itemId : (java.lang.String) defaultValue(fields()[0]);
        record.dueDate = fieldSetFlags()[1] ? this.dueDate : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}