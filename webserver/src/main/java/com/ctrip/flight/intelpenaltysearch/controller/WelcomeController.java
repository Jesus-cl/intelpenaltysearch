package com.ctrip.flight.intelpenaltysearch.controller;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ctrip.framework.soa.hellosoa.HelloRequestType;
import com.ctrip.framework.soa.hellosoa.HelloResponseType;
import com.ctrip.framework.soa.hellosoa.HelloSOAServiceClient;

@Controller
public class WelcomeController {

	private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

	@Value("${application.message:Hello from Ctrip Framework!}")
	private String message = "Hello from Ctrip Framework!";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) throws Exception {
		model.put("time", new Date());
		model.put("message", this.message);
		model.put("soaResponse", callSoa());
		return "welcome";
	}

	private String callSoa() {
		String msg = "";

		try {
			// TODO TEST ONLY, REMOVE THIS
			String _serviceUrl = "http://127.0.0.1:9090/api";

			HelloSOAServiceClient client = HelloSOAServiceClient.getInstance(_serviceUrl);

			HelloRequestType request = new HelloRequestType();
			request.setName("Developer");
			request.setService("Java Starter");

			HelloResponseType response = client.hello(request);
			msg = response.getHelloInfo().getMessage();
		} catch (Exception e) {
			log.error("Error calling soa", e);
			msg = e.getMessage();
		}

		return msg;
	}

}