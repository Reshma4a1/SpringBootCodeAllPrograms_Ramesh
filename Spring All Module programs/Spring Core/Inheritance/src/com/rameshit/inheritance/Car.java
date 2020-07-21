package com.rameshit.inheritance;

public class Car {

	private int id;
	private String name;
	private String engineType;
	private String engineModel;
	private String classType;

	public Car() {
		System.out.println("Car default constructor...");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public void showCarDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Engine Type : " + engineType);
		System.out.println("Engine Model : " + engineModel);
		System.out.println("Class Type : " + classType);
	}
}
