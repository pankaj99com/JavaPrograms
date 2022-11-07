package SetPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateChar {

	public static void removeDuplicates(String name) {
		char ch[]=name.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(char c:ch) {
			if(!set.add(c)) {
				
			}
			
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
	removeDuplicates("Programming");

	}

}
