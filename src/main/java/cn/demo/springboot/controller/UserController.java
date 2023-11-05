package cn.demo.springboot.controller;

import cn.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
     * 根据用户id查询用户名称
     *
     * @param name 用户名
     * @return 用户id
     */
    @GetMapping("/query_name")
    public Integer findByName(@RequestParam String name) {
        return userService.findByName(name);
    }

}
