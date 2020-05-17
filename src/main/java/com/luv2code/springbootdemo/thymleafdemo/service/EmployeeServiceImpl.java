package com.luv2code.springbootdemo.thymleafdemo.service;


import com.luv2code.springbootdemo.thymleafdemo.dao.EmployeeRepository;
import com.luv2code.springbootdemo.thymleafdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theemployeeRepository){
        employeeRepository=theemployeeRepository;
    }
    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }}

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
