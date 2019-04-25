package com.caicai.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/test")
	public String sayHello() {
		System.out.println("sdsda");

		
		System.out.println("你好我要测试一下是否修改了");
		System.out.println("哈哈-我又皮一次");

		return "hello springboot 欢迎来到springboot";
	}
}
