// Generated by eBay Common SDK Platform
package ctrip.api.flight.data.flighttypes.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 飞人订单类型 None：非飞人订单 FlyerOrderVisible：飞人订单并显示飞人标识 FlyerOrderInvisible：飞人订单但不显示飞人标识
 */
@XmlType(name = "FlyerFlagType")
@XmlEnum
@SuppressWarnings("all")
public enum FlyerFlagType {

    @XmlEnumValue("None")
    None(0, "None"),

    @XmlEnumValue("FlyerOrderVisible")
    FlyerOrderVisible(1, "FlyerOrderVisible"),

    @XmlEnumValue("FlyerOrderInvisible")
    FlyerOrderInvisible(2, "FlyerOrderInvisible");

    private final int intValue;
    private final String value;

    FlyerFlagType(int intValue, String value) {
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
    public static FlyerFlagType fromValue(String v) {
        for (FlyerFlagType e: FlyerFlagType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static FlyerFlagType findByValue(int value) {
        switch (value) {
            case 0:
                return None;
            case 1:
                return FlyerOrderVisible;
            case 2:
                return FlyerOrderInvisible;
            default:
                return null;
        }
    }
}