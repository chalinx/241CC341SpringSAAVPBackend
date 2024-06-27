
package uni.isw.Infraestructura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uni.isw.repository.ICategoriaRepositorio;
import uni.isw.repository.IOrderRepository;
import uni.isw.repository.IProductoRepositorio;
import uni.isw.repository.IUserRepositorio;
import uni.isw.service.CategoriaServicio;
import uni.isw.service.OrderService;
import uni.isw.service.ProductoServicio;
import uni.isw.service.UserServicio;

@Configuration
public class BeanConfiguracion {
    @Bean
    public UserServicio userServicio(IUserRepositorio iUserRepositorio){
        return new UserServicio(iUserRepositorio);
    }
    @Bean
    public CategoriaServicio categoriaServicio(ICategoriaRepositorio icategoriaRepositorio){
        return new CategoriaServicio(icategoriaRepositorio);
    } 
    @Bean
    public ProductoServicio productoServicio(IProductoRepositorio iProductoRepositorio){
        return new ProductoServicio(iProductoRepositorio);
    }
    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
     return new OrderService(iOrderRepository);
    }
    
}
