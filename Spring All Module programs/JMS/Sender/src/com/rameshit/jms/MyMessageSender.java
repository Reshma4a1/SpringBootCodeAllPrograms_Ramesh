package com.rameshit.jms;

import javax.jms.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MyMessageSender {
	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(final String message) {

		MessageCreator creator = new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		};
		jmsTemplate.send(creator);
	}
}
