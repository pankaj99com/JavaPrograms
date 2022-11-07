package MapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachWord {

	public static void getCountOFWords(String name) {

		String strArr[] = name.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strArr) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}

		System.out.println(map);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");

		String str = sc.nextLine();
		getCountOFWords(str);

	}

}
