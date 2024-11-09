package org.example.controller;

import org.example.dto.Supplier;
import org.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/save")
    public void create(@RequestBody Supplier supplier){
        supplierService.saveSupplier(supplier);
    }
    @GetMapping("/get-all")
    public List<org.example.dto.Supplier> getAllSupplier(){
        return supplierService.getAllSupplier();
    }

}
