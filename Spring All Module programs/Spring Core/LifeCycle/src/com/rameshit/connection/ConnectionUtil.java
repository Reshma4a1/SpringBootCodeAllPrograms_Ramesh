package com.rameshit.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	private String driverClass;
	private String url;
	private String username;
	private String password;

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getConnection() {
		System.out.println(driverClass);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		// write a logic to create connection
	}
}
