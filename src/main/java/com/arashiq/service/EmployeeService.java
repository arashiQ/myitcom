package com.arashiq.service;

import com.arashiq.model.Employee;
import com.arashiq.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployee(Long employeeId){
        return employeeRepository.findOne(employeeId);
    }

    public List<Employee> getEmployees(Long userId){
        return employeeRepository.findByUserId(userId);
    }
}
