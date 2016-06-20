package cn.zhou.membervariable;

public class Array {
	static String name = "zhangsan";
	String values = "aa";
	public static void main(String[] args) {
		String name="lisi";
		String values = "bb";
		System.out.println("location variable"+name);
		Array array = new Array();
		array.test(values);
		//static不能调用非static method(报警告)
		System.out.println("static"+array.name);
		
	}
	public void test(String values) {
		System.out.println(this.values);
		System.out.println(values);
	}
	
}
