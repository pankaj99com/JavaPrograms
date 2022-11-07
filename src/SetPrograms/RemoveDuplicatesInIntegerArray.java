package SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInIntegerArray {

	public static void main(String[] args) {
		int arr[] = { 12, 4, 1, 23, 12, 45, 67, 23, 45, 23, 5, 7, 8, 34, 23, 12 };

		Set<Integer> set = new HashSet<Integer>();
		System.out.println("Duplicates are:");
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		System.out.println("Array After removing duplicates:");
		System.out.println(set);
	}

}
