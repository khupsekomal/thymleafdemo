package com.luv2code.springbootdemo.thymleafdemo.service;



import com.luv2code.springbootdemo.thymleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void deleteById(int id);
}
