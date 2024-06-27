
package uni.isw.Infraestructura.adapter;

import org.springframework.data.repository.CrudRepository;
import uni.isw.Infraestructura.Entity.ProductoEntidad;


public interface IProductCrudRepository extends CrudRepository<ProductoEntidad, Integer> {
    
}
