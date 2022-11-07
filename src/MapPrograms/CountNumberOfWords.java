package MapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumberOfWords {
	
	public static void getCountOfWords(String name) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String strArray[]=name.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			
			if(!map.containsKey(strArray[i])) {
				
				map.put(strArray[i], 1);
			}else {
				map.put(strArray[i],map.get(strArray[i])+1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired string and get the count of words");
		String str=sc.nextLine();
		getCountOfWords(str);
	}

}
