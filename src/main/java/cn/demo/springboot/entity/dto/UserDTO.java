package cn.demo.springboot.entity.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 用户表
 *
 * @TableName user
 */
@Data
public class UserDTO {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 姓名
     */
    @NotBlank(message = "用户名不能为空")
    private String username;
    /**
     * 年龄
     */
    private String userAge;
}