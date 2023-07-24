package com.simple.basic;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)//Junit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //풀 전체 경로 적기. 테스트를 진행할 스프링 설정파일
public class JDBCTest {
	
//	@Autowired
//	private DataSource dataSource; //hikari 데이터 소스 객체 주입
//	
//	
//	@Test //Junit이 해당 메소드를 실행시킨다.
//	public void testCode() {		
//		
//		try {
//			Connection conn = dataSource.getConnection();
//			
//			System.out.println(conn);//null이 아니라는 것은 데이터베이스가 연결됨 
//			
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
	
//		System.out.println("실행됨");
//	}
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private TestMapper testMapper; //마이바티스 인터페이스
	
	@Test 
	public void testCode2() {
		//System.out.println(sqlSessionFactory);
		
		String result = testMapper.getTime();
		System.out.println(result);
	}

}
