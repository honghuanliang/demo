package cn.demo.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.demo.springboot.pojo.Notice;

/**
 * NoticeMapper
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:09:47
 * @version 1.0
 */
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();

	long count();
	
	List<Notice> findByPage(@Param("a")Integer page,
					@Param("b") Integer rows);
	
}
