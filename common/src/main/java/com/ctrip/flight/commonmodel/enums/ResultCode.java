package com.ctrip.flight.commonmodel.enums;

/**
 * Created by c_liang on 2017/7/18.
 * Description：==查询结果代码说明==
 * -1：引擎正在处理中
 * 0：成功（有结果）
 * 1：请求或结果转换失败
 * 2：查询无结果
 * 3：过滤后无结果
 * 4：请求处理异常
 * 5：查询超时
 * 6：批量请求时，有部分引擎返回在“处理中”
 * 100:部分成功（聚合后状态，代表部分引擎有结果）
 */
public enum ResultCode {
    INPROCESS(-1),
    SUCCESS(0),
    TRANSFORMATION_FAILURE(1),
    SEARCH_NO_RESULT(2),
    FILTER_NO_RESULT(3),
    FAILURE(4),
    TIMEOUT(5),
    PARTIAL_INPROCESS(6),
    PARTIAL_SUCCESS(100);

    private int value;

    ResultCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
