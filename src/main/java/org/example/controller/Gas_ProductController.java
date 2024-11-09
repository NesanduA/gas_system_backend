package org.example.controller;

import org.example.dto.Gas_Product;
import org.example.service.Gas_ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gas_product")
public class Gas_ProductController {
    @Autowired
    private Gas_ProductService gas_productService;
    @PostMapping("/save")
    public void create(@RequestBody Gas_Product gas_product){
        gas_productService.saveGas_Product(gas_product);

    }
    @GetMapping("/get-all")
    public List<Gas_Product> getAllGas_Product(){
        return gas_productService.getAllGas_Product();
    }

}
