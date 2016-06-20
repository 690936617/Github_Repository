package cn.zhou.singleton;

public class Singleton {
	//饿汉  
/*	private Singleton(){}
	private static Singleton single = null;
	public static Singleton getSingleton() {
		if(single == null) {
			single = new Singleton();
		}
		return single;
	}*/
	//饱汉
	private Singleton(){}
	private static Singleton single = new Singleton();
	public static Singleton getSingleton()	{
		return single;
	}
}
