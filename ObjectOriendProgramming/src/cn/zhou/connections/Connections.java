package cn.zhou.connections;
import java.util.ArrayList;
import java.util.Collections;

public class Connections {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		Collections.reverse(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println("反转之后"+list.get(i));
		}
		Collections.shuffle(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println("洗牌后"+list.get(i));
		}
	}

}
