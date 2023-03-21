package org.example.microservicecloudconsumerdeptfeign.controller;

import entity.Dept;
import org.example.microservicecloudconsumerdeptfeign.service.DeptService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
  @Resource
  private DeptService deptService;

  @RequestMapping(value="/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Integer id){
    return deptService.get(id);
  }

  @RequestMapping(value="/consumer/dept/list")
  public List<Dept> list(){
    return deptService.list();
  }

  @RequestMapping(value = "/consumer/dept/feign/timeout")
  public String DeptFeignTimeout() {
    // openFeign-ribbon 客户端一般默认等待一秒钟，超过该时间就会报错
    return deptService.DeptFeignTimeout();
  }
}
