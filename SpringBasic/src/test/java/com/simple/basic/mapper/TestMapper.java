package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {
	
	//추상메소드 - xml에서 실행시킬 추상 메소드 실행 /본인이 실행시키고 싶은 것 모두
	public String getTime();
	
	//insert - 단일값 전달
	public int insertOne(String name);
	
	//insert - 다중값 전달
	public int insertTwo(ScoreVO vo);
	
	//insert - 다중값 전달(맵)
	public int insertThree(HashMap<String, Object> map);
	
	//insert - 매개변수가 여러개일때 - Param("이름")
	public int insertFour(@Param("name")String name, 
						  @Param("kor")String kor, 
						  @Param("eng")String eng);
		
	//update
	public boolean updateOwn(ScoreVO vo);
		
	
	//select - select 문장에서 파라미터를 넘기는 과정은 위와 동일하다.
	public ScoreVO selectOne(int num); //하나의 VO를 가져오겠다 -> 1행만 가져오겠따.
	
	
	//select - 반환유형이 맵
	public HashMap<String, Object> selectTwo(int num);
	
	//한 행을 맵으로 처리하는데, 여러행이라면?
	public ArrayList<HashMap<String, Object> > selectThree();
	
	
	//join처리
	//M:1방식 - ORM은 M쪽에 변수를 추가
	public ArrayList<ScoreVO> joinOne();
	
	//1:M방식 - ORM은 직접처리
	public MemberVO joinTwo(String name);
	
}
