package org.example.microservicecloudconsumerdept80.config;

import com.netflix.loadbalancer.IRule;
import org.example.microservicecloudconsumerdept80.myrule.MyRandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

  @Bean //将 RestTemplate 注入到容器中
  @LoadBalanced //在客户端使用 RestTemplate 请求服务端时，开启负载均衡（Ribbon）
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Bean
  public IRule myRule() {
    // RandomRule 为随机策略
    return  new MyRandomRule();
  }

}
