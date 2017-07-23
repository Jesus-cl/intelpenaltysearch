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
 * 常旅客信息
 */
@DtoDoc("常旅客信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FFPInfoType", propOrder = {
    "memberID",
    "carrier"
})
@SuppressWarnings("all")
public class FFPInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"FFPInfoType\",\"namespace\":\"" + FFPInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"memberID\",\"type\":[\"string\",\"null\"]},{\"name\":\"carrier\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public FFPInfoType(
        String memberID, 
        String carrier) {
        this.memberID = memberID;
        this.carrier = carrier;
    }

    public FFPInfoType() {
    }

    @FieldDoc("常旅客会员号/航空公司代码")
    @JsonProperty("MemberID")
    @XmlElement(name = "MemberID")
    private String memberID;

    @FieldDoc("常旅客航空公司代码")
    @JsonProperty("Carrier")
    @XmlElement(name = "Carrier")
    private String carrier;

    /**
     * 常旅客会员号/航空公司代码
     */
    public String getMemberID() {
        return this.memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    /**
     * 常旅客航空公司代码
     */
    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (String) this.memberID;
            case 1: return (String) this.carrier;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.memberID = (String)fieldValue; break;
            case 1: this.carrier = (String)fieldValue; break;
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

        final FFPInfoType other = (FFPInfoType)obj;
        return
            Objects.equal(this.memberID, other.memberID) && 
            Objects.equal(this.carrier, other.carrier);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.memberID);
        result = 31 * result + Objects.hashCode(this.carrier);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("memberID", memberID)
            .add("carrier", carrier)
            .toString();
    }
}