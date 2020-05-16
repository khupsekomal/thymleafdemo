package com.luv2code.springbootdemo.thymleafdemo.controller;

import com.luv2code.springbootdemo.thymleafdemo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/list")
    public String listEmployees(Model model){
        //create employee list
        Employee employee1 = new Employee(1,"Ram","Shrihari","ram@luv2code.com");
        Employee employee2 = new Employee(2,"Sham","Kotu","s@luv2code.com");
        Employee employee3 = new Employee(3,"Luv","Ayo","l@luv2code.com");
        Employee employee4 = new Employee(4,"Kus","Sury","k@luv2code.com");

        //add into list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        //return spring model
            model.addAttribute("employees",employeeList);
        return "employee-list";
    }


}
