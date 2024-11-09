package org.example.service;

import org.example.dto.Admin;
import org.example.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
