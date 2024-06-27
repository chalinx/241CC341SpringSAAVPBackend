/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.isw.service;

import uni.isw.model.User;
import uni.isw.repository.IUserRepositorio;

/**
 *
 * @author BIENVENIDO
 */
public class UserServicio {

    public UserServicio(IUserRepositorio iuserRepositorio) {
        this.iuserRepositorio = iuserRepositorio;
    }
    private final IUserRepositorio iuserRepositorio;

   public User save(User user){
       return this.iuserRepositorio.save(user);
   }
    
   public User findById(Integer id){
       return this.iuserRepositorio.findById(id);
   }
   
   
}
