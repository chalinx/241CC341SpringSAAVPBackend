package uni.isw.Infraestructura.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uni.isw.Infraestructura.Entity.CategoryEntidad;
import uni.isw.model.Categoria;


@Mapper(componentModel="spring")
public interface CategoriaMapper {
   
        @Mappings(
                {
                @Mapping(source = "id", target="id"),
                @Mapping(source = "name", target="name"),
                @Mapping(source = "creacionDato", target="creacionDato"),               
                @Mapping(source = "actualizarDato", target="actualizarDato"),
                }
        )
    

    
Categoria toCategory(CategoryEntidad categoryEntidad);
Iterable<Categoria> toCategoriaList(Iterable<CategoryEntidad> categoryEntidades);

@InheritInverseConfiguration
CategoryEntidad toCategoryEntidad(Categoria categoria);

}
