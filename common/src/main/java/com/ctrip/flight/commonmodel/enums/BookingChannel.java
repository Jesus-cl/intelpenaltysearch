package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：
 */
public class BookingChannel {
    /**
     * 航班渠道——捷星
     */
    public static final String JetStar = "JS-WS";
    /**
     * 航班渠道——Travel Fusion
     */
    public static final String TravelFusion = "TF-WS";
    /**
     * 包座渠道
     */
    public static final String SeatPackage = "BZ-WS";
    /**
     * 航班渠道--春秋
     */
    public static final String Spring = "CS-WS";
    /**
     * 航班渠道--春秋伪直连
     */
    public static final String NewSpring = "CS-ES";
    /**
     * 航班渠道——Abacus
     */
    public static final String Abacus = "1B-WS";
    /**
     * 大系统
     */
    public static final String GDS = "GDS-WS";
    /**
     * 航班渠道——Amadeus[MP-WS修改为1A-WS]
     */
    public static final String Amadeus = "1A-WS";
    /**
     * 航班渠道---TSK
     */
    public static final String TSK = "TS-WS";
    /**
     * 共享平台
     */
    public static final String SharedPlatform = "ZY-WS";
    /**
     * 国航伪直连
     */
    public static final String AirChina = "CW-ES";
    /**
     * Odigeo
     */
    public static final String Odigeo = "OD-WS";
    /**
     * 北京众信
     */
    public static final String BJZX = "ZX-WS";
    /**
     * 春秋日本
     */
    public static final String SpringJapan = "IJ-WS";
    /**
     * 供应商直联
     */
    public static final String Consolidator = "CSD-WS";
    /**
     * 国航直联
     */
    public static final String NewAirChina = "CW-WS";
    /**
     * 香港航空直联
     */
    public static final String HKAirlines = "HX-WS";
    /**
     * 控位平台
     */
    public static final String CharterPlatform = "KW-WS";
    /**
     * 南航国际
     */
    public static final String CZAirlines = "CZD-WS";
    /**
     * 东航B2T
     */
    public static final String MUTAirlines = "MUT-WS";
    /**
     * 东航B2C
     */
    public static final String MUCAirlines = "MUC-WS";
    /**
     * 川航B2C
     */
    public static final String Airlines3U = "3UD-WS";
    /**
     * 深航
     */
    public static final String ZHDAirlines = "ZHD-WS";
    /**
     * 请求CSD查询退改签接口的标识
     */
    public static final String CSDQuerySearch = Consolidator + "_Extend";
    /**
     * CSD请求大系统的退改签时的标识
     */
    public static final String CSDSearchGds = Consolidator + GDS;
    /**
     * 请求TF格式化退改签接口的标识
     */
    public static final String TFFormation = TravelFusion + "_Formation";
    /**
     * 东航格式化标识
     */
    public static final String MUCFormation = MUCAirlines + "_Formation";
    /**
     * 国航格式化标识
     */
    public static final String CWFormation = NewAirChina + "_Formation";
}
