package com.elucidator.dto;

public class Person {
	private String name;
	int age;
	double high;
	boolean flag;
	
	
	public Person(String name, int age, double high, boolean flag) {
		super();
		this.name = name;
		this.age = age;
		this.high = high;
		this.flag = flag;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void eat(){
		System.out.println("eat����"+name+","+age+","+high+","+flag);
	}
	public void drive(){
		System.out.println("�����ķ���");
	}

}