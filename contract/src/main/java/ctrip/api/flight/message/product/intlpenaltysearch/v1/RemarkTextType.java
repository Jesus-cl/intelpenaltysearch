/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.message.product.intlpenaltysearch.v1;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 *         中英文文本备注
 *       
 */
@DtoDoc("中英文文本备注")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkTextType", propOrder = {
    "textCN",
    "textEN"
})
@SuppressWarnings("all")
public class RemarkTextType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"RemarkTextType\",\"namespace\":\"" + RemarkTextType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"textCN\",\"type\":[\"string\",\"null\"]},{\"name\":\"textEN\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public RemarkTextType(
        String textCN, 
        String textEN) {
        this.textCN = textCN;
        this.textEN = textEN;
    }

    public RemarkTextType() {
    }

    @JsonProperty("TextCN")
    @XmlElement(name = "TextCN")
    private String textCN;

    @JsonProperty("TextEN")
    @XmlElement(name = "TextEN")
    private String textEN;

    public String getTextCN() {
        return this.textCN;
    }

    public void setTextCN(String textCN) {
        this.textCN = textCN;
    }

    public String getTextEN() {
        return this.textEN;
    }

    public void setTextEN(String textEN) {
        this.textEN = textEN;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (String) this.textCN;
            case 1: return (String) this.textEN;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.textCN = (String)fieldValue; break;
            case 1: this.textEN = (String)fieldValue; break;
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

        final RemarkTextType other = (RemarkTextType)obj;
        return
            Objects.equal(this.textCN, other.textCN) && 
            Objects.equal(this.textEN, other.textEN);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.textCN);
        result = 31 * result + Objects.hashCode(this.textEN);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("textCN", textCN)
            .add("textEN", textEN)
            .toString();
    }
}