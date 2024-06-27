
package uni.isw.Infraestructura.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import uni.isw.Infraestructura.Entity.OrderEntity;
import uni.isw.Infraestructura.Entity.UserEntidad;
import uni.isw.Infraestructura.adapter.IOrderCrudRepository;
import uni.isw.Infraestructura.mapper.IOrderMapper;
import uni.isw.model.Order;
import uni.isw.model.OrderState;
import uni.isw.repository.IOrderRepository;


@Repository
public class OrderCrudRepositoryImpl implements IOrderRepository{

    private final IOrderMapper iOrderMapper;
    private final IOrderCrudRepository iOrderCrudRepository;
    
    public OrderCrudRepositoryImpl(IOrderMapper iOrderMapper,IOrderCrudRepository iOrderCrudRepository){
        this.iOrderCrudRepository=iOrderCrudRepository;
        this.iOrderMapper=iOrderMapper;
    }
    @Override
    public Order save(Order order) {
       OrderEntity orderEntity=iOrderMapper.toOrderEntity(order);
       orderEntity.getOrderProducts().forEach(
  
               orderProductEntidad->orderProductEntidad.setOrderEntity(orderEntity)
       
       );
       
       return iOrderMapper.toOrder(iOrderCrudRepository.save(orderEntity));
    }

    @Override
    public Order findById(Integer id) {
       return iOrderMapper.toOrder(iOrderCrudRepository.findById(id).orElseThrow(
               ()->new RuntimeException("Orden con id: "+id+" no encontrado")
       
       ));
    }

    @Override
    public Iterable<Order> findAll() {
        return iOrderMapper.toOrderList(iOrderCrudRepository.findAll());
    }

    @Override
    public Iterable<Order> findByUserId(Integer userId) {
         UserEntidad userEntidad=new UserEntidad();
         userEntidad.setId(userId);
         
         return iOrderMapper.toOrderList(iOrderCrudRepository.findByUserEntidad(userEntidad));
    }

    @Override
    public void updateStateById(Integer id, String state) {
         if(state.equals(OrderState.CANCELLED)){
             iOrderCrudRepository.updateStateById(id, OrderState.CANCELLED);
         }
         else{
             iOrderCrudRepository.updateStateById(id, OrderState.CONFIRMED);
         }
    }
    
}
