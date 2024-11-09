package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.Gas_Product;
import org.example.repository.Gas_ProductRepository;
import org.example.service.Gas_ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Gas_ProductServiceImpl implements Gas_ProductService {
    @Autowired
    private Gas_ProductRepository gas_productRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void saveGas_Product(org.example.dto.Gas_Product gas_product){
        gas_productRepository.save(objectMapper.convertValue(gas_product, Gas_Product.class));

        }
        @Override
    public List<org.example.dto.Gas_Product> getAllGas_Product() {
        List<Gas_Product> all = gas_productRepository.findAll();
            ArrayList<org.example.dto.Gas_Product> gas_products = new ArrayList<>();
            for (Gas_Product gas_product:all){
                org.example.dto.Gas_Product gas_product1 = objectMapper.convertValue(gas_product,org.example.dto.Gas_Product.class);
                gas_products.add(gas_product1);

            }
            return gas_products;
        }
    }
