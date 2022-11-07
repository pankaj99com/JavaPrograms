package MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {
	
	public static void findDuplicates(String name) {
		
		String strArray[]=name.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String s:strArray) {
			
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				map.put(s,map.get(s)+1);
			}
		}
		
		for(String s:map.keySet()) {
			
			if(map.get(s)>1) {
				System.out.println(s);
			}
			
		}
	}

	public static void main(String[] args) {
		
	
		findDuplicates("I am learning java java programming");

	}

}
