package org.example.demo.module.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserRoleDto implements Serializable {
    Integer roleId;
    String roleName;

    Integer uid;
    String userName;
    String createTime;
}
