
package uni.isw.service;

import lombok.AllArgsConstructor;
import uni.isw.model.Order;
import uni.isw.repository.IOrderRepository;


public class OrderService {
    
    private final IOrderRepository iOrderRepository;
    
    public OrderService(IOrderRepository iOrderRepository){
            this.iOrderRepository=iOrderRepository;
    }
    
    public Order save(Order order){
        return this.iOrderRepository.save(order);
    }

    public Iterable<Order> findAll(){
        return this.iOrderRepository.findAll();
    }

    public Iterable<Order> finByUserId(Integer userId){
        return this.iOrderRepository.findByUserId(userId);
    }

    public void updateStateById(Integer id, String state){
        this.iOrderRepository.updateStateById(id, state);
    }
    
    public Order findById(Integer id){
        return this.iOrderRepository.findById(id);
    }
}
