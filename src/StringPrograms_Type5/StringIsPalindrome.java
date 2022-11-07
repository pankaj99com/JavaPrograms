package StringPrograms_Type5;
import java.util.Scanner;
public class StringIsPalindrome {
	
	public static void isPlaindrome(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
	
		if(str.equals(rev)) {
			
			System.out.println("Its a Palindrome String");
		}else {
			System.out.println("Its not a Palindrome String");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str1=sc.nextLine();
		isPlaindrome(str1);
		
	}

}