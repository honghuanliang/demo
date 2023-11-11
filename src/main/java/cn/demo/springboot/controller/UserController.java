package cn.demo.springboot.controller;

import cn.demo.springboot.entity.dto.UserDTO;
import cn.demo.springboot.entity.pojo.User;
import cn.demo.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * NoticeController
 *
 * @author LEE.SIU.WAH
 * @version 1.0
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:10:30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户id查询用户名称
     *
     * @param id 用户id
     * @return 用户名
     */
    @GetMapping("/query_id")
    public String findById(@RequestParam Integer id) {
        return userService.findById(id);
    }

    /**
     * 查询所有的用户
     *
     * @return 用户
     */
    @GetMapping("/query_user_list")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    /**
     * 分页查询所有的用户
     *
     * @return 用户
     */
    @PostMapping("/query_user_page")
    public Page<User> findAllUserPage() {
        return userService.findAllUserPage();
    }

    /**
     * 保存用户
     *
     * @param userDTO 用户信息
     */
    @PostMapping("/save_user")
    public void saveUser(@Valid @RequestBody UserDTO userDTO) {
        userService.saveUserInfo(userDTO);
    }

    /**
     * 更新用户
     *
     * @param userDTO 更新信息
     */
    @PostMapping("/update_user")
    public void updateUser(@Valid @RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    @GetMapping("/delete_user")
    public void deleteUser(@RequestParam Integer id) {
        userService.deleteUser(id);
    }


}
