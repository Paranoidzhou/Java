package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 150);
		map.put("数学", 140);
		map.put("英语", 130);
		map.put("物理", 120);
		map.put("化学", 110);
		System.out.println(map);
		
		boolean key =map.containsKey("英语");
		System.out.println("包含key:"+key);
		
		boolean value=map.containsValue(110);
		System.out.println("包含value:"+value);
	}
}
