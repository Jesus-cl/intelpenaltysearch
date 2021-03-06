package com.ctrip.flight.intelpenaltysearch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

// 默认只会Component Scan com.ctrip.flight.intelpenaltysearch以及其子package，如果需要Scan更多的package可以使用@SpringBootApplication(scanBasePackages = {"com.ctrip.flight.intelpenaltysearch", "other package"})
@SpringBootApplication
@ServletComponentScan
public class WebInitializer extends SpringBootServletInitializer {

  /**
   * Configure your application when it’s launched by the servlet container
   */
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(WebInitializer.class);
  }
}
