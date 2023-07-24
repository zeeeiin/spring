package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@Qualifier("scoreService")
	ScoreService scoreService;
	
	
	//1. 화면처리 - 경로 지정
	
	//등록화면
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		ArrayList<ScoreVO> list = scoreService.getScores();
		model.addAttribute("list", list);
		
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
		//System.out.println(vo.toString());
		
		scoreService.scoreRegist(vo);
		
		return "redirect:/service/scoreResult"; //등록 이후에 결과로..
	}
	
	//삭제요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int index) {		
		//삭제가 일어났다? ->목록으로 보낼 것. 다시 컨트롤러를 태워서 보낼 것이다.
		scoreService.scoreDelete(index);
		
		return "redirect:/service/scoreList"; //삭제 이후에는 목록으로
	}	
	
}
