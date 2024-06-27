
package uni.isw.Infraestructura.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.isw.model.Product;
import uni.isw.service.ProductoServicio;


@RestController
@RequestMapping("api/v1/admin/products")
@Slf4j
@AllArgsConstructor
public class ProductController {
    
    private final ProductoServicio productoServicio;
    
    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        log.info("Nombre producto: {}",product.getName());
        return new ResponseEntity<>(productoServicio.save(product),HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<Iterable<Product>> findAll(){
        return ResponseEntity.ok(productoServicio.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id){
       return ResponseEntity.ok(productoServicio.findById(id));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        productoServicio.deleteByid(id);
        return ResponseEntity.ok().build();
    }
    
}
    