package org.example.controller;

import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/save")
    public void create(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }
    @GetMapping("/get-all")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
}
