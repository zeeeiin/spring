package ex01;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
//		SpringTest st = new SpringTest();
//		st.hello();
		
		//new SpringTest를 만든 적이 없는데 어딘가에 만들어진걸 갖고 와서 실행시킨 것.
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		//1st
//		SpringTest st = (SpringTest)ctx.getBean("test");
//		st.hello();
//	
//		//2nd
//		SpringTest st2 = ctx.getBean(SpringTest.class);
//		st2.hello();
//		
//		System.out.println(st == st2 );//동일하다
		
		new Hotel(new Chef());
		
		
		Hotel hotel = ctx.getBean(Hotel.class);
		hotel.getChef().cooking();
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		
		DatabaseDev dev = dao.getDataSource();
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		
		//IOC컨테이너 안의 빈의 이름반환(배열형태)
		System.out.println( Arrays.toString( ctx.getBeanDefinitionNames() ));;
		
	}
}
