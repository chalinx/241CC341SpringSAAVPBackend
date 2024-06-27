/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.Infraestructura.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uni.isw.Infraestructura.Entity.ProductoEntidad;
import uni.isw.model.Product;

@Mapper(componentModel= "spring")
public interface ProductMapper {

      @Mappings(
        
                {
                
                    @Mapping(source="id",target="id"),
                    @Mapping(source="name",target="name"),
                    @Mapping(source="code",target="code"),                    
                    @Mapping(source="descripcion",target="descripcion"),
                    @Mapping(source="urlImagen",target="urlImagen"),
                    @Mapping(source="precio",target="precio"),
                    @Mapping(source="fechaCreacion",target="fechaCreacion"),
                    @Mapping(source="actualizafecha",target="actualizafecha"),
                    @Mapping(source="userEntidad.id",target="userId"),
                    @Mapping(source="categoryEntidad.id",target="categoryId")


                }
        )
    Product toProduct(ProductoEntidad productoEntidad);
    Iterable<Product> toProductList(Iterable<ProductoEntidad> productoEntidades);
    
    @InheritConfiguration
    ProductoEntidad toProductoEntidad(Product product);
}





