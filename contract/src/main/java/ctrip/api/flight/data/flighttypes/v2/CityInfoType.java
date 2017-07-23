/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package ctrip.api.flight.data.flighttypes.v2;

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
 * 城市信息
 */
@DtoDoc("城市信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityInfoType", propOrder = {
    "cityID",
    "cityCode",
    "cityName",
    "cityNameEN",
    "provinceID",
    "countryID",
    "countryName",
    "countryNameEN",
    "isDomestic"
})
@SuppressWarnings("all")
public class CityInfoType implements SpecificRecord {

    private static final long serialVersionUID = 1L;

	public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"CityInfoType\",\"namespace\":\"" + CityInfoType.class.getPackage().getName() + "\",\"fields\":[{\"name\":\"cityID\",\"type\":\"int\"},{\"name\":\"cityCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"cityName\",\"type\":[\"string\",\"null\"]},{\"name\":\"cityNameEN\",\"type\":[\"string\",\"null\"]},{\"name\":\"provinceID\",\"type\":\"int\"},{\"name\":\"countryID\",\"type\":\"int\"},{\"name\":\"countryName\",\"type\":[\"string\",\"null\"]},{\"name\":\"countryNameEN\",\"type\":[\"string\",\"null\"]},{\"name\":\"isDomestic\",\"type\":\"boolean\"}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public CityInfoType(
        int cityID, 
        String cityCode, 
        String cityName, 
        String cityNameEN, 
        int provinceID, 
        int countryID, 
        String countryName, 
        String countryNameEN, 
        boolean isDomestic) {
        this.cityID = cityID;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.cityNameEN = cityNameEN;
        this.provinceID = provinceID;
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryNameEN = countryNameEN;
        this.isDomestic = isDomestic;
    }

    public CityInfoType() {
    }

    @JsonProperty("CityID")
    @XmlElement(name = "CityID")
    private int cityID;

    @JsonProperty("CityCode")
    @XmlElement(name = "CityCode")
    private String cityCode;

    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @JsonProperty("CityNameEN")
    @XmlElement(name = "CityNameEN")
    private String cityNameEN;

    @JsonProperty("ProvinceID")
    @XmlElement(name = "ProvinceID")
    private int provinceID;

    @JsonProperty("CountryID")
    @XmlElement(name = "CountryID")
    private int countryID;

    @JsonProperty("CountryName")
    @XmlElement(name = "CountryName")
    private String countryName;

    @JsonProperty("CountryNameEN")
    @XmlElement(name = "CountryNameEN")
    private String countryNameEN;

    @JsonProperty("IsDomestic")
    @XmlElement(name = "IsDomestic")
    private boolean isDomestic;

    public int getCityID() {
        return this.cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNameEN() {
        return this.cityNameEN;
    }

    public void setCityNameEN(String cityNameEN) {
        this.cityNameEN = cityNameEN;
    }

    public int getProvinceID() {
        return this.provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getCountryID() {
        return this.countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNameEN() {
        return this.countryNameEN;
    }

    public void setCountryNameEN(String countryNameEN) {
        this.countryNameEN = countryNameEN;
    }

    public boolean getIsDomestic() {
        return this.isDomestic;
    }

    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public Object get(int fieldPos) {
        switch(fieldPos) {
            case 0: return (int) this.cityID;
            case 1: return (String) this.cityCode;
            case 2: return (String) this.cityName;
            case 3: return (String) this.cityNameEN;
            case 4: return (int) this.provinceID;
            case 5: return (int) this.countryID;
            case 6: return (String) this.countryName;
            case 7: return (String) this.countryNameEN;
            case 8: return (boolean) this.isDomestic;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    public void put(int fieldPos, Object fieldValue) {
        switch(fieldPos) {
            case 0: this.cityID = (int)fieldValue; break;
            case 1: this.cityCode = (String)fieldValue; break;
            case 2: this.cityName = (String)fieldValue; break;
            case 3: this.cityNameEN = (String)fieldValue; break;
            case 4: this.provinceID = (int)fieldValue; break;
            case 5: this.countryID = (int)fieldValue; break;
            case 6: this.countryName = (String)fieldValue; break;
            case 7: this.countryNameEN = (String)fieldValue; break;
            case 8: this.isDomestic = (boolean)fieldValue; break;
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

        final CityInfoType other = (CityInfoType)obj;
        return
            Objects.equal(this.cityID, other.cityID) && 
            Objects.equal(this.cityCode, other.cityCode) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.cityNameEN, other.cityNameEN) && 
            Objects.equal(this.provinceID, other.provinceID) && 
            Objects.equal(this.countryID, other.countryID) && 
            Objects.equal(this.countryName, other.countryName) && 
            Objects.equal(this.countryNameEN, other.countryNameEN) && 
            Objects.equal(this.isDomestic, other.isDomestic);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.cityID);
        result = 31 * result + Objects.hashCode(this.cityCode);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.cityNameEN);
        result = 31 * result + Objects.hashCode(this.provinceID);
        result = 31 * result + Objects.hashCode(this.countryID);
        result = 31 * result + Objects.hashCode(this.countryName);
        result = 31 * result + Objects.hashCode(this.countryNameEN);
        result = 31 * result + Objects.hashCode(this.isDomestic);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("cityID", cityID)
            .add("cityCode", cityCode)
            .add("cityName", cityName)
            .add("cityNameEN", cityNameEN)
            .add("provinceID", provinceID)
            .add("countryID", countryID)
            .add("countryName", countryName)
            .add("countryNameEN", countryNameEN)
            .add("isDomestic", isDomestic)
            .toString();
    }
}