package org.example.microservicecloudconfigclientbus3366.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

  @Value ("${server.port}")
  private String serverPort;
  @Value("${config.info}")
  private String configInfo;
  @Value ("${config.version}")
  private String configVersion;
  @GetMapping (value = "/getConfig")
  public String getConfig() {
    return "info：" + configInfo + "<br/>version：" + configVersion + "<br/>port：" + serverPort;
  }

}
