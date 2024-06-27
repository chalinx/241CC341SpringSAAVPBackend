
package uni.isw.Infraestructura.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.isw.model.User;
import uni.isw.service.UserServicio;


@RestController
//http://localhost:8082
@RequestMapping("/api/v1/users")
//http://localhost:8082/api/v1/users
public class UserControlador {
    private final UserServicio userServicio;
    
    public UserControlador(UserServicio userServicio){
        this.userServicio=userServicio;
    }
    
    @PostMapping
    public User save(@RequestBody User user){
        return userServicio.save(user);
    }
    //http://localhost:8082/api/v1/users/4
    @GetMapping("/{id}")
    public User findByid(@PathVariable Integer id){
        return userServicio.findById(id);
    }
    
    
}
