package NumberPrograms;

import java.util.Scanner;

public class FcatorsOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int flag=0;
		System.out.println("Factors are:");
		for(int i=1;i<=n/2;i++) {
			
			if(n%i==0) {
				flag=1;
				
				
			}
			
			System.out.print(i+",");
			
		}
		System.out.print(String.valueOf(n));
	}

}
