package com.ctrip.flight.intelpenaltysearch.soa;

import com.ctriposs.baiji.rpc.extensions.springboot.BaijiRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaijiServletConfiguration extends BaijiRegistrationBean {

	protected BaijiServletConfiguration() {
		super("/api/*", IpsSOAImpl.class);
	}

}

