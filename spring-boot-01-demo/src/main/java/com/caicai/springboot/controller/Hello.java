package com.caicai.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/test")
	public String sayHello() {
		System.out.println("sdsda");
		System.out.println("哈哈");
		return "hello springboot 欢迎来到springboot";
	}
}
