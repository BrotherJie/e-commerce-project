package com.example.mall.dao;

import com.example.mall.pojo.Order;
import com.example.mall.pojo.OrderItem;
import com.example.mall.pojo.Product;
import com.example.mall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}
