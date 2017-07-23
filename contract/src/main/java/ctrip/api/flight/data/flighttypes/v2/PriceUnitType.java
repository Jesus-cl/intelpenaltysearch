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
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceUnitType", propOrder = {
    "fareList",
    "carrierTicketingDeadline",
    "qteCmdPostfix",
    "needQTE",
    "needPnr",
    "textRemarkId"
})
@SuppressWarnings("all")
public class PriceUnitType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"PriceUnitType\",\"namespace\":\"" + PriceUnitType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"fareList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FareType\",\"namespace\":\"" + FareType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"fcSequence\",\"type\":\"int\"},{\"name\":\"fareInfo\",\"type\":{\"type\":\"record\",\"name\":\"FareInfoType\",\"namespace\":\"" + FareInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"fareID\",\"type\":[\"string\",\"null\"]},{\"name\":\"fareBasis\",\"type\":[\"string\",\"null\"]},{\"name\":\"fareSource\",\"type\":\"int\"},{\"name\":\"ownerCarrier\",\"type\":[\"string\",\"null\"]},{\"name\":\"fareType\",\"type\":\"int\"},{\"name\":\"accountCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"ticketDesignator\",\"type\":[\"string\",\"null\"]},{\"name\":\"tourCode\",\"type\":[\"string\",\"null\"]}]}}]}}},{\"name\":\"carrierTicketingDeadline\",\"type\":[\"datetime\",\"null\"]},{\"name\":\"qteCmdPostfix\",\"type\":[\"string\",\"null\"]},{\"name\":\"needQTE\",\"type\":\"boolean\"},{\"name\":\"needPnr\",\"type\":\"boolean\"},{\"name\":\"textRemarkId\",\"type\":\"int\"}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public PriceUnitType(
        List<FareType> fareList, 
        Calendar carrierTicketingDeadline, 
        String qteCmdPostfix, 
        boolean needQTE, 
        boolean needPnr, 
        int textRemarkId) {
        this.fareList = fareList;
        this.carrierTicketingDeadline = carrierTicketingDeadline;
        this.qteCmdPostfix = qteCmdPostfix;
        this.needQTE = needQTE;
        this.needPnr = needPnr;
        this.textRemarkId = textRemarkId;
    }

    public PriceUnitType() {
    }

    @JsonProperty("FareList")
    @XmlElement(name = "Fare")
    @XmlElementWrapper(name = "FareList")
    private List<FareType> fareList;

    @JsonProperty("CarrierTicketingDeadline")
    @XmlElement(name = "CarrierTicketingDeadline")
    private Calendar carrierTicketingDeadline;

    @JsonProperty("QTECmdPostfix")
    @XmlElement(name = "QTECmdPostfix")
    private String qteCmdPostfix;

    @JsonProperty("NeedQTE")
    @XmlElement(name = "NeedQTE")
    private boolean needQTE;

    @JsonProperty("NeedPnr")
    @XmlElement(name = "NeedPnr")
    private boolean needPnr;

    @JsonProperty("TextRemarkId")
    @XmlElement(name = "TextRemarkId")
    private int textRemarkId;

    public List<FareType> getFareList() {
        return this.fareList;
    }

    public void setFareList(List<FareType> fareList) {
        this.fareList = fareList;
    }

    public Calendar getCarrierTicketingDeadline() {
        return this.carrierTicketingDeadline;
    }

    public void setCarrierTicketingDeadline(Calendar carrierTicketingDeadline) {
        this.carrierTicketingDeadline = carrierTicketingDeadline;
    }

    public String getQteCmdPostfix() {
        return this.qteCmdPostfix;
    }

    public void setQteCmdPostfix(String qteCmdPostfix) {
        this.qteCmdPostfix = qteCmdPostfix;
    }

    public boolean getNeedQTE() {
        return this.needQTE;
    }

    public void setNeedQTE(boolean needQTE) {
        this.needQTE = needQTE;
    }

    public boolean getNeedPnr() {
        return this.needPnr;
    }

    public void setNeedPnr(boolean needPnr) {
        this.needPnr = needPnr;
    }

    public int getTextRemarkId() {
        return this.textRemarkId;
    }

    public void setTextRemarkId(int textRemarkId) {
        this.textRemarkId = textRemarkId;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (List<FareType>) this.fareList;
            case 1: return (Calendar) this.carrierTicketingDeadline;
            case 2: return (String) this.qteCmdPostfix;
            case 3: return (boolean) this.needQTE;
            case 4: return (boolean) this.needPnr;
            case 5: return (int) this.textRemarkId;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.fareList = (List<FareType>)fieldValue; break;
            case 1: this.carrierTicketingDeadline = (Calendar)fieldValue; break;
            case 2: this.qteCmdPostfix = (String)fieldValue; break;
            case 3: this.needQTE = (boolean)fieldValue; break;
            case 4: this.needPnr = (boolean)fieldValue; break;
            case 5: this.textRemarkId = (int)fieldValue; break;
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

        final PriceUnitType other = (PriceUnitType)obj;
        return
            Objects.equal(this.fareList, other.fareList) && 
            Objects.equal(this.carrierTicketingDeadline, other.carrierTicketingDeadline) && 
            Objects.equal(this.qteCmdPostfix, other.qteCmdPostfix) && 
            Objects.equal(this.needQTE, other.needQTE) && 
            Objects.equal(this.needPnr, other.needPnr) && 
            Objects.equal(this.textRemarkId, other.textRemarkId);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.fareList);
        result = 31 * result + Objects.hashCode(this.carrierTicketingDeadline);
        result = 31 * result + Objects.hashCode(this.qteCmdPostfix);
        result = 31 * result + Objects.hashCode(this.needQTE);
        result = 31 * result + Objects.hashCode(this.needPnr);
        result = 31 * result + Objects.hashCode(this.textRemarkId);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("fareList", fareList)
            .add("carrierTicketingDeadline", carrierTicketingDeadline)
            .add("qteCmdPostfix", qteCmdPostfix)
            .add("needQTE", needQTE)
            .add("needPnr", needPnr)
            .add("textRemarkId", textRemarkId)
            .toString();
    }
}