package org.github.xhjcehust.dubbo.proxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author zhangyiting
 */
//@ImportResource(value = {"classpath:applicationContext.xml"})
@SpringBootApplication
@MapperScan(basePackages = "org.github.xhjcehust.dubbo")
public class DubboInvokerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(DubboInvokerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DubboInvokerApplication.class, args);
	}

}
