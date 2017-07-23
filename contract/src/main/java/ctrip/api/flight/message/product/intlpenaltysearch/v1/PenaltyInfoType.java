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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyInfoType", propOrder = {
    "penaltyFeeList",
    "remarkText"
})
@SuppressWarnings("all")
public class PenaltyInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"PenaltyInfoType\",\"namespace\":\"" + PenaltyInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"penaltyFeeList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PenaltyFeeType\",\"namespace\":\"" + PenaltyFeeType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"fcGroupID\",\"type\":\"int\"},{\"name\":\"flag\",\"type\":[{\"type\":\"enum\",\"name\":\"TicketAlterType\",\"namespace\":\"" + TicketAlterType.class.getPackage().getName() + "\",\"symbols\":[\"Prohibition\",\"Allows\",\"Regulation\",\"Supplement\"]},\"null\"]},{\"name\":\"settleRMBFee\",\"type\":{\"type\":\"record\",\"name\":\"FeeType\",\"namespace\":\"" + FeeType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"adultFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"childFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"infantFee\",\"type\":[\"string\",\"null\"]},{\"name\":\"currency\",\"type\":[\"string\",\"null\"]},{\"name\":\"exchangeRate\",\"type\":[\"string\",\"null\"]}]}},{\"name\":\"settleForeignFee\",\"type\":\"FeeType\"},{\"name\":\"noShowCondition\",\"type\":[\"string\",\"null\"]},{\"name\":\"noShowFlag\",\"type\":[\"TicketAlterType\",\"null\"]},{\"name\":\"noShowSettleRMBFee\",\"type\":\"FeeType\"},{\"name\":\"noShowSettleForeignFee\",\"type\":\"FeeType\"}]}}},{\"name\":\"remarkText\",\"type\":{\"type\":\"record\",\"name\":\"RemarkTextType\",\"namespace\":\"" + RemarkTextType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"textCN\",\"type\":[\"string\",\"null\"]},{\"name\":\"textEN\",\"type\":[\"string\",\"null\"]}]}}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public PenaltyInfoType(
        List<PenaltyFeeType> penaltyFeeList, 
        RemarkTextType remarkText) {
        this.penaltyFeeList = penaltyFeeList;
        this.remarkText = remarkText;
    }

    public PenaltyInfoType() {
    }

    @FieldDoc("最多两个元素，表示去程和回程。")
    @JsonProperty("PenaltyFeeList")
    @XmlElement(name = "PenaltyFee")
    @XmlElementWrapper(name = "PenaltyFeeList")
    private List<PenaltyFeeType> penaltyFeeList;

    @JsonProperty("RemarkText")
    @XmlElement(name = "RemarkText")
    private RemarkTextType remarkText;

    /**
     * 最多两个元素，表示去程和回程。
     */
    public List<PenaltyFeeType> getPenaltyFeeList() {
        return this.penaltyFeeList;
    }

    public void setPenaltyFeeList(List<PenaltyFeeType> penaltyFeeList) {
        this.penaltyFeeList = penaltyFeeList;
    }

    public RemarkTextType getRemarkText() {
        return this.remarkText;
    }

    public void setRemarkText(RemarkTextType remarkText) {
        this.remarkText = remarkText;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (List<PenaltyFeeType>) this.penaltyFeeList;
            case 1: return (RemarkTextType) this.remarkText;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.penaltyFeeList = (List<PenaltyFeeType>)fieldValue; break;
            case 1: this.remarkText = (RemarkTextType)fieldValue; break;
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

        final PenaltyInfoType other = (PenaltyInfoType)obj;
        return
            Objects.equal(this.penaltyFeeList, other.penaltyFeeList) && 
            Objects.equal(this.remarkText, other.remarkText);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.penaltyFeeList);
        result = 31 * result + Objects.hashCode(this.remarkText);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("penaltyFeeList", penaltyFeeList)
            .add("remarkText", remarkText)
            .toString();
    }
}