package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Admin;
import org.example.dto.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void saveEmployee(org.example.dto.Employee employee) {
        employeeRepository.save(objectMapper.convertValue(employee, org.example.entity.Employee.class));
    }
    @Override
    public List<org.example.dto.Employee> getAllEmployee() {
        List<org.example.entity.Employee> all = employeeRepository.findAll();
        ArrayList<org.example.dto.Employee> employees = new ArrayList<>();
        for (org.example.entity.Employee employee:all){
            org.example.dto.Employee employee1 = objectMapper.convertValue(employee, org.example.dto.Employee.class);
            employees.add(employee1);
        }
        return employees;
    }
}
