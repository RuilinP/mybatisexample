package moe.ruilin.mybatisex;

import moe.ruilin.mybatisex.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("moe.ruilin.mybatisex.mapper")
@SpringBootApplication
public class MybatisexApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisexApplication.class, args);
	}

}
