package org.example.demo;

import org.example.demo.convert.UserConvert;
import org.example.demo.module.dto.UserDto;
import org.example.demo.module.dto.UserRoleDto;
import org.example.demo.module.po.Role;
import org.example.demo.module.po.User;
import org.example.demo.module.vo.UserVo;
import org.example.demo.util.UserStatusEnum;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangLe
 * @Description 非spring管理 mapper对象
 */
public class Test implements Serializable {
    public static void main(String[] args) {
        UserDto userDto = UserConvert.instance.userToUserDto(new User(10L, "zhangsan", UserStatusEnum.NORMAL, LocalDateTime.now()));
        System.out.println(userDto);


        UserVo userVo = UserConvert.instance.userDtoToUserVo(new UserDto().setId(20).setUserName("张三"));
        System.out.println(userVo);

        List<UserVo> userVos = UserConvert.instance.userDtoToUserVo(new ArrayList<UserDto>() {{
            add(new UserDto().setId(30).setUserName("liuneng"));
            add(new UserDto().setId(40).setUserName("lisi"));
            add(new UserDto().setId(50).setUserName("wangwu"));
            add(new UserDto().setId(60).setUserName("zhaoliuo"));
        }});
        System.out.println(userVos);

        UserRoleDto userRoleDto = UserConvert.instance.userAndRoleToUserRoleDto(new User().setUid(666L).setUsername("玛丽").setCreateTime(LocalDateTime.now()).setStatus(UserStatusEnum.NORMAL),
                new Role().setRoleId(8888).setRoleName("法师")
        );
        System.out.println(userRoleDto);
    }
}
