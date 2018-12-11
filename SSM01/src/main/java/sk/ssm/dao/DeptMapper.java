package sk.ssm.dao;

import sk.ssm.entity.Dept;

import java.util.List;

public interface DeptMapper {
    //查询全部员工信息
    List<Dept> selectDepts();
}
