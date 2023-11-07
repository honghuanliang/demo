package cn.demo.springboot.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表
 *
 * @TableName user
 */

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}