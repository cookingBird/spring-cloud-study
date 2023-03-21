package org.example.microservicecloudproviderdept8002.controller;

import entity.Dept;
import lombok.extern.slf4j.Slf4j;
import org.example.microservicecloudproviderdept8002.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class DeptController {
  @Autowired
  private DeptServiceImpl deptService;

  @Value ("${server.port}")
  private String serverPort;

  @RequestMapping (value = "dept/get/{id}", method = RequestMethod.GET)
  public Dept get(@PathVariable ("id") int id) {
    return deptService.get(id);
  }

  @RequestMapping(value="dept/list", method = RequestMethod.GET)
  public List<Dept> list() {
    return deptService.selectAll();
  }

  //超时测试,该服务的响应时间为 5 秒
  @RequestMapping(value = "/dept/feign/timeout")
  public String DeptFeignTimeout() {
    //暂停 5 秒
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return serverPort;
  }
}
