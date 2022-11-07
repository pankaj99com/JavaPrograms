package MapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class FrequencyOfCharacters {
	
	
	public static void getCharCount(String name) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//Map<Character,Integer> map=new TreeMap<Character,Integer>();
		//Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		//Map<Character,Integer> map=new WeakHashMap<Character,Integer>();
		
		char strArray[]=name.toCharArray();
		
		for(char c:strArray) {
			if(!map.containsKey(c)) {
				
				map.put(c, 1);
			}else {
				map.put(c,map.get(c)+1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		getCharCount("Intelligent");
	}

}
