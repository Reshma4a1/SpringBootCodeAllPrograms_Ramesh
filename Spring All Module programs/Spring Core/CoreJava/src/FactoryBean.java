import java.util.Calendar;

public class FactoryBean {
	
	private FactoryBean() {
		System.out.println("Private constructor...");
	}
	
	public void m1() {
		System.out.println("m1 method...");
	}
	
	//factory method.
	
	public static FactoryBean getInstance() {
		
		FactoryBean factoryBean = new FactoryBean();
		return factoryBean;
	}
}