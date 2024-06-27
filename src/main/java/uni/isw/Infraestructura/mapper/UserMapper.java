package uni.isw.Infraestructura.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uni.isw.Infraestructura.Entity.UserEntidad;
import uni.isw.model.User;


@Mapper(componentModel="spring")
public interface UserMapper {
    
    @Mappings(
            {
                @Mapping(source = "id", target="id"),
                @Mapping(source = "nombre", target="nombre"),
                @Mapping(source = "apellidopaterno", target="apellidopaterno"),
                @Mapping(source = "apellidomaterno", target="apellidomaterno"),
                @Mapping(source = "email", target="email"),
                @Mapping(source = "direccion", target="direccion"),
                @Mapping(source = "telefono", target="telefono"),
                @Mapping(source = "userType", target="userType"),
                @Mapping(source = "contraseña", target="contraseña"),
                @Mapping(source = "fechacreacion", target="fechacreacion"),
                @Mapping(source = "actualizarfecha", target="actualizarfecha"),
                

            }
    )
    
    User toUser(UserEntidad userEntidad);
    Iterable<User> toUsers(Iterable<UserEntidad> userEntidades);
    
    @InheritInverseConfiguration
    UserEntidad toUserEntidad(User user);
}
   