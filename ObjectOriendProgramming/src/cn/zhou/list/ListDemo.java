package cn.zhou.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("zhou");
		list.add("zho");
		list.add("mouse");
//		list.add(1);
		System.out.println(list.size());		
		System.out.println(list);
/*		String[] array= new String[2];
		Object[] object = list.toArray();
		int i =0;
		for (Object obj : object) {
			array[i] = obj.toString();
			i++;
		}
		System.out.println(array[i]);*/
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
			list.remove(i);
			System.out.println(list);
		}
	}
}
