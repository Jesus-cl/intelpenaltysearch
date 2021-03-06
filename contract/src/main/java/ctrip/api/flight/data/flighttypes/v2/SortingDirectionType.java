// Generated by eBay Common SDK Platform
package ctrip.api.flight.data.flighttypes.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 排序方向：升序，降序
 */
@XmlType(name = "SortingDirectionType")
@XmlEnum
@SuppressWarnings("all")
public enum SortingDirectionType {

    @XmlEnumValue("ASC")
    ASC(0, "ASC"),

    @XmlEnumValue("DESC")
    DESC(1, "DESC");

    private final int intValue;
    private final String value;

    SortingDirectionType(int intValue, String value) {
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
    public static SortingDirectionType fromValue(String v) {
        for (SortingDirectionType e: SortingDirectionType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static SortingDirectionType findByValue(int value) {
        switch (value) {
            case 0:
                return ASC;
            case 1:
                return DESC;
            default:
                return null;
        }
    }
}