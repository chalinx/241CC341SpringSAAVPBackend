
package uni.isw.Infraestructura.rest;

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
import uni.isw.model.Categoria;
import uni.isw.service.CategoriaServicio;

@RestController
@RequestMapping("/api/v1/admin/categories")
@Slf4j  //imprimir sin el systemO.print
public class CategoryController {
   
    private final CategoriaServicio categoriaServicio;
  
    public CategoryController(CategoriaServicio categoriaServicio){
        this.categoriaServicio=categoriaServicio;
    }
    
    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        return new ResponseEntity<>(categoriaServicio.save(categoria),HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<Iterable<Categoria>> findAll(){
        return ResponseEntity.ok(categoriaServicio.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findBy(@PathVariable Integer id){
        return ResponseEntity.ok(categoriaServicio.findById(id));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        categoriaServicio.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
