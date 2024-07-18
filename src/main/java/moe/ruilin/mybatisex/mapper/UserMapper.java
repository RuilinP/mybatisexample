package moe.ruilin.mybatisex.mapper;

import moe.ruilin.mybatisex.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper{

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("INSERT INTO user(name, salary) VALUES (#{name}, #{salary})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
//    before = false, resultType = Integer.class)
    void insert(User user);


}
