package MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInIntegerArray {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 23, 43, 12, 2, 54, 23, 3, 89, 56, 34, 23, 16, 12, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : arr) {

			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

		for (Integer i : map.keySet()) {

			if (map.get(i) > 1) {
				System.out.println(i);
				
			
			}

		}
		
	}

}
