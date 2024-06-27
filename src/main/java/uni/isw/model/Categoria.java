
package uni.isw.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    private Integer id;
    private String name;
    private LocalDateTime creacionDato;
    private LocalDateTime actualizarDato;
}
