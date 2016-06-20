package cn.zhou.constructor;

public class Father {
	String name="zhanger";
	int age = 12;
	String job;
	public Father() {
		// TODO Auto-generated constructor stub
		System.out.println("father no variable");
	}
	public Father(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
		System.out.println("father variable");
	}
	
	

}
