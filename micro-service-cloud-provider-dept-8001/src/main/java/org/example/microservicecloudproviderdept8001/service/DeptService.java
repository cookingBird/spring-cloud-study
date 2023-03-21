package org.example.microservicecloudproviderdept8001.service;

import entity.Dept;

import java.util.List;

public interface DeptService {
  Dept get(Integer deptNo);
  List<Dept> selectAll();
}
