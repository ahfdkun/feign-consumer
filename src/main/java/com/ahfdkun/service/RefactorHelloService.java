package com.ahfdkun.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.ahfdkun.api.service.HelloService;

// 服务名
@FeignClient("HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {

}
