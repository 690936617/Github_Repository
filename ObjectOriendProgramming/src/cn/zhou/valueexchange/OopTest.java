package cn.zhou.valueexchange;

public class OopTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.age = 24;
		student.exchange(student);
		System.out.println("执行之后:id:"+student.id+"age:"+student.age);
	}
}
