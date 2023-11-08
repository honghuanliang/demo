package cn.demo.springboot.mapper;

import cn.demo.springboot.entity.dto.UserDTO;
import cn.demo.springboot.entity.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户数据层
 *
 * @author LEE.SIU.WAH
 * @version 1.0
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:09:47
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户id查询name
     *
     * @param id 用户id
     * @return 用户名称
     */
    String findById(@Param("userId") Integer id);

    /**
     * 保存用户
     *
     * @param userDTO 用户信息
     */
    void saveUserInfoMapper(@Param("userDTO") UserDTO userDTO);

    /**
     * 更新用户
     *
     * @param userDTO 更新信息
     */
    void updateUser(@Param("userDTO") UserDTO userDTO);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void deleteUser(@Param("id") Integer id);

    /**
     * 查询所有的用户
     *
     * @return 用户(别名)
     */
    @Select("select id,name username,age userAge from user")
    List<User> findAllUser();
}
