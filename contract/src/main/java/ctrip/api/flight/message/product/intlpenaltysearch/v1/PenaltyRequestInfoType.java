/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.message.product.intlpenaltysearch.v1;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyRequestInfoType", propOrder = {
    "penaltyKey",
    "qteTokenNumber",
    "bookingChannel",
    "extendInfo"
})
@SuppressWarnings("all")
public class PenaltyRequestInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"PenaltyRequestInfoType\",\"namespace\":\"" + PenaltyRequestInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"penaltyKey\",\"type\":[\"string\",\"null\"]},{\"name\":\"qteTokenNumber\",\"type\":[\"string\",\"null\"]},{\"name\":\"bookingChannel\",\"type\":[\"string\",\"null\"]},{\"name\":\"extendInfo\",\"type\":{\"type\":\"record\",\"name\":\"ExtendInfoType\",\"namespace\":\"" + ExtendInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"isReplaceCtripRule\",\"type\":\"boolean\"},{\"name\":\"isPennyRefund\",\"type\":\"boolean\"}]}}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public PenaltyRequestInfoType(
        String penaltyKey, 
        String qteTokenNumber, 
        String bookingChannel, 
        ExtendInfoType extendInfo) {
        this.penaltyKey = penaltyKey;
        this.qteTokenNumber = qteTokenNumber;
        this.bookingChannel = bookingChannel;
        this.extendInfo = extendInfo;
    }

    public PenaltyRequestInfoType() {
    }

    @FieldDoc("退改签的请求字符串信息。对应查询接口输出的PenaltiesKey字段")
    @JsonProperty("PenaltyKey")
    @XmlElement(name = "PenaltyKey")
    private String penaltyKey;

    @FieldDoc("Abacus、Amadeus、CSD，以及航司直连/TF，在Qte验舱验价后生成的TokenNumber。用来查询Qte后的退改签")
    @JsonProperty("QteTokenNumber")
    @XmlElement(name = "QteTokenNumber")
    private String qteTokenNumber;

    @FieldDoc("需要查询的引擎类型")
    @JsonProperty("BookingChannel")
    @XmlElement(name = "BookingChannel")
    private String bookingChannel;

    @FieldDoc("辅助信息，暂时供CSD引擎使用")
    @JsonProperty("ExtendInfo")
    @XmlElement(name = "ExtendInfo")
    private ExtendInfoType extendInfo;

    /**
     * 退改签的请求字符串信息。对应查询接口输出的PenaltiesKey字段
     */
    public String getPenaltyKey() {
        return this.penaltyKey;
    }

    public void setPenaltyKey(String penaltyKey) {
        this.penaltyKey = penaltyKey;
    }

    /**
     * Abacus、Amadeus、CSD，以及航司直连/TF，在Qte验舱验价后生成的TokenNumber。用来查询Qte后的退改签
     */
    public String getQteTokenNumber() {
        return this.qteTokenNumber;
    }

    public void setQteTokenNumber(String qteTokenNumber) {
        this.qteTokenNumber = qteTokenNumber;
    }

    /**
     * 需要查询的引擎类型
     */
    public String getBookingChannel() {
        return this.bookingChannel;
    }

    public void setBookingChannel(String bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    /**
     * 辅助信息，暂时供CSD引擎使用
     */
    public ExtendInfoType getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(ExtendInfoType extendInfo) {
        this.extendInfo = extendInfo;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (String) this.penaltyKey;
            case 1: return (String) this.qteTokenNumber;
            case 2: return (String) this.bookingChannel;
            case 3: return (ExtendInfoType) this.extendInfo;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.penaltyKey = (String)fieldValue; break;
            case 1: this.qteTokenNumber = (String)fieldValue; break;
            case 2: this.bookingChannel = (String)fieldValue; break;
            case 3: this.extendInfo = (ExtendInfoType)fieldValue; break;
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

        final PenaltyRequestInfoType other = (PenaltyRequestInfoType)obj;
        return
            Objects.equal(this.penaltyKey, other.penaltyKey) && 
            Objects.equal(this.qteTokenNumber, other.qteTokenNumber) && 
            Objects.equal(this.bookingChannel, other.bookingChannel) && 
            Objects.equal(this.extendInfo, other.extendInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.penaltyKey);
        result = 31 * result + Objects.hashCode(this.qteTokenNumber);
        result = 31 * result + Objects.hashCode(this.bookingChannel);
        result = 31 * result + Objects.hashCode(this.extendInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("penaltyKey", penaltyKey)
            .add("qteTokenNumber", qteTokenNumber)
            .add("bookingChannel", bookingChannel)
            .add("extendInfo", extendInfo)
            .toString();
    }
}