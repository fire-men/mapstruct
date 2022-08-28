package org.example.demo;

import org.example.demo.config.ApplicationContextConfig;
import org.example.demo.convert.UserConvert2;
import org.example.demo.module.dto.UserDto;
import org.example.demo.module.po.User;
import org.example.demo.util.UserStatusEnum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author zhangLe
 * @Description 从spring中获取mapstruct mapper对象
 */
public class Test2 implements Serializable {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        UserConvert2 userConvert2 = context.getBean(UserConvert2.class);
        // System.out.println(userConvert2);
        UserDto userDto = userConvert2.userToUserDto(new User(10L, "zhangsan", UserStatusEnum.NORMAL, LocalDateTime.now()));
        System.out.println(userDto);

    }
}
