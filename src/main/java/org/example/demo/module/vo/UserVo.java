package org.example.demo.module.vo;

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
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = false)
public class UserVo implements Serializable {
    String userId;
    String userName;
}
