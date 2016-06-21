package cn.study.com;

public class SubClass extends BaseClass {
	public String book = "JavaEE";
	public void test() {
		System.out.println("子类覆盖父类的方法");
	}
	public  void sub() {
		System.out.println("子类的普通方法");
	}
	
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		BaseClass polymorphism = new SubClass();
		System.out.println(polymorphism.book);
		polymorphism.base();
		polymorphism.test();
	}
}
