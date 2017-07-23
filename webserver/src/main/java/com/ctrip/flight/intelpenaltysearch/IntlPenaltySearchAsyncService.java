package com.ctrip.flight.intelpenaltysearch;

import com.ctrip.soa.flight.aggregator.intlpenaltysearch.v1.IntlPenaltySearch;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;
import com.google.common.base.Stopwatch;
import org.apache.commons.lang3.*;
import ctrip.api.flight.message.product.intlpenaltysearch.v1.IntlPenaltySearchRequestType;
import ctrip.api.flight.message.product.intlpenaltysearch.v1.IntlPenaltySearchResponseType;
/**
 * Created by c_liang on 2017/7/19.
 * Description：
 */
public class IntlPenaltySearchAsyncService implements IntlPenaltySearch {

    private  Stopwatch _swGlobal = new Stopwatch();
    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        return new CheckHealthResponseType();
    }

    @Override
    public IntlPenaltySearchResponseType intlPenaltySearch(IntlPenaltySearchRequestType request) throws Exception {

        return null;
    }
}
