package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController { 

	@RequestMapping("/req_ex01")//각 메서드의 공통분모 
	public String ex01() {
		return "request/req_ex01"; //request/req_ex01
	}
	
	@RequestMapping("/basic1") //req_ex01/basic1
	public void basic1() {		
		System.out.println("basic요청");
	}
	
	
	
}
