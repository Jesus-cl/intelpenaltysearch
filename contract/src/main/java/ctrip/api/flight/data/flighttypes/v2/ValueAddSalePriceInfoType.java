/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.data.flighttypes.v2;

import com.ctriposs.baiji.convert.TypeConverter;
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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueAddSalePriceInfoType", propOrder = {
    "salePrice",
    "bookSalePrice",
    "airportSalePrice",
    "refundFee",
    "weight",
    "description",
    "pkgNumber",
    "tag",
    "freeWeight",
    "chargeWeight",
    "agentCode"
})
@SuppressWarnings("all")
public class ValueAddSalePriceInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"ValueAddSalePriceInfoType\",\"namespace\":\"" + ValueAddSalePriceInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"salePrice\",\"type\":[\"string\",\"null\"]},{\"name\":\"bookSalePrice\",\"type\":[\"string\",\"null\"]},{\"name\":\"airportSalePrice\",\"type\":[\"string\",\"null\"]},{\"name\":\"refundFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"weight\",\"type\":\"int\"},{\"name\":\"description\",\"type\":[\"string\",\"null\"]},{\"name\":\"pkgNumber\",\"type\":[\"string\",\"null\"]},{\"name\":\"tag\",\"type\":[\"string\",\"null\"]},{\"name\":\"freeWeight\",\"type\":[\"string\",\"null\"]},{\"name\":\"chargeWeight\",\"type\":[\"string\",\"null\"]},{\"name\":\"agentCode\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public ValueAddSalePriceInfoType(
        BigDecimal salePrice, 
        BigDecimal bookSalePrice, 
        BigDecimal airportSalePrice, 
        BigDecimal refundFee, 
        int weight, 
        String description, 
        String pkgNumber, 
        String tag, 
        BigDecimal freeWeight, 
        BigDecimal chargeWeight, 
        String agentCode) {
        this.salePrice = salePrice;
        this.bookSalePrice = bookSalePrice;
        this.airportSalePrice = airportSalePrice;
        this.refundFee = refundFee;
        this.weight = weight;
        this.description = description;
        this.pkgNumber = pkgNumber;
        this.tag = tag;
        this.freeWeight = freeWeight;
        this.chargeWeight = chargeWeight;
        this.agentCode = agentCode;
    }

    public ValueAddSalePriceInfoType() {
    }

    @FieldDoc("携程卖价")
    @JsonProperty("SalePrice")
    @XmlElement(name = "SalePrice")
    private BigDecimal salePrice;

    @FieldDoc("结算价")
    @JsonProperty("BookSalePrice")
    @XmlElement(name = "BookSalePrice")
    private BigDecimal bookSalePrice;

    @FieldDoc("机场购买价")
    @JsonProperty("AirportSalePrice")
    @XmlElement(name = "AirportSalePrice")
    private BigDecimal airportSalePrice;

    @FieldDoc("退费")
    @JsonProperty("RefundFee")
    @XmlElement(name = "RefundFee")
    private BigDecimal refundFee;

    @FieldDoc("行李重量")
    @JsonProperty("Weight")
    @XmlElement(name = "Weight")
    private int weight;

    @FieldDoc("描述信息")
    @JsonProperty("Description")
    @XmlElement(name = "Description")
    private String description;

    @FieldDoc("行李数")
    @JsonProperty("PkgNumber")
    @XmlElement(name = "PkgNumber")
    private String pkgNumber;

    @FieldDoc("附加值")
    @JsonProperty("Tag")
    @XmlElement(name = "Tag")
    private String tag;

    @FieldDoc("免费行李额重量")
    @JsonProperty("FreeWeight")
    @XmlElement(name = "FreeWeight")
    private BigDecimal freeWeight;

    @FieldDoc("收费行李额重量")
    @JsonProperty("ChargeWeight")
    @XmlElement(name = "ChargeWeight")
    private BigDecimal chargeWeight;

    @FieldDoc("提供行李额的供应商ID")
    @JsonProperty("AgentCode")
    @XmlElement(name = "AgentCode")
    private String agentCode;

    /**
     * 携程卖价
     */
    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 结算价
     */
    public BigDecimal getBookSalePrice() {
        return this.bookSalePrice;
    }

    public void setBookSalePrice(BigDecimal bookSalePrice) {
        this.bookSalePrice = bookSalePrice;
    }

    /**
     * 机场购买价
     */
    public BigDecimal getAirportSalePrice() {
        return this.airportSalePrice;
    }

    public void setAirportSalePrice(BigDecimal airportSalePrice) {
        this.airportSalePrice = airportSalePrice;
    }

    /**
     * 退费
     */
    public BigDecimal getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * 行李重量
     */
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 描述信息
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 行李数
     */
    public String getPkgNumber() {
        return this.pkgNumber;
    }

    public void setPkgNumber(String pkgNumber) {
        this.pkgNumber = pkgNumber;
    }

    /**
     * 附加值
     */
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 免费行李额重量
     */
    public BigDecimal getFreeWeight() {
        return this.freeWeight;
    }

    public void setFreeWeight(BigDecimal freeWeight) {
        this.freeWeight = freeWeight;
    }

    /**
     * 收费行李额重量
     */
    public BigDecimal getChargeWeight() {
        return this.chargeWeight;
    }

    public void setChargeWeight(BigDecimal chargeWeight) {
        this.chargeWeight = chargeWeight;
    }

    /**
     * 提供行李额的供应商ID
     */
    public String getAgentCode() {
        return this.agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return TypeConverter.convert(this.salePrice, String.class);
            case 1: return TypeConverter.convert(this.bookSalePrice, String.class);
            case 2: return TypeConverter.convert(this.airportSalePrice, String.class);
            case 3: return TypeConverter.convert(this.refundFee, String.class);
            case 4: return (int) this.weight;
            case 5: return (String) this.description;
            case 6: return (String) this.pkgNumber;
            case 7: return (String) this.tag;
            case 8: return TypeConverter.convert(this.freeWeight, String.class);
            case 9: return TypeConverter.convert(this.chargeWeight, String.class);
            case 10: return (String) this.agentCode;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.salePrice = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 1: this.bookSalePrice = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 2: this.airportSalePrice = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 3: this.refundFee = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 4: this.weight = (int)fieldValue; break;
            case 5: this.description = (String)fieldValue; break;
            case 6: this.pkgNumber = (String)fieldValue; break;
            case 7: this.tag = (String)fieldValue; break;
            case 8: this.freeWeight = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 9: this.chargeWeight = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 10: this.agentCode = (String)fieldValue; break;
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

        final ValueAddSalePriceInfoType other = (ValueAddSalePriceInfoType)obj;
        return
            Objects.equal(this.salePrice, other.salePrice) && 
            Objects.equal(this.bookSalePrice, other.bookSalePrice) && 
            Objects.equal(this.airportSalePrice, other.airportSalePrice) && 
            Objects.equal(this.refundFee, other.refundFee) && 
            Objects.equal(this.weight, other.weight) && 
            Objects.equal(this.description, other.description) && 
            Objects.equal(this.pkgNumber, other.pkgNumber) && 
            Objects.equal(this.tag, other.tag) && 
            Objects.equal(this.freeWeight, other.freeWeight) && 
            Objects.equal(this.chargeWeight, other.chargeWeight) && 
            Objects.equal(this.agentCode, other.agentCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.salePrice);
        result = 31 * result + Objects.hashCode(this.bookSalePrice);
        result = 31 * result + Objects.hashCode(this.airportSalePrice);
        result = 31 * result + Objects.hashCode(this.refundFee);
        result = 31 * result + Objects.hashCode(this.weight);
        result = 31 * result + Objects.hashCode(this.description);
        result = 31 * result + Objects.hashCode(this.pkgNumber);
        result = 31 * result + Objects.hashCode(this.tag);
        result = 31 * result + Objects.hashCode(this.freeWeight);
        result = 31 * result + Objects.hashCode(this.chargeWeight);
        result = 31 * result + Objects.hashCode(this.agentCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("salePrice", salePrice)
            .add("bookSalePrice", bookSalePrice)
            .add("airportSalePrice", airportSalePrice)
            .add("refundFee", refundFee)
            .add("weight", weight)
            .add("description", description)
            .add("pkgNumber", pkgNumber)
            .add("tag", tag)
            .add("freeWeight", freeWeight)
            .add("chargeWeight", chargeWeight)
            .add("agentCode", agentCode)
            .toString();
    }
}