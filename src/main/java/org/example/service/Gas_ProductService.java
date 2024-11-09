package org.example.service;

import org.example.dto.Gas_Product;

import java.util.List;

public interface Gas_ProductService {
    void saveGas_Product(Gas_Product gas_product);
    List<Gas_Product> getAllGas_Product();
}
