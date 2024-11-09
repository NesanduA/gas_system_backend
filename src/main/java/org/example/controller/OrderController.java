package org.example.controller;

import org.example.dto.Orders;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public void create(@RequestBody Orders order){
        orderService.saveOrder(order);
    }

    @GetMapping("/get-all")
    public List<Orders> get(){
        return orderService.getAllOrder();
    }

}
