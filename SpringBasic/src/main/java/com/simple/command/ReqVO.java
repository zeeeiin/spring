package com.simple.command;

import java.util.ArrayList;

public class ReqVO {
	
	//만드는 규칙 VO랑 똑같이 만든다.
	//폼값의 name 과 동일한 변수를 멤버변수로 선언	
	private String name;
	private String age;
	private ArrayList<String> inter; //check 박스
	
	//기본 생성자 필수
	public ReqVO() {}

	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}
	//name 을 동일하게 만든 이유-> setName 에서 set을 제외한 이름으로 판단하기 때문
	//vo => DB의 table?
	
	
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}
	
	//getter, setter 실제 값을 받아주는 역할
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	


}
