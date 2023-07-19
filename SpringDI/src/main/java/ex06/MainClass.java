package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("quiz-context.xml");
		
		Airplane air = ctx.getBean(Airplane.class);		
		air.getBattery().energy();
		
		//System.out.println( air.getBattery() );
		
		Car car = ctx.getBean(Car.class);
		car.getBattery().energy();

		//System.out.println( car.getBattery() );
	}
}
