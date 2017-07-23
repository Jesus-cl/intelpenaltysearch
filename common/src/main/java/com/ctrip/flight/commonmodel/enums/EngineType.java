package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：引擎的类别
 * 资源组定义[BD_AllocationStrategy]：1:GDS大系统 ,2:Abacus,32:Amadues,64:Travelsky，128:春秋 .....
 */
public enum EngineType {
    Unknown(0),
    Ctrip(1),
    Abacus(2),
    JetStar(4),
    TravelFusion(8),
    Charter(16),
    Amadeus(32),
    TSK(64),
    Spring(128),
    SharedPlatform(256),
    CharterPlatform(512),
    Consolidator(1024);

    private int value;

    EngineType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
