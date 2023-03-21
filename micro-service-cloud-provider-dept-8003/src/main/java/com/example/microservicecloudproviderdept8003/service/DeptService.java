package com.example.microservicecloudproviderdept8003.service;

import com.example.microservicecloudproviderdept8003.entity.Dept;

import java.util.List;


public interface DeptService {
  Dept getDeptByKey(Integer deptNo);

  List<Dept> getAll();
}
