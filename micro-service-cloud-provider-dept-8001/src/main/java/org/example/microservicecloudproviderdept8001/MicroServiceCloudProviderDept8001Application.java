package org.example.microservicecloudproviderdept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudProviderDept8001Application {

  public static void main(String[] args) {
    SpringApplication.run(MicroServiceCloudProviderDept8001Application.class, args);
  }

}
