package com.rameshit.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private List<String> courses;
	private Set<Long> mobileNos;
	private Map<String, String> feeDetails;
	private Properties properties;


	public Student(int id, String name, List<String> courses,
			Set<Long> mobileNos, Map<String, String> feeDetails,
			Properties properties) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.mobileNos = mobileNos;
		this.feeDetails = feeDetails;
		this.properties = properties;
		System.out.println("param constructor...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Set<Long> getMobileNos() {
		return mobileNos;
	}

	public void setMobileNos(Set<Long> mobileNos) {
		this.mobileNos = mobileNos;
	}

	public Map<String, String> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(Map<String, String> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
