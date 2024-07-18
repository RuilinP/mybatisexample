package moe.ruilin.mybatisex.resource;

import moe.ruilin.mybatisex.mapper.UserMapper;
import moe.ruilin.mybatisex.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserMapper userMapper;

    public UserResource(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //autowire
    @GetMapping("/all")
    public List<User> getAll(){
        return userMapper.findAll();
    }

    record NewUserRequest(
            String name,
            Long salary
    ){}

    @PostMapping("/")
    public void addUser(@RequestBody NewUserRequest request){
        User user = new User();
        user.setName(request.name());
        user.setSalary(request.salary());
        userMapper.insert(user);



    }
}
