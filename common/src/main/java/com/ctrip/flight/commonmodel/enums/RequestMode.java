package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：
 */
public enum RequestMode {
    // 一次请求相同引擎
    AllOneEngine(0),
    //一次请求多个引擎
    MultiEngines(1);

    private int value;

    RequestMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
