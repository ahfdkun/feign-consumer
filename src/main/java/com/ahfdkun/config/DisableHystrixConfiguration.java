package com.ahfdkun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;

// 为指定的服务客户端关闭Hystrix支持
// @Configuration
public class DisableHystrixConfiguration {

	/*@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return new Feign.Builder();
	}*/
	
}
