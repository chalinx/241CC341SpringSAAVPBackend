
package uni.isw.Infraestructura.adapter;

import javax.management.RuntimeErrorException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import uni.isw.Infraestructura.mapper.ProductMapper;
import uni.isw.model.Product;
import uni.isw.repository.IProductoRepositorio;

@Repository
@AllArgsConstructor
public class ProductCrudRepositoryImpl implements IProductoRepositorio{
    
    private IProductCrudRepository iProductCrudRepository;
    private ProductMapper productMapper;
    
    @Override
    public Product save(Product product) {
        return productMapper.toProduct(iProductCrudRepository.save(productMapper.toProductoEntidad(product)));
    }

    @Override
    public Iterable<Product> findAll() {
        return productMapper.toProductList(iProductCrudRepository.findAll());
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.toProduct(iProductCrudRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Producto con id. "+id+" no se encuentra")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iProductCrudRepository.findById(id).orElseThrow(
               ()->new RuntimeException("Producto con id: "+id+" no se encuentra")
        );
        iProductCrudRepository.deleteById(id);
    }
    
    
    
}
