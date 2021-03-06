/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.data.flighttypes.v2;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportInfoType", propOrder = {
    "terminal",
    "portCode",
    "portName",
    "portNameEN"
})
@SuppressWarnings("all")
public class AirportInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"AirportInfoType\",\"namespace\":\"" + AirportInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"terminal\",\"type\":[\"string\",\"null\"]},{\"name\":\"portCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"portName\",\"type\":[\"string\",\"null\"]},{\"name\":\"portNameEN\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public AirportInfoType(
        String terminal, 
        String portCode, 
        String portName, 
        String portNameEN) {
        this.terminal = terminal;
        this.portCode = portCode;
        this.portName = portName;
        this.portNameEN = portNameEN;
    }

    public AirportInfoType() {
    }

    @JsonProperty("Terminal")
    @XmlElement(name = "Terminal")
    private String terminal;

    @JsonProperty("PortCode")
    @XmlElement(name = "PortCode")
    private String portCode;

    @JsonProperty("PortName")
    @XmlElement(name = "PortName")
    private String portName;

    @JsonProperty("PortNameEN")
    @XmlElement(name = "PortNameEN")
    private String portNameEN;

    public String getTerminal() {
        return this.terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getPortCode() {
        return this.portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortNameEN() {
        return this.portNameEN;
    }

    public void setPortNameEN(String portNameEN) {
        this.portNameEN = portNameEN;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (String) this.terminal;
            case 1: return (String) this.portCode;
            case 2: return (String) this.portName;
            case 3: return (String) this.portNameEN;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.terminal = (String)fieldValue; break;
            case 1: this.portCode = (String)fieldValue; break;
            case 2: this.portName = (String)fieldValue; break;
            case 3: this.portNameEN = (String)fieldValue; break;
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

        final AirportInfoType other = (AirportInfoType)obj;
        return
            Objects.equal(this.terminal, other.terminal) && 
            Objects.equal(this.portCode, other.portCode) && 
            Objects.equal(this.portName, other.portName) && 
            Objects.equal(this.portNameEN, other.portNameEN);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.terminal);
        result = 31 * result + Objects.hashCode(this.portCode);
        result = 31 * result + Objects.hashCode(this.portName);
        result = 31 * result + Objects.hashCode(this.portNameEN);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("terminal", terminal)
            .add("portCode", portCode)
            .add("portName", portName)
            .add("portNameEN", portNameEN)
            .toString();
    }
}