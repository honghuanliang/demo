package cn.demo.springboot.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表
 *
 * @TableName user
 */
@Data
@TableName("user")
public class User {
    /**
     * 主键
     */
    @TableId("id")
    private Integer id;

    /**
     * 姓名
     */
    @TableField("name")
    private String username;

    /**
     * 年龄
     */
    @TableField("age")
    private String userAge;

}