package org.example.demo.convert;

import org.example.demo.module.dto.UserDto;
import org.example.demo.module.dto.UserRoleDto;
import org.example.demo.module.po.Role;
import org.example.demo.module.po.User;
import org.example.demo.module.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author jingjing520
 * 类型转换工具类
 * 该类型转换接口的实现类会编译在target目录中
 */

// @Mapper(componentModel = "default") //
@Mapper(componentModel = "spring") // 该类型转换接口类会交给spring管理
public interface UserConvert2 {
    /**
     * 返回当前转换类实例对象
     */
    // UserConvert2 instance = Mappers.getMapper(UserConvert2.class);

    /**
     * userPo转换为userDto
     * @param user
     * @return UserDto对象
     */
    @Mappings({
            @Mapping(source = "uid", target = "id"),
            @Mapping(source = "username", target = "userName"),
            @Mapping(source = "createTime",target = "createTime",dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    UserDto userToUserDto(User user);

    /**
     * userDto转换为userVo
     * @param userDto
     * @return UserVo对象
     */
    @Mappings({
            @Mapping(source = "id",target = "userId")
    })
    UserVo userDtoToUserVo(UserDto userDto);


    /**
     * 将一个userDto列表转换为userVo列表
     * @param userDtoList
     * @return List<UserVo>对象
     */
    @Mappings({
            @Mapping(source = "id",target = "userId")
    })
    List<UserVo> userDtoToUserVo(List<UserDto> userDtoList);

    /**
     * 可以将多个对象合并成一个对象
     * @param user
     * @param role
     * @return UserRoleDto对象
     */
    @Mappings({
            @Mapping(source = "user.username",target = "userName"),
            @Mapping(source = "user.createTime",target = "createTime",dateFormat = "YYYY-MM-dd HH:mm:ss")
    })
    UserRoleDto userAndRoleToUserRoleDto(User user, Role role);




}
