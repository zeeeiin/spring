package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;


@Controller
@RequestMapping("/service") //request매핑 service로 묶어버리기 
public class ScoreController {
	
	
	//1st
	//ScoreService service = new ScoreServiceImpl();
	
	//2nd - 직접 빈등록 자동주입
//	@Autowired
//	ScoreService service; //bean을 주입해주세요 -> 알맞은 걸 스프링이 찾아서 넣을 것
	
	//3nd
	@Autowired
	ScoreService service;
	
	
	//1. 화면처리 - 경로 지정
	
	//등록화면
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "service/scoreList";
	}
	
	//결과화면
	@RequestMapping("/scoreResult")
	public String scoreResultist() {
		return "service/scoreResult";
	}
	
	
	//등록요청
	@RequestMapping(value="/scoreForm", method=RequestMethod.POST) //post 방식으로 들어온다.
	public String scoreForm(ScoreVO vo) {
		
		//1st
		//ScoreServiceImpl service = new ScoreServiceImpl();
		//service.scoreRegist(vo);
		System.out.println(vo.toString());
		
		return ""; //결정은 나중에..
	}
}
