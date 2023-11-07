package cn.demo.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.demo.springboot.mapper.NoticeMapper;
import cn.demo.springboot.entity.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.demo.springboot.service.NoticeService;

/**
 * NoticeServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:10:22
 * @version 1.0
 */
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	/** 注入数据访问接口代理对象 */
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		
		/** 定义Map集合封装查询的结果 */
		 Map<String, Object> data = new HashMap<>();
		// {"total" : 100, "rows" : [{},{}]}
		 
		/** 统计查询 */
		long count = noticeMapper.count();
		data.put("total", count);
		
		/** 分页查询 */
		List<Notice> notices = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", notices);
		return data;
	}

}
