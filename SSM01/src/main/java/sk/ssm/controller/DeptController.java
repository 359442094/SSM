package sk.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.ssm.entity.Dept;
import sk.ssm.service.DeptService;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/test")
    public String test(){
        System.out.println(deptService);
        List<Dept> depts = deptService.selectDepts();
        System.out.println(depts);
        return "index";
    }

}
