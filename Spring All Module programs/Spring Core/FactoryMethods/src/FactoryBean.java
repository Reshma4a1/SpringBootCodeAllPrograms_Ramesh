public class FactoryBean {

	
	private FactoryBean() {
		System.out.println("private Constructor...");
	}

	
	public void m1() {
		System.out.println("m1 called...");
	}

	
	public FactoryBean getInstance() {
		System.out.println("getInstance called...");
		return new FactoryBean();
	}
}
