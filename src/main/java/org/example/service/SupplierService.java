package org.example.service;

import org.example.dto.Supplier;

import java.util.List;

public interface SupplierService {
    void saveSupplier(Supplier supplier);
    List<Supplier> getAllSupplier();
}
