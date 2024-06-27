/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.Infraestructura.adapter;

import org.springframework.data.repository.CrudRepository;
import uni.isw.Infraestructura.Entity.CategoryEntidad;

/**
 *
 * @author BIENVENIDO
 */
public interface ICategoriaCrudRepository extends CrudRepository<CategoryEntidad,Integer>{
    
}
