package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Customer;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ObjectMapper objectMapper;


    @Override
    public void saveCustomer(Customer customer) {

    }
    @Override
    public List<org.example.dto.Customer> getAllCustomer() {
        List<org.example.entity.Customer> all = customerRepository.findAll();
        ArrayList<org.example.dto.Customer> customers = new ArrayList<>();
        for (org.example.entity.Customer customer:all){
            org.example.dto.Customer customer1 = objectMapper.convertValue(customer,org.example.dto.Customer.class);
            customers.add(customer1);
        }
        return customers;
    }

}
