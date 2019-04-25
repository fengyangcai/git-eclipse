package com.caicai.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/test")
	public String sayHello() {
		System.out.println("sdasdas");
		return "hello springboot 欢迎来到springboot";
	}
}
