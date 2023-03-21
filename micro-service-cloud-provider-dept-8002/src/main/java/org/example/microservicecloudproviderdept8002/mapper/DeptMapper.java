package org.example.microservicecloudproviderdept8002.mapper;

import entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author dengtao
 */
@Mapper
public interface DeptMapper {
  /**
   * @param deptNo dept 主键 id
   */
   Dept selectByPrimaryKey(Integer deptNo);
   List<Dept> getAll();
}
