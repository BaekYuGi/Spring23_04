package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.Hello;

public class MainClass {

	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		Hello hello1 =(Hello)ctx.getBean("hello1");
		callhello(hello1);
		ctx.close();
		
	}
	public static void callhello(Hello hello) {
		hello.say();
	}
}
