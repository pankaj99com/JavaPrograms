package StringPrograms_Type1;

import java.util.Scanner;

public class PrintingEachWord_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			
			System.out.println(str.charAt(i));
		}

	}

}
