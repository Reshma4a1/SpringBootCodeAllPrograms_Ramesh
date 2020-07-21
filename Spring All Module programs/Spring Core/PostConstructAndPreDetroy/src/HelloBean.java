import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage");
	}

	public HelloBean() {
		System.out.println("HelloBean constructor...");
	}

	public String getMessage() {
		return message;
	}

	@PostConstruct
	public void myInit() {
		System.out.println("myInit called");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("myDestroy called");
	}
}
