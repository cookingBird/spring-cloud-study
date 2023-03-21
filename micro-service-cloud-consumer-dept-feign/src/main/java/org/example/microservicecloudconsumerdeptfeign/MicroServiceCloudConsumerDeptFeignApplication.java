package org.example.microservicecloudconsumerdeptfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //开启 OpenFeign 功能
@EnableHystrix
public class MicroServiceCloudConsumerDeptFeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroServiceCloudConsumerDeptFeignApplication.class, args);
  }

}
