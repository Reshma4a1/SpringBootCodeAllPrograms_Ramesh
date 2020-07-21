import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rameshit.service.LoginSerice;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		LoginSerice loginSerice = context.getBean("loginService", LoginSerice.class);
		
		loginSerice.getLoginInfo();
		
	}

}
