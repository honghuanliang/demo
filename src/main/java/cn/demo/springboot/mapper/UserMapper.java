package cn.demo.springboot.mapper;

import cn.demo.springboot.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
}
