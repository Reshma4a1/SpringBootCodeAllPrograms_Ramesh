import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rameshit.factoymethod.Alarm;



public class Client {
	
	public static void main(String[] args) {
		

	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
	
	FactoryBean factoryBean = context.getBean("factoryBean", FactoryBean.class);
	factoryBean.m1();
	
	
	}
	
}
