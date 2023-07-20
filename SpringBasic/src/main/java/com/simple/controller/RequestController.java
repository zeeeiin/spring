package com.simple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Component
@RequestMapping("/request") //각 메서드의 공통분모 
public class RequestController { 

	//화면을 띄우는 
	@RequestMapping("/req_ex01")//request/req_ex01
	public void ex01() {
		//return "request/req_ex01"; 
	}	
	
	//get요청만 허용
	@RequestMapping(value="/basic1", method = RequestMethod.GET) //req_ex01/basic1
	public void basic1() {		
		System.out.println("basic요청");
	}
	
	//post요청만 허용
	@RequestMapping(value="/basic2", method = RequestMethod.POST) //req_ex01/basic1
	public void basic2() {		
		System.out.println("basic2요청");
	}
		
	//get post 둘 다 허용
	@RequestMapping(value="/basic3")//"/basic3"과 같다. //req_ex01/basic1
	public void basic3() {		
		System.out.println("basic3요청");
	}

	///////////////파라미터 값 받기//////////////////////
//	@RequestMapping("/req_ex02")
//	public String ex02() {
//		return "request/req_ex02";
//	}
//		
//	//전통적인 방법
//	@RequestMapping("/param1")
//	public String ex02() {
//		return "request/result";
//	}
//	@RequestMapping("/param1")
//	public String param1(HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		
//		return "request/result"; //result페이지로 이동
//		
//	}
		
	//@RequestMapping(네임값) - 반드시 필수로 값이 전달되어야한다.
	//required = false는 반드시 필수가 아님
	//defaultValue 값이 없을 때 기본값
//	@RequestMapping("/param1")
//	public String parma1 (@RequestParam("name") String x),
//						  @RequestParam("age") int y,
//						  @RequestParam("inter") ArrayList<String> z ) {
//		
//		System.out.println();
//							 
//		return "/request/result";
//	}
						  
						  
	//커맨드 객체를 이용하는 방법
//    @RequestMapping("/param1") //값을 다 받아서 객체를 자동으로 생성해줌.
//	public String parma1 (ReqVO vo) { //vo객체 선언 - setter명과 일치하는지 확인하는 과정을 거친다.
//    	//동일한 이름이 있으면 setter에 담아준다.
//    	//값을 빠르게 보고 싶다면 toString
//	
//    	System.out.println(vo.toString());
//							 
//		return "/request/result";
//	}					  
	
	
	//화면처리
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "request/req_quiz01";
	}	
	
	//결과 화면 req_quiz
	@RequestMapping(value="/login", method= RequestMethod.POST)//HttpServletRequest request
	public String log (HttpServletRequest request) {
		//@RequestParam("id") String id,
		//@RequestParam("pw") String pw
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("abc123") && pw.equals("xxx123")) {
			return "/request/req_quiz01_ok";
		} else {
			return "/request/req_quiz01_no";
		}

	}
	
	
}
