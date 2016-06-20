package cn.zhou.innerclass;

public class Out {
	String name = "zhangsan";
	public void tell() {
//		Out.In in = new Out.In();
//		in.get();
		Out.In in = new Out().new In();
		in.get();
		
	}
	public void fun() {
		System.out.println("fun");
	}
	class In {
		String name = "li";
		public void get() {
			System.out.println("get");
			Out out = new Out();
			out.fun();
		}
	}
	public static void main(String[] args) {
		new Out().tell();
	
	}
}

class Me {
	
}
