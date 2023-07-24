package com.simple.command;

public class BoardVO {

	public String num;
	public String name;
	public String title;
	public String content;
	
	public BoardVO() {}
	
	public BoardVO(String num, String name, String title, String content) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + "]";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
