package MapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindingFirstNonRepeatedChar2 {

	public static void findFirstNonRepeatedChar(String name) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}

		for(Character c:map.keySet()) {
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
	}

	public static void main(String[] args) {

		findFirstNonRepeatedChar("SWISS");
	}

}
