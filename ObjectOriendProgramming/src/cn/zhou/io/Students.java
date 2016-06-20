package cn.zhou.io;
import java.io.Serializable;

public class Students implements Serializable{
	private String name;
	private int age;
	private String sex;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Students(String name, int age, String sex, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "name:"+this.name+"age:"+this.age+"sex:"+this.sex+"grade:"+this.grade;
	}
	
}
