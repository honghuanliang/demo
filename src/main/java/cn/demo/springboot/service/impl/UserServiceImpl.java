package cn.demo.springboot.service.impl;

import cn.demo.springboot.entity.dto.UserDTO;
import cn.demo.springboot.mapper.UserMapper;
import cn.demo.springboot.service.UserService;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
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
    public void saveUserInfo(UserDTO userDTO) {
        //数字的判断方式
        if (userDTO.getUserAge() == null) {
            throw new RuntimeException("年龄不能空");//xxxxException
        }
        //字符串的判断方式
        if (StringUtils.isBlank(userDTO.getUsername())) {
            throw new RuntimeException("年龄不能空");//xxxxException
        }
        //f8执行下一步，f9直接执行到下一个断点，没有下个断点执行到结束
        /*User userInfo = new User();
        userInfo.setId(userDTO.getId());
        userInfo.setUsername(userDTO.getUsername());
        userInfo.setUserAge(userDTO.getUserAge());
        userMapper.insert(userInfo);*/
        userMapper.saveUserInfoMapper(userDTO);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        userMapper.updateUser(userDTO);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
