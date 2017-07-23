// Generated by eBay Common SDK Platform
package ctrip.api.flight.data.messagetypes.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 用来区分不同客户端
 */
@XmlType(name = "ChannelIDType")
@XmlEnum
@SuppressWarnings("all")
public enum ChannelIDType {

    /**
     * 国内机票online
     */
    @XmlEnumValue("FlightOnline")
    FlightOnline(0, "FlightOnline"),

    /**
     * 国内机票offline
     */
    @XmlEnumValue("FlightOffline")
    FlightOffline(1, "FlightOffline"),

    /**
     * 国内机票对外接口
     */
    @XmlEnumValue("FlightExternal")
    FlightExternal(2, "FlightExternal"),

    /**
     * 国际机票online
     */
    @XmlEnumValue("FlightIntlOnline")
    FlightIntlOnline(3, "FlightIntlOnline"),

    /**
     * 国际机票offline
     */
    @XmlEnumValue("FlightIntlOffline")
    FlightIntlOffline(4, "FlightIntlOffline"),

    /**
     * 国际机票对外接口
     */
    @XmlEnumValue("FltIntlExternal")
    FltIntlExternal(5, "FltIntlExternal"),

    /**
     * online SEO
     */
    @XmlEnumValue("FlightIntlOnlineSEO")
    FlightIntlOnlineSEO(6, "FlightIntlOnlineSEO"),

    /**
     * 商旅 online
     */
    @XmlEnumValue("Corporation")
    Corporation(7, "Corporation"),

    /**
     * 商旅 offline
     */
    @XmlEnumValue("CorpOffline")
    CorpOffline(8, "CorpOffline"),

    /**
     * 商旅 mobile
     */
    @XmlEnumValue("CorpMobile")
    CorpMobile(9, "CorpMobile"),

    /**
     * 度假
     */
    @XmlEnumValue("Vacation")
    Vacation(10, "Vacation"),

    /**
     * 度假团队
     */
    @XmlEnumValue("VacationGroup")
    VacationGroup(11, "VacationGroup"),

    /**
     * 度假指定PolicyCode的查询渠道
     */
    @XmlEnumValue("RestrictedVacation")
    RestrictedVacation(12, "RestrictedVacation"),

    /**
     * 度假自由行
     */
    @XmlEnumValue("FitTravel")
    FitTravel(13, "FitTravel"),

    /**
     * 无线APP
     */
    @XmlEnumValue("Mobile")
    Mobile(14, "Mobile"),

    /**
     * 无线H5
     */
    @XmlEnumValue("MobileH5")
    MobileH5(15, "MobileH5"),

    /**
     * 酒店
     */
    @XmlEnumValue("Hotel")
    Hotel(16, "Hotel"),

    /**
     * 国内机酒
     */
    @XmlEnumValue("AirHotel")
    AirHotel(17, "AirHotel"),

    /**
     * 国际机酒
     */
    @XmlEnumValue("AirHotelIntl")
    AirHotelIntl(18, "AirHotelIntl"),

    /**
     * 新机+酒
     */
    @XmlEnumValue("AirHotelIntlEx")
    AirHotelIntlEx(19, "AirHotelIntlEx"),

    /**
     * 机酒套餐
     */
    @XmlEnumValue("AirHotelPackage")
    AirHotelPackage(20, "AirHotelPackage"),

    /**
     * 英文子系统
     */
    @XmlEnumValue("EnglishSite")
    EnglishSite(21, "EnglishSite"),

    /**
     * 高铁
     */
    @XmlEnumValue("HighRail")
    HighRail(22, "HighRail"),

    /**
     * 分销联盟
     */
    @XmlEnumValue("Affiliate")
    Affiliate(23, "Affiliate"),

    /**
     * 高端旅游
     */
    @XmlEnumValue("Luxury")
    Luxury(24, "Luxury"),

    /**
     * 客服
     */
    @XmlEnumValue("Customer")
    Customer(25, "Customer"),

    /**
     * MICE子系统
     */
    @XmlEnumValue("Mice")
    Mice(26, "Mice"),

    /**
     * 社区攻略
     */
    @XmlEnumValue("Community")
    Community(27, "Community"),

    /**
     * 易游网
     */
    @XmlEnumValue("EzTravel")
    EzTravel(28, "EzTravel"),

    /**
     * 永安
     */
    @XmlEnumValue("Wingon")
    Wingon(29, "Wingon"),

    /**
     * 分销联盟
     */
    @XmlEnumValue("Distribution")
    Distribution(30, "Distribution"),

    /**
     * BI 统计
     */
    @XmlEnumValue("BIChannel")
    BIChannel(31, "BIChannel"),

    /**
     * 金融渠道
     */
    @XmlEnumValue("Finance")
    Finance(32, "Finance"),

    /**
     * 确认客户
     */
    @XmlEnumValue("ConfirmCustomer")
    ConfirmCustomer(33, "ConfirmCustomer"),

    /**
     * 香港站
     */
    @XmlEnumValue("HKSite")
    HKSite(34, "HKSite"),

    /**
     * 韩国站
     */
    @XmlEnumValue("KRSite")
    KRSite(35, "KRSite"),

    /**
     * 日本站
     */
    @XmlEnumValue("JPSite")
    JPSite(36, "JPSite"),

    /**
     * 新加坡站
     */
    @XmlEnumValue("SGSite")
    SGSite(37, "SGSite"),

    /**
     * 台湾站
     */
    @XmlEnumValue("TWSite")
    TWSite(38, "TWSite"),

    /**
     * 泰国站
     */
    @XmlEnumValue("THSite")
    THSite(39, "THSite"),

    /**
     * 去哪儿
     */
    @XmlEnumValue("Qunar")
    Qunar(40, "Qunar");

    private final int intValue;
    private final String value;

    ChannelIDType(int intValue, String value) {
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
    public static ChannelIDType fromValue(String v) {
        for (ChannelIDType e: ChannelIDType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static ChannelIDType findByValue(int value) {
        switch (value) {
            case 0:
                return FlightOnline;
            case 1:
                return FlightOffline;
            case 2:
                return FlightExternal;
            case 3:
                return FlightIntlOnline;
            case 4:
                return FlightIntlOffline;
            case 5:
                return FltIntlExternal;
            case 6:
                return FlightIntlOnlineSEO;
            case 7:
                return Corporation;
            case 8:
                return CorpOffline;
            case 9:
                return CorpMobile;
            case 10:
                return Vacation;
            case 11:
                return VacationGroup;
            case 12:
                return RestrictedVacation;
            case 13:
                return FitTravel;
            case 14:
                return Mobile;
            case 15:
                return MobileH5;
            case 16:
                return Hotel;
            case 17:
                return AirHotel;
            case 18:
                return AirHotelIntl;
            case 19:
                return AirHotelIntlEx;
            case 20:
                return AirHotelPackage;
            case 21:
                return EnglishSite;
            case 22:
                return HighRail;
            case 23:
                return Affiliate;
            case 24:
                return Luxury;
            case 25:
                return Customer;
            case 26:
                return Mice;
            case 27:
                return Community;
            case 28:
                return EzTravel;
            case 29:
                return Wingon;
            case 30:
                return Distribution;
            case 31:
                return BIChannel;
            case 32:
                return Finance;
            case 33:
                return ConfirmCustomer;
            case 34:
                return HKSite;
            case 35:
                return KRSite;
            case 36:
                return JPSite;
            case 37:
                return SGSite;
            case 38:
                return TWSite;
            case 39:
                return THSite;
            case 40:
                return Qunar;
            default:
                return null;
        }
    }
}