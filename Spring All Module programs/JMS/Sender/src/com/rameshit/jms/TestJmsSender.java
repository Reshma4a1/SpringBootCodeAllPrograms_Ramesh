package com.rameshit.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJmsSender {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		MyMessageSender sender = context.getBean("messageSender",
				MyMessageSender.class);
//		String xml = "<employee>" +
//					"<name>Ramesh</name>" +
//					"<email>nara.ramesh@gmail.com</email>" +
//					"</employee>";
		
		String xml = "LKAJGLKJKDGF;LK;LDKFA" +
				"DF;AKDJF;DSKJFD;LFSAD'FSDAF" +
				"D" +
				"KJADSLKFDKLFJDFAS" +
				"DJALKSFJDS;FJDS;FD" +
				"LKDFASDLKFJDKFDSKLFJKLD" +
				"ADSKFJDSLKFJDSLKFJDLKFJDF" +
				"ALKDFJLASDKJFLKJDLKJ" +
				"KJDLKFDJSLFKDJFLKDF]" +
				"KDJFLKDJFLDKJFDLKFJD";


		sender.sendMessage(xml);

		System.out.println("Message successfully posted");

	}
}
