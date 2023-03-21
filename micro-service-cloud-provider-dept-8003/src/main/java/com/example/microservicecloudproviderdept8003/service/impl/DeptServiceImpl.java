package com.example.microservicecloudproviderdept8003.service.impl;

import com.example.microservicecloudproviderdept8003.entity.Dept;
import com.example.microservicecloudproviderdept8003.mapper.DeptMapper;
import com.example.microservicecloudproviderdept8003.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service (value = "deptService")
public class DeptServiceImpl implements DeptService {
  @Autowired
  private DeptMapper deptMapper;

  @Override
  public Dept getDeptByKey(Integer deptNo) {
    return deptMapper.selectByPrimaryKey(deptNo);
  }

  @Override
  public List<Dept> getAll() {
    return deptMapper.getAll();
  }
}
