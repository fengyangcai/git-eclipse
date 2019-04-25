package com.caicai.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sayhello")
	public String sayHello() {
		return "hello springboot 欢迎来到springboot";
	}
}
