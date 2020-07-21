package com.rameshit.email;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {	
public static void main(String[] args) {
	

	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	
	Mail m=(Mail)context.getBean("mail");
	String sender="nara.ramesh@gmail.com";//write here your id
	String receiver="nara.ramesh@gmail.com";//write here receiver id
	m.sendMail(sender,receiver,"Hello","Hi How are you, are following spring Email API or not...");
	
	System.out.println("success");
}
}
