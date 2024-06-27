/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.isw.Infraestructura.adapter;

import uni.isw.Infraestructura.Entity.UserEntidad;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BIENVENIDO
 */
public interface IUserCrudRepository extends CrudRepository<UserEntidad,Integer>{
    
}
