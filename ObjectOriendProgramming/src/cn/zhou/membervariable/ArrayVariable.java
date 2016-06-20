package cn.zhou.membervariable;

public class ArrayVariable {
	
	public static void main(String[] args) {
		String array[] = {"zhangsan", "lisi", "wangwu"};
		ArrayVariable av = new ArrayVariable();
		av.tell(array);
	}
	
	public void tell(String[] args) {
		for (String name : args) {
			System.out.println(name);
		}
	}
}
