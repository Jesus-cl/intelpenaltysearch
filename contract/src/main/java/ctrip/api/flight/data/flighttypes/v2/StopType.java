/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.data.flighttypes.v2;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.schema.Field;
import com.ctriposs.baiji.schema.RecordSchema;
import com.ctriposs.baiji.schema.Schema;
import com.ctriposs.baiji.specific.SpecificRecord;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 经停信息
 */
@DtoDoc("经停信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
    "airport",
    "duration"
})
@SuppressWarnings("all")
public class StopType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"StopType\",\"namespace\":\"" + StopType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"airport\",\"type\":[\"string\",\"null\"]},{\"name\":\"duration\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public StopType(
        String airport, 
        String duration) {
        this.airport = airport;
        this.duration = duration;
    }

    public StopType() {
    }

    @FieldDoc("经停机场")
    @JsonProperty("Airport")
    @XmlElement(name = "Airport")
    private String airport;

    @FieldDoc("经停时长")
    @JsonProperty("Duration")
    @XmlElement(name = "Duration")
    private String duration;

    /**
     * 经停机场
     */
    public String getAirport() {
        return this.airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    /**
     * 经停时长
     */
    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (String) this.airport;
            case 1: return (String) this.duration;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.airport = (String)fieldValue; break;
            case 1: this.duration = (String)fieldValue; break;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in put()");
        }
    }

    @Override
    public Object get(String fieldName) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return null;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        return field != null ? get(field.getPos()) : null;
    }

    @Override
    public void put(String fieldName, Object fieldValue) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        if (field != null) {
            put(field.getPos(), fieldValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final StopType other = (StopType)obj;
        return
            Objects.equal(this.airport, other.airport) && 
            Objects.equal(this.duration, other.duration);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.airport);
        result = 31 * result + Objects.hashCode(this.duration);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("airport", airport)
            .add("duration", duration)
            .toString();
    }
}