package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：乘客类型，包括成人、儿童和婴儿
 */
public enum PassengerType {
    UNKNOWN(0),//未知
    ADT(1),
    CHD(2),
    INF(4);

    private int value;

    PassengerType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
