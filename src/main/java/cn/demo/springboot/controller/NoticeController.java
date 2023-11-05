package cn.demo.springboot.controller;

import java.util.List;
import java.util.Map;

import cn.demo.springboot.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.springboot.service.NoticeService;

/**
 * NoticeController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:10:30
 * @version 1.0
 */
@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(@RequestParam("page")Integer page, 
				@RequestParam("rows")Integer rows){
		return noticeService.findByPage(page, rows);
	}
}
