
package uni.isw.Infraestructura.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import uni.isw.model.OrderState;


@Entity
@Table(name="orders")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private LocalDateTime creaciondato;
    @Enumerated(value=EnumType.STRING)
    private OrderState orderState;
    @ManyToOne
    private UserEntidad userEntidad;
    @OneToMany(mappedBy = "orderEntity",cascade = CascadeType.PERSIST)
    private List<OrderProductEntidad> orderProducts;
}
