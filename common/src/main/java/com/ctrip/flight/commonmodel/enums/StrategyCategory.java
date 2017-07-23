package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：
 */
public enum StrategyCategory {
    BeforeMerged(0),
    AfterMerged(1);

    private int value;

    StrategyCategory(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
