
package uni.isw.repository;

import uni.isw.model.Categoria;


public interface ICategoriaRepositorio {
    Categoria save(Categoria categoria);
    Iterable<Categoria> findAll();
    Categoria findById(Integer id);
    void deleteById(Integer id);
}
