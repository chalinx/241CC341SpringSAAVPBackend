
package uni.isw.repository;

import uni.isw.model.Product;

public interface IProductoRepositorio {
    Product save(Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
    
}
