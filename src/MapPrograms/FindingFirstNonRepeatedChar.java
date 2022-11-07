package MapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindingFirstNonRepeatedChar {

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

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue()== 1) {
				System.out.println(entry.getKey());
				break;
			}

		}

	}

	public static void main(String[] args) {

		findFirstNonRepeatedChar("SWISS");
	}

}
