package cn.demo.springboot.service;

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
}
