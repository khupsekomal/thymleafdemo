package com.luv2code.springbootdemo.thymleafdemo.controller;

import com.luv2code.springbootdemo.thymleafdemo.dao.EmployeeRepository;
import com.luv2code.springbootdemo.thymleafdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        //create employee list
        List<Employee> employeeList = employeeRepository.findAll();

        //add into list



        //return spring model
            model.addAttribute("employees",employeeList);
        return "employee-list";
    }


}
