package cn.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午5:20:16
 * @version 1.0
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/** 创建SpringApplicaiton */
		SpringApplication springApplication = new SpringApplication(Application.class); 
		/** 设置banner关闭 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}

}
