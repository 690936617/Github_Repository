package cn.zhou.extend;

public class Animal {
	private String name;
	private String cry;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, String cry) {
		super();
		this.name = name;
		this.cry = cry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}
	
	public void fly(String name) {
		System.out.println(name+" is flying");
	}
	
	final public void fly(String name, String cry) {
		System.out.println(name+" is flying");
	}
}
