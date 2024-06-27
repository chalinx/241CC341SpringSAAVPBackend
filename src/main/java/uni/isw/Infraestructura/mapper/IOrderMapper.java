/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.Infraestructura.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uni.isw.Infraestructura.Entity.OrderEntity;
import uni.isw.Infraestructura.mapper.IOrderProductMapper;
import uni.isw.model.Order;


@Mapper(componentModel="spring", uses={IOrderProductMapper.class})
public interface IOrderMapper {
    
    @Mappings(
            {
            
                @Mapping(source="id",target="id"),
                @Mapping(source="creaciondato",target="creaciondato"),
                @Mapping(source="userEntidad.id",target="userId"),
                @Mapping(source="orderProducts",target="orderProducts"),
                @Mapping(source="orderState",target="orderState")

            
            }   
    )
    
    Order toOrder(OrderEntity orderEntity);
    
    Iterable<Order> toOrderList(Iterable<OrderEntity> orderEntidades);
    
    @InheritInverseConfiguration
    OrderEntity toOrderEntity(Order order);
    
    
    
}
