package cn.zhou.list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class List_CutEqual {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(5);
		
		//去重
	/*	List<Integer> list2 = new ArrayList<Integer>(new HashSet<Integer>(list));
		for (Integer num : list2) {
			System.out.println(num);
		}*/
		//第二种
		List<Integer> list3 = new ArrayList<Integer>();
		for (Integer num3 : list) {
			if(!list3.contains(num3)) {
				list3.add(num3);
			}
		}
		for (Integer num4 : list3) {
			System.out.println(num4);
		}
	}
}
