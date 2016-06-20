package cn.zhou.valueexchange;

public class ValueExchange {
	
	public  void exchange(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a"+a+"b"+b);
	}
	public static void main(String[] args) {
		int c =1;
		int d= 2;
		ValueExchange value = new ValueExchange();
		value.exchange(c, d);
		System.out.println("c"+c+"d"+d);
	}
}
