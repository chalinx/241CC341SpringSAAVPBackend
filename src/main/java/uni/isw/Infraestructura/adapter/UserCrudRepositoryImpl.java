
package uni.isw.Infraestructura.adapter;

import org.springframework.stereotype.Repository;
import uni.isw.Infraestructura.mapper.UserMapper;
import uni.isw.model.User;
import uni.isw.repository.IUserRepositorio;


@Repository
public class UserCrudRepositoryImpl implements IUserRepositorio {

    private final IUserCrudRepository iuserCrudRepostory;
    private final UserMapper userMapper;
    
    public UserCrudRepositoryImpl(IUserCrudRepository iuserCrudRepostory,UserMapper userMapper){
        this.iuserCrudRepostory = iuserCrudRepostory;
        this.userMapper = userMapper;
    }
    
    @Override
    public User save(User user) {
        return userMapper.toUser(iuserCrudRepostory.save(userMapper.toUserEntidad(user)));
    }

    @Override
    public User findEmail(String email) { return null;   }

    @Override
    public User findById(Integer id) {
        return userMapper.toUser(iuserCrudRepostory.findById(id).get());
    }

    
}
