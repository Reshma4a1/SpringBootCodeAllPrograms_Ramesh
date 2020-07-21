package com.rameshit.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("postProcessBeforeInitialization");
		System.out.println("beanName: " + beanName);
		System.out.println("Object" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("postProcessAfterInitialization");
		System.out.println("beanName: " + beanName);
		System.out.println("Object" + bean);
		
		if (bean instanceof HelloBean) {
			HelloBean helloBean = (HelloBean)bean;
			helloBean.setMessage("Hey data got changed");
			return helloBean;
		}
		return bean;
	}

}