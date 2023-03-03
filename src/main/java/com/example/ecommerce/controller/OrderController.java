package com.example.ecommerce.controller;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")

public class OrderController {


    @Autowired
    private IOrderService iOrderService;

    @GetMapping("/")
    public ResponseEntity<?> getOrders() {
        return iOrderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrdersById(@PathVariable Long id) {
        return iOrderService.getOrder(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchProduct(@PathVariable Long id, @RequestBody Order order) {
        return iOrderService.patchOrder(id, order);
    }

    @PostMapping("/")
    public ResponseEntity<?> postProduct(@RequestBody Order order) {
        return iOrderService.postOrder(order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        return iOrderService.deleteOrder(id);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getOrdersByUser(@PathVariable Long id) {
        return iOrderService.getOrdersByUser(id);
    }
}