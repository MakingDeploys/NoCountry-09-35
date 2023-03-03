package com.example.ecommerce.service.interfaces;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.Product;
import org.springframework.http.ResponseEntity;

public interface IOrderService {
    ResponseEntity<?> getAllOrders();

    ResponseEntity<?> getOrder(Long id);

    ResponseEntity<?> getOrdersByUser(Long id);

    ResponseEntity<?> postOrder(Order order);

    ResponseEntity<?> patchOrder(Long id, Order order);

    ResponseEntity<?> deleteOrder(Long id);

}