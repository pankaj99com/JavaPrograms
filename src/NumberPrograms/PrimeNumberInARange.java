package NumberPrograms;

import java.util.Scanner;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
//		System.out.println("Enter the number");
//		int number=sc.nextInt();
		
		
		int count=0;
	
		System.out.println("Prime number in a range of "+range+" are");
		for(int i=1;i<=range;i++) {
			
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					count=1;
				}
				
			}
			if(count==0) {
				System.out.print(i+",");
			}
			else {
				count=0;
			}
		}
		
	}

}
