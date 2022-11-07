package StringPrograms_Type5;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void isAnagram(String str1, String str2) {

		String s1 = str1.toUpperCase();
		String s2 = str2.toUpperCase();

		if (s1.length() != s2.length()) {
			System.out.println("Its not an Anagram as length not matching");

		}

		char[] strArr1 = s1.toCharArray();
		char[] strArr2 = s2.toCharArray();

		Arrays.sort(strArr1);
		System.out.println(strArr1);

		Arrays.sort(strArr2);
		System.out.println(strArr2);

		String sortedArr1 = new String(strArr1);
		String sortedArr2 = new String(strArr2);

		if (sortedArr1.equals(sortedArr2)) {
			System.out.println("Its an Anagram");
		} else {
			System.out.println("Its not an Anagram");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.next();

		System.out.println("Enter String2");
		String str2 = sc.next();

		isAnagram(str1, str2);

	}

}
