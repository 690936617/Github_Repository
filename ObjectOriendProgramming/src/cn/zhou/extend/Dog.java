package cn.zhou.extend;

public class Dog extends Animal {
	private String color;
	
	public Dog(String name, String cry, String color) {
		super(name, cry);
		this.color = color;
	}
	
	public Dog(String name, String color) {
		super(name);
		this.color = color;
	}
	
	
	
	@Override
	public void fly(String name) {
		// TODO Auto-generated method stub
//		super.fly(name);
		System.out.println("flying to sky");
	}
	
	public String toString() {
		return "name:"+this.getName()+" cry:"+this.getCry();
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("labuladuo", "wangwang", "white");
		d1.fly("labuladuo");
		System.out.println(d1.toString());
		Dog d2 = new Dog("muyangquan", "white");
		d2.fly("muyangquan");
		System.out.println(d2.toString());
	}
}
