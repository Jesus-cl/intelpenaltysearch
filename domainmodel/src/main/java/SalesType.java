/**
 * Created by c_liang on 2017/7/20.
 * Description：不同客户端
 */
public enum SalesType {
    Unknown(0),
    /**
     * ==机票==
     * 1：网上
     * 2：人工
     * 4：Online SEO
     */
    FlightIntlOnline(1),
    FlightIntlOffline(2),
    FlightIntlOnlineSEO(4),
    /**
     * ==无线==
     * 8： 无线
     * 16：无线H5
     */
    Mobile(8),
    MobileH5(16),
    /**
     * ==度假==
     *32： 度假
     * 64：团队游
     * 128：自由行
     */
    Vacation(32),
    VacationGroup(64),
    FitTravel(128),
    /**
     *==商旅==
     * 商旅 256
     * 商旅 Offline 512
     * 商旅 Mobile 1024
     */
    Corporation(256),
    CorpOffline(512),
    CorpMobile(1024),
    /**
     * ==机+酒==
     * 2048 机 + 酒
     * 4096 新机+酒
     */
    AirHotelIntl(2048),
    AirHotelIntlEx(4096),
    /**
     * ==SBU==
     * 英文
     * 高铁
     * 分销联盟
     * 高端旅游
     * 市场客户
     * Mice
     * 攻略社区
     * 易游网
     * 永安
     */
    EnglishSite(8192),
    HighRail(16384),
    Affiliate(32768),
    Luxury(65536),
    Customer(131072),
    Mice(262144),
    Community(524288),
    EzTravel(1048576),
    Wingon(2097152),
    HKSite(4194304),
    KRSite(8388608),
    JPSite(16777216),
    TWSite(33554432),
    THSite(67108864),
    SGSite(134217728),
    Qunar(268435456);

    private int value;

    SalesType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
