package com.ctrip.flight.intelpenaltysearch;

import org.springframework.boot.SpringApplication;

import java.awt.*;
import java.net.URI;

/**
 * 测试SOA服务
 */
public class ServiceStarter {

  public static void main(String[] args) throws Exception {
    System.setProperty("java.awt.headless", "false");

    SpringApplication.run(ServiceInitializer.class);

    // port 9090 is configured in src/test/resources/application.properties(key: server.port)
    Desktop.getDesktop().browse(new URI("http://127.0.0.1:9090/api"));
  }
}
