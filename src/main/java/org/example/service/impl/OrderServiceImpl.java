package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Orders;
import org.example.repository.OrderRepository;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void saveOrder(Orders order){
        orderRepository.save(objectMapper.convertValue(order, org.example.entity.Orders.class));

    }
    @Override
    public List<Orders> getAllOrder() {
        List<org.example.entity.Orders> all = orderRepository.findAll();
        ArrayList<Orders> orders = new ArrayList<>();
        for (org.example.entity.Orders order:all){
            Orders order1 = objectMapper.convertValue(order, Orders.class);
            orders.add(order1);

        }
        return orders;
    }
}
