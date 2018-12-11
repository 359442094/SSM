package sk.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.ssm.dao.DeptMapper;
import sk.ssm.entity.Dept;
import sk.ssm.service.DeptService;

import java.util.List;

@Transactional
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectDepts() {
        return deptMapper.selectDepts();
    }
}
