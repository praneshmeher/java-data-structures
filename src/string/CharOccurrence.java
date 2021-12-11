package string;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
	
	public static Map<Character, Integer> getCharOccurrence(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), count+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}

	public static void main(String args[]) {
		String s = "Geeksforgeeks";
		System.out.println(CharOccurrence.getCharOccurrence(s));
	}
}
