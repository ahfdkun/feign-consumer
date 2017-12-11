package com.ahfdkun.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloServiceFallback implements HelloService {

	@Override
	public String hello(@RequestParam("name") String name) {
		return "error";
	}

	@Override
	public String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
		return "error";
	}

	@Override
	public String hello(@RequestBody com.ahfdkun.domain.User2 user2) {
		return "error";
	}

	@Override
	public String hello() {
		return "error";
	}

}
