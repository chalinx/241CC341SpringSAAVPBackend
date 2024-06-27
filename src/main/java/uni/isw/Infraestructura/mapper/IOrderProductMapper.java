/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.Infraestructura.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uni.isw.Infraestructura.Entity.OrderProductEntidad;
import uni.isw.model.OrderProduct;


@Mapper(componentModel="spring")
public interface IOrderProductMapper {
      @Mappings(
            {
                @Mapping(source = "id",target="id"),
                @Mapping(source = "cantidad",target="cantidad"),
                @Mapping(source = "precio",target="precio"),
                @Mapping(source = "productId",target="productId")
              
            }   
    )
    
    OrderProduct toOrderProduct(OrderProductEntidad orderProductEntidad);
    Iterable<OrderProduct> toOrderProductList(Iterable<OrderProductEntidad> orderProductEntidades);
    
    @InheritConfiguration
    OrderProductEntidad toOrderProductEntidad(OrderProduct orderProduct);
}
