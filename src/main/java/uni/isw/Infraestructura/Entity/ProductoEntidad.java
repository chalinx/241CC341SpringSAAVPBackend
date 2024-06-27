

package uni.isw.Infraestructura.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//asdsad
@Entity
@Table(name = "Producto")
@Data
@NoArgsConstructor
public class ProductoEntidad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;
    private String descripcion;
    private String urlImagen;
    private Double precio;
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @UpdateTimestamp
    private LocalDateTime actualizafecha;
    
    @ManyToOne
    private UserEntidad userEntidad;
    @ManyToOne
    private CategoryEntidad categoryEntidad;
    
    
}
