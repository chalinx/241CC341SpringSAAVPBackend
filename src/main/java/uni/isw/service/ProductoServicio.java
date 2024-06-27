/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.isw.service;

import uni.isw.model.Product;
import uni.isw.repository.IProductoRepositorio;


/**
 *
 * @author BIENVENIDO
 */
public class ProductoServicio {
    public ProductoServicio(IProductoRepositorio iProductoRepositorio) {
        this.iProductoRepositorio = iProductoRepositorio;
    }
    private final IProductoRepositorio iProductoRepositorio;
    
    public Product save(Product product){
        return this.iProductoRepositorio.save(product);
    }
   
    public Iterable<Product> findAll(){
        return this.iProductoRepositorio.findAll();
    }
    
    public Product findById(Integer id){
        return this.iProductoRepositorio.findById(id);
    }
    
    public void deleteByid(Integer id){
        this.iProductoRepositorio.deleteById(id);
    }
}
