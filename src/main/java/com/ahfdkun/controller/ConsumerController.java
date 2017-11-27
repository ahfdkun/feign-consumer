package com.ahfdkun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahfdkun.domain.User2;
import com.ahfdkun.service.HelloService;
import com.ahfdkun.service.RefactorHelloService;

@RestController
public class ConsumerController {

	@Autowired
	private HelloService helloService;
	@Autowired
	private RefactorHelloService refactorHelloService;

	@RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		return helloService.hello();
	}
	
	@RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
	public String helloConsumer2() {
		StringBuilder sb = new StringBuilder();
		sb.append(helloService.hello()).append("\n");
		sb.append(helloService.hello("DIDI1")).append("\n");
		sb.append(helloService.hello("DIDI2", 30)).append("\n");
		sb.append(helloService.hello(new User2("DIDI3", 40))).append("\n");
		System.out.println(sb);
		return sb.toString();
	}
	
	@RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
	public String helloConsumer3() {
		StringBuilder sb = new StringBuilder();
		sb.append(refactorHelloService.hello("DIDI1")).append("\n");
		sb.append(refactorHelloService.hello("DIDI2", 30)).append("\n");
		sb.append(refactorHelloService.hello(new com.ahfdkun.api.dto.User2("DIDI3", 40))).append("\n");
		System.out.println(sb);
		return sb.toString();
	}
}
