package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HomeController extends MultiActionController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String uri = request.getRequestURI();
		String path = uri.substring( request.getContextPath().length() );
		
		System.out.println(path);
		
		if(path.equals("/test/aaa")) {
			System.out.println("aaa~.~");
			
			ModelAndView mv = new ModelAndView();
			
			//mv.setViewName("/WEB-INF/views/aaa.jsp");
			mv.setViewName("aaa");
			mv.addObject("data", "hello world!");
			
			return mv; //컨트롤러에서는 뷰에 대한 정보와 데이터에 대한 정보를 반환한다.
		
		} else if(path.equals("/text/bbb")) {
			System.out.println("bbb~.~");
		}
				
		return null;
	}
	
	

}
