package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.EmployeeService;
import com.my.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/employee")
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmployee")
    public String queryAllEmployee(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);// 第pn页，每页10条记录
        List<Employee> employee = employeeService.queryALLEmployee();
        // 用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(employee);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println(pageInfo.toString());
        return "allEmployee";
    }

}
