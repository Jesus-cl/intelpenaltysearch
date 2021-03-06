/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.message.product.intlpenaltysearch.v1;

import com.ctriposs.baiji.convert.TypeConverter;
import com.ctriposs.baiji.exception.BaijiRuntimeException;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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

/**
 * 
 *         AdultFee：成人费用
 *         ChildFee：儿童费用
 *         InfantFee：婴儿币种
 *         Currency：币种
 *         ExchangeRate：对人民币的汇率。
 * 
 *         如果某一费用小于0，表示不可以退改！！
 *       
 */
@DtoDoc("AdultFee：成人费用" +
        "ChildFee：儿童费用" +
        "InfantFee：婴儿币种" +
        "Currency：币种" +
        "ExchangeRate：对人民币的汇率。" +
" +
        "如果某一费用小于0，表示不可以退改！！")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "adultFee",
    "childFee",
    "infantFee",
    "currency",
    "exchangeRate"
})
@SuppressWarnings("all")
public class FeeType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"FeeType\",\"namespace\":\"" + FeeType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"adultFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"childFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"infantFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"currency\",\"type\":[\"string\",\"null\"]},{\"name\":\"exchangeRate\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public FeeType(
        BigDecimal adultFee, 
        BigDecimal childFee, 
        BigDecimal infantFee, 
        String currency, 
        BigDecimal exchangeRate) {
        this.adultFee = adultFee;
        this.childFee = childFee;
        this.infantFee = infantFee;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public FeeType() {
    }

    @JsonProperty("AdultFee")
    @XmlElement(name = "AdultFee")
    private BigDecimal adultFee;

    @JsonProperty("ChildFee")
    @XmlElement(name = "ChildFee")
    private BigDecimal childFee;

    @JsonProperty("InfantFee")
    @XmlElement(name = "InfantFee")
    private BigDecimal infantFee;

    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    @JsonProperty("ExchangeRate")
    @XmlElement(name = "ExchangeRate")
    private BigDecimal exchangeRate;

    public BigDecimal getAdultFee() {
        return this.adultFee;
    }

    public void setAdultFee(BigDecimal adultFee) {
        this.adultFee = adultFee;
    }

    public BigDecimal getChildFee() {
        return this.childFee;
    }

    public void setChildFee(BigDecimal childFee) {
        this.childFee = childFee;
    }

    public BigDecimal getInfantFee() {
        return this.infantFee;
    }

    public void setInfantFee(BigDecimal infantFee) {
        this.infantFee = infantFee;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return TypeConverter.convert(this.adultFee, String.class);
            case 1: return TypeConverter.convert(this.childFee, String.class);
            case 2: return TypeConverter.convert(this.infantFee, String.class);
            case 3: return (String) this.currency;
            case 4: return TypeConverter.convert(this.exchangeRate, String.class);
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.adultFee = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 1: this.childFee = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 2: this.infantFee = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
            case 3: this.currency = (String)fieldValue; break;
            case 4: this.exchangeRate = TypeConverter.convert((String)fieldValue, BigDecimal.class); break;
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

        final FeeType other = (FeeType)obj;
        return
            Objects.equal(this.adultFee, other.adultFee) && 
            Objects.equal(this.childFee, other.childFee) && 
            Objects.equal(this.infantFee, other.infantFee) && 
            Objects.equal(this.currency, other.currency) && 
            Objects.equal(this.exchangeRate, other.exchangeRate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.adultFee);
        result = 31 * result + Objects.hashCode(this.childFee);
        result = 31 * result + Objects.hashCode(this.infantFee);
        result = 31 * result + Objects.hashCode(this.currency);
        result = 31 * result + Objects.hashCode(this.exchangeRate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("adultFee", adultFee)
            .add("childFee", childFee)
            .add("infantFee", infantFee)
            .add("currency", currency)
            .add("exchangeRate", exchangeRate)
            .toString();
    }
}