package org.example.demo.module.po;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import org.example.demo.util.UserStatusEnum;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author zhangLe
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -526178011943954656L;

    Long uid;
    String username;
    UserStatusEnum status;
    LocalDateTime createTime;
}
