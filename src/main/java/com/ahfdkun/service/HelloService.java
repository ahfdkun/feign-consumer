package com.ahfdkun.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
// 服务名
@FeignClient("HELLO-SERVICE")
public interface HelloService {

	@RequestMapping("/hello")
	String hello();
}
