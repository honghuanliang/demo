package cn.demo.springboot.service.impl;

import cn.demo.springboot.mapper.UserMapper;
import cn.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户实现层
 *
 * @author honghl
 * @version 1.0
 * @date 20231105
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    /**
     * 注入数据访问接口代理对象
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public String findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public Integer findByName(String name) {
        return userMapper.findByName(name);
    }

}
