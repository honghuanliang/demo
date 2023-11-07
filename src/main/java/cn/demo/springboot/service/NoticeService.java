package cn.demo.springboot.service;

import java.util.List;
import java.util.Map;

import cn.demo.springboot.entity.pojo.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:10:04
 * @version 1.0
 */
public interface NoticeService {
	
	List<Notice> findAll();
	
	Map<String, Object> findByPage(Integer page, Integer rows);

}
