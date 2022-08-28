package org.example.demo.convert;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.example.demo.module.dto.UserDto;
import org.example.demo.module.dto.UserRoleDto;
import org.example.demo.module.po.Role;
import org.example.demo.module.po.User;
import org.example.demo.module.vo.UserVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-28T19:00:47+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        if ( user.getUid() != null ) {
            userDto.setId( user.getUid().intValue() );
        }
        userDto.setUserName( user.getUsername() );
        if ( user.getCreateTime() != null ) {
            userDto.setCreateTime( DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" ).format( user.getCreateTime() ) );
        }

        return userDto;
    }

    @Override
    public UserVo userDtoToUserVo(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        String userId = null;
        String userName = null;

        if ( userDto.getId() != null ) {
            userId = String.valueOf( userDto.getId() );
        }
        userName = userDto.getUserName();

        UserVo userVo = new UserVo( userId, userName );

        return userVo;
    }

    @Override
    public List<UserVo> userDtoToUserVo(List<UserDto> userDtoList) {
        if ( userDtoList == null ) {
            return null;
        }

        List<UserVo> list = new ArrayList<UserVo>( userDtoList.size() );
        for ( UserDto userDto : userDtoList ) {
            list.add( userDtoToUserVo( userDto ) );
        }

        return list;
    }

    @Override
    public UserRoleDto userAndRoleToUserRoleDto(User user, Role role) {
        if ( user == null && role == null ) {
            return null;
        }

        UserRoleDto userRoleDto = new UserRoleDto();

        if ( user != null ) {
            userRoleDto.setUserName( user.getUsername() );
            if ( user.getCreateTime() != null ) {
                userRoleDto.setCreateTime( DateTimeFormatter.ofPattern( "YYYY-MM-dd HH:mm:ss" ).format( user.getCreateTime() ) );
            }
            if ( user.getUid() != null ) {
                userRoleDto.setUid( user.getUid().intValue() );
            }
        }
        if ( role != null ) {
            userRoleDto.setRoleId( role.getRoleId() );
            userRoleDto.setRoleName( role.getRoleName() );
        }

        return userRoleDto;
    }
}
