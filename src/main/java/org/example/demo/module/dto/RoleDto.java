package org.example.demo.module.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)
public class RoleDto implements Serializable {
    Integer roleId;
    String roleName;
}
