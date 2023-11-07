package cn.demo.springboot.service;

import cn.demo.springboot.entity.dto.UserDTO;

/**
 * 用户业务接口层
 *
 * @author honghl
 * @version 1.0
 * @date 20231105
 */
public interface UserService {

    /**
     * 根据用户id查询用户名称
     *
     * @param id 用户id
     * @return 用户名
     */
    String findById(Integer id);

    /**
     * 保存用户
     *
     * @param userDTO 用户信息
     */
    void saveUserInfo(UserDTO userDTO);

    /**
     * 更新用户
     *
     * @param userDTO 更新信息
     */
    void updateUser(UserDTO userDTO);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void deleteUser(Integer id);
}
