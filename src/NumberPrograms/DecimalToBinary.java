package NumberPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decial Number");
		int number=sc.nextInt();
		
		int n=0;
		n=number;
		int r=0;
		String sum="";
		while(n!=0) {
			r=n%2;
			sum=r+sum;
			n=n/2;
			
			
		}
		System.out.println(sum);
		

	}

}
