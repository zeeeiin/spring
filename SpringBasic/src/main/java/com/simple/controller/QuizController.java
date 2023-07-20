package com.simple.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class QuizController {
	
	//실습문제2 ///////////////////////////////////////////////////
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";		
	}	
	
	@RequestMapping(value="/quiz01_1", method=RequestMethod.POST)
	public String quiz01_1(@RequestParam("year") String year,
								@RequestParam("month") String month,
								@RequestParam("day") String day			
								) {			
		
		return "quiz/quiz01_ok";		
	}	

	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	@RequestMapping(value = "join", method=RequestMethod.POST)
	public String quiz02_2(@RequestParam("id") String id,
						   @RequestParam("pw") String pw,
						   @RequestParam("name") String name,
						   @RequestParam("email") String email,
						   Model model
							) {
		model.addAttribute(id);
		model.addAttribute(pw);
		model.addAttribute(name);
		model.addAttribute(email);
		
		return "quiz/quiz02_ok";
	}
	
	@RequestMapping(value = "join2", method=RequestMethod.POST)
	public String quiz03_03() {
		
		
		return "quiz/quiz03_ok";
	}
	
	
	
	
}
