package com.simple.basic;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)//Junit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //풀 전체 경로 적기. 테스트를 진행할 스프링 설정파일
public class JDBCBoardTest {
	
	@Autowired
	BoardMapper boardMapper;
	
	

}
