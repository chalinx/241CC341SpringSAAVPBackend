
package uni.isw.Infraestructura.adapter;

import org.springframework.stereotype.Repository;
import uni.isw.Infraestructura.mapper.CategoriaMapper;
import uni.isw.model.Categoria;
import uni.isw.repository.ICategoriaRepositorio;

@Repository
public class CategoriaCrudRepositoryImpl implements ICategoriaRepositorio{
    
    private final ICategoriaCrudRepository iCategoriaCrudRepository;
    private final CategoriaMapper categoriaMapper;
    
    public CategoriaCrudRepositoryImpl(ICategoriaCrudRepository iCategoriaCrudRepository,CategoriaMapper categoriaMapper ){
            this.iCategoriaCrudRepository=iCategoriaCrudRepository;
            this.categoriaMapper=categoriaMapper;
    }
    
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaMapper.toCategory(iCategoriaCrudRepository.save(categoriaMapper.toCategoryEntidad(categoria)));
    }

    @Override
    public Iterable<Categoria> findAll() {
        return categoriaMapper.toCategoriaList(iCategoriaCrudRepository.findAll());        
    }

    @Override
    public Categoria findById(Integer id) {
        return categoriaMapper.toCategory(iCategoriaCrudRepository.findById(id).orElseThrow(
               ()->new RuntimeException("Categoria con id: "+id+" no existe")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iCategoriaCrudRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Categoria con id: "+id+" no existe")
        );
        iCategoriaCrudRepository.deleteById(id);
    }
    
}
