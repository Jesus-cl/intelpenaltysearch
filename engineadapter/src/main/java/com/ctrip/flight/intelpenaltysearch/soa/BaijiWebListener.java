package com.ctrip.flight.intelpenaltysearch.soa;

/**
 * Created by c_liang on 2017/7/8.
 */
import com.ctriposs.baiji.rpc.server.BaijiListener;
import com.ctriposs.baiji.rpc.server.HostConfig;

import javax.servlet.annotation.WebListener;

@WebListener
public class BaijiWebListener extends BaijiListener {
    public BaijiWebListener(){
        super(IpsSOAImpl.class);
    }

    @Override
    protected void configure(final HostConfig hostConfig) {
    }
}
