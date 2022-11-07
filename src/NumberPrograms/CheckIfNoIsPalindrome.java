package NumberPrograms;

import java.util.Scanner;

public class CheckIfNoIsPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0,sum=0;
		
		n=number;
		//454
		System.out.println(number);
		
		while(n!=0) {
			
			int r=n%10;//4  //5  //4
			sum=sum*10+r;//40+5=450+4=454
			n=n/10;//45  //4
		}
		if(sum==number) {
			System.out.println("Its a Palindrome number");
		}else {
			
			System.out.println("Its not a plaindrome number");
		}
		

	}

}
