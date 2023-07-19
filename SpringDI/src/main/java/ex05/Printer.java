package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {

	/*
	 * @Autowired
	 * - 멤버변수, 생성자, setter 모두 사용
	 * - bean중에서 주입될 수 있는 적합한 타입을 찾아서 자동주입을 실행한다.
	 * 
	 */
	@Autowired
	@Qualifier("document1") //빈 이름을 강제 연결
	private Document document; //문서를 받을 수 있고
	
	
	//기본 생성자
	public Printer() {}
	
	//Autowired를 생성자 머리 위에다 만들기	
	//생성자를 통한 주입이 가능
	//@Autowired
	public Printer(Document document) {
		this.document = document;			
	}

	//getter, setter 통한 주입 가능
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
}
