package uni.isw.Infraestructura.adapter;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uni.isw.Infraestructura.Entity.OrderEntity;
import uni.isw.Infraestructura.Entity.UserEntidad;
import uni.isw.model.OrderState;

public interface IOrderCrudRepository extends CrudRepository<OrderEntity, Integer> {
    
    @Transactional
    @Modifying
    @Query("UPDATE OrderEntity o SET o.orderState = :state WHERE o.id = :id")
    void updateStateById(Integer id, OrderState state);
    
    Iterable<OrderEntity> findByUserEntidad(UserEntidad userEntidad);
}
