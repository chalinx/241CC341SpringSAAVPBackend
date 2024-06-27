/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.isw.service;

import uni.isw.model.Categoria;
import uni.isw.repository.ICategoriaRepositorio;

/**
 *
 * @author BIENVENIDO
 */
public class CategoriaServicio {

    public CategoriaServicio(ICategoriaRepositorio categoriaRepositorio) {
        this.icategoriaRepositorio = categoriaRepositorio;
    }
    private final ICategoriaRepositorio icategoriaRepositorio;
    
   public Categoria save(Categoria categoria){
        return icategoriaRepositorio.save(categoria);
   }
   
   public Iterable<Categoria> findAll(){
       return icategoriaRepositorio.findAll();
   }
   
   public Categoria findById(Integer id){
       return icategoriaRepositorio.findById(id);
   }
   
   public void deleteById(Integer id){
       icategoriaRepositorio.deleteById(id);
   }
}
