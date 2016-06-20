package cn.zhou.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhou", 001);
		map.put("mouse", 002);
		map.put("zho", 003);
	/*	Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {	
			String name = (String) it.next();
			int num = map.get(name);
			System.out.println(name+"<-->"+num);
		}*/
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> mapEntry = (Entry<String, Integer>) it.next();
			System.out.println(mapEntry);
		}
		Collection<Integer> value = map.values();
		for (Integer integer : value) {
			System.out.println(value);
		}
	}
}
