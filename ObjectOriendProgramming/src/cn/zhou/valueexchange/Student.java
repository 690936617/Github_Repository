package cn.zhou.valueexchange;

public class Student {
	public int id;
	public int	age;
	
	public void exchange(Student stu) {
		int tmp = id;
		id = age;
		age = tmp;
		System.out.println("在方法内部交换后:\n"+"id:"+stu.id+"\n"+"age:"+stu.age);
	}
}
