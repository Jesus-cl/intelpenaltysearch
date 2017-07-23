package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：
 */
public enum ChangeType {
    //退票
    Refund(1),
    //改期
    Revalidation(2),
    //换开
    Reissue(4);

    private int value;

    ChangeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
