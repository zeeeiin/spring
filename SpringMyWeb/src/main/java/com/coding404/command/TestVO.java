package com.coding404.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
//@ToString
@Data //getter, setter, toString을 자동 생성
@NoArgsConstructor //기본 생성자 생성
@AllArgsConstructor //모든 매개변수를 받는 생성자
public class TestVO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private Timestamp regdate;
	
	//getter, setter, toString, 생성자
}
