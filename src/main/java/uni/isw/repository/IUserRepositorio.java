
package uni.isw.repository;

import uni.isw.model.User;


public interface IUserRepositorio {
    User save(User user);
    User findEmail(String email);
    User findById(Integer id);

}
