
public class SingletonDemo {
	
	private static SingletonDemo singletonDemo = null;
	
	
	//private constructor
	private SingletonDemo() {
		System.out.println("private constructor...");
	}
	
	//write factory method to get the object;
	
	public static SingletonDemo getInstance() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();	
		}
		return singletonDemo;
	}

}
