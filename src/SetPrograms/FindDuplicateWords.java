package SetPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateWords {
public static void removeDuplicates(String name) {
	
	String[] strArr=name.split(" ");
	
	Set<String> set=new LinkedHashSet<String>();
	StringBuilder sb = new StringBuilder();
	for(String s:strArr) {
		if(!set.add(s)) {
			sb.append(s);
		}
		
	}
	System.out.println(sb);
	System.out.println(set);
}
	public static void main(String[] args) {
		removeDuplicates("I love java java programs");

	}

}
