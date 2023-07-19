package ex04;

import java.util.List;
import java.util.Map;
import ex03.MemberDAO;

public class Customer {

	//멤버변수
	private List<String> lists; //문자열 저장
	private List<MemberDAO> dao; 
	private Map<String, Object> map; //키는 문자열, 값은 오브젝트 타입
	
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public List<MemberDAO> getDao() {
		return dao;
	}
	public void setDao(List<MemberDAO> dao) {
		this.dao = dao;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
		
	
}
