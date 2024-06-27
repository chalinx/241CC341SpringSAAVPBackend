/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.repository;

import uni.isw.model.Order;

/**
 *
 * @author BIENVENIDO
 */
public interface IOrderRepository {
    
    Order save(Order order);
    
    Order findById(Integer id);
    
    Iterable<Order> findAll();
    
    Iterable<Order> findByUserId(Integer userId);
    
    void updateStateById(Integer id, String state);
    
    
    
    
}
