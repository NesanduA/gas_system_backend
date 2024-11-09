package org.example.controller;

import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public void create(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
