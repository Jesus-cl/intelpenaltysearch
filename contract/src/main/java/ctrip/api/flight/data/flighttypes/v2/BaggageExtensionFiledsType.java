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
 * 行李额扩展字段
 */
@DtoDoc("行李额扩展字段")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageExtensionFiledsType", propOrder = {
    "containFreeBaggage"
})
@SuppressWarnings("all")
public class BaggageExtensionFiledsType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"BaggageExtensionFiledsType\",\"namespace\":\"" + BaggageExtensionFiledsType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"containFreeBaggage\",\"type\":\"boolean\"}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public BaggageExtensionFiledsType(
        boolean containFreeBaggage) {
        this.containFreeBaggage = containFreeBaggage;
    }

    public BaggageExtensionFiledsType() {
    }

    @FieldDoc("是否包含免费行李额")
    @JsonProperty("ContainFreeBaggage")
    @XmlElement(name = "ContainFreeBaggage")
    private boolean containFreeBaggage;

    /**
     * 是否包含免费行李额
     */
    public boolean getContainFreeBaggage() {
        return this.containFreeBaggage;
    }

    public void setContainFreeBaggage(boolean containFreeBaggage) {
        this.containFreeBaggage = containFreeBaggage;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (boolean) this.containFreeBaggage;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.containFreeBaggage = (boolean)fieldValue; break;
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

        final BaggageExtensionFiledsType other = (BaggageExtensionFiledsType)obj;
        return
            Objects.equal(this.containFreeBaggage, other.containFreeBaggage);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.containFreeBaggage);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("containFreeBaggage", containFreeBaggage)
            .toString();
    }
}