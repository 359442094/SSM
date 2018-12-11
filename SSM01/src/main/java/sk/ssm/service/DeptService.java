package sk.ssm.service;

import sk.ssm.entity.Dept;

import java.util.List;

public interface DeptService {
    //查询全部员工信息
    List<Dept> selectDepts();
}
