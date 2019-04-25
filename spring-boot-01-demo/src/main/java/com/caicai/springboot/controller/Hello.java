package com.caicai.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/test")
	public String sayHello() {
		System.out.println("sdsda");
<<<<<<< HEAD
		
		System.out.println("你好我要测试一下是否修改了");
=======
		System.out.println("哈哈");
>>>>>>> branch 'master' of https://fengyangcai@github.com/fengyangcai/git-eclipse.git
		return "hello springboot 欢迎来到springboot";
	}
}
