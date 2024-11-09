package org.example.service;

import org.example.dto.Orders;

import java.util.List;

public interface OrderService {
    void saveOrder(Orders order);
    List<Orders> getAllOrder();
}
