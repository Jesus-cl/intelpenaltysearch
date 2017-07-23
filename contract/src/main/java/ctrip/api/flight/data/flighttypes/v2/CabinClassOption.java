// Generated by eBay Common SDK Platform
package ctrip.api.flight.data.flighttypes.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 舱等组合选项，包含Default和GroupSearch
 */
@XmlType(name = "CabinClassOption")
@XmlEnum
@SuppressWarnings("all")
public enum CabinClassOption {

    @XmlEnumValue("Default")
    Default(0, "Default"),

    @XmlEnumValue("GroupSearch")
    GroupSearch(1, "GroupSearch");

    private final int intValue;
    private final String value;

    CabinClassOption(int intValue, String value) {
        this.intValue = intValue;
        this.value = value;
    }

    public int getValue() {
        return intValue;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static CabinClassOption fromValue(String v) {
        for (CabinClassOption e: CabinClassOption.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static CabinClassOption findByValue(int value) {
        switch (value) {
            case 0:
                return Default;
            case 1:
                return GroupSearch;
            default:
                return null;
        }
    }
}