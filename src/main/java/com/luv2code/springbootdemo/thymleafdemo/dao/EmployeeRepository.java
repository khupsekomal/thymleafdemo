package com.luv2code.springbootdemo.thymleafdemo.dao;


import com.luv2code.springbootdemo.thymleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
