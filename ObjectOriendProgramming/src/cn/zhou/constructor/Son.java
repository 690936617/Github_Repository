package cn.zhou.constructor;

public class Son extends Father {
	String name="zhangsan";
	int age = 20;
	public Son() {
		// TODO Auto-generated constructor stub
		System.out.println("son no variable");
	}
	public Son(String name, int age) {
		super(name, age, name);
		this.name = name;
		this.age = age;
		System.out.println("son variable");
	}

	public static void main(String[] args) {
		Son son = new Son("zhangsan", 20);
	}
	
}
