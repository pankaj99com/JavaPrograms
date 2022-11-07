package RemovingDuplicates;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
public static void removeDuplicates(String name) {
	
	String[] strArr=name.split(" ");
	
	Set<String> set=new LinkedHashSet<String>();
	
	for(String s:strArr) {
		if(!set.add(s)) {
			
		}
		
	}
	System.out.println(set);
}
	public static void main(String[] args) {
		removeDuplicates("I love java java programs");

	}

}
