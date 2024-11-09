package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Supplier;
import org.example.repository.SupplierRepository;
import org.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void saveSupplier(org.example.dto.Supplier supplier) {
        supplierRepository.save(objectMapper.convertValue(supplier, org.example.entity.Supplier.class));

    }
    @Override
    public List<org.example.dto.Supplier> getAllSupplier() {
        List<org.example.entity.Supplier> all = supplierRepository.findAll();
        ArrayList<org.example.dto.Supplier> suppliers = new ArrayList<>();
        for (org.example.entity.Supplier supplier:all){
            org.example.dto.Supplier supplier1 = objectMapper.convertValue(supplier,org.example.dto.Supplier.class);
            suppliers.add(supplier1);
        }
        return suppliers;
    }
}
