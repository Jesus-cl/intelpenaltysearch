package com.ctrip.flight.intelpenaltysearch.soa;

import com.ctrip.soa.flight.aggregator.intlpenaltysearch.v1.IntlPenaltySearch;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;
import ctrip.api.flight.message.product.intlpenaltysearch.v1.IntlPenaltySearchRequestType;
import ctrip.api.flight.message.product.intlpenaltysearch.v1.IntlPenaltySearchResponseType;
import org.springframework.stereotype.Component;

/**
 * Created by c_liang on 2017/7/12.
 * Description：IPS的SOA2.0服务测试
 */
@Component
public class IpsSOAImpl implements IntlPenaltySearch {

    @Override
    public IntlPenaltySearchResponseType intlPenaltySearch(IntlPenaltySearchRequestType request) throws Exception {
        IntlPenaltySearchResponseType respone = new IntlPenaltySearchResponseType();
        return respone;
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        return new CheckHealthResponseType();
    }
}
