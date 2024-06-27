
package uni.isw.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String email;
    private String direccion;
    private String telefono;
    private UserType userType;
    private String contraseña;    
    private LocalDateTime fechacreacion;
    private LocalDateTime actualizarfecha;
}
