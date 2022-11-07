package NumberPrograms;

import java.util.Scanner;

public class CheckIfNoIsSpecialNumber {
/* 123,1+2+3=6 and 1*2*3=6 this is spy number*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0,sum=0,prod=1;
		
		n=number;
		//123
		System.out.println(number);
		
		while(n!=0) {
			
			int r=n%10;//3  //2  //1
			sum=sum+r;//3+2=5+1=6
			prod=prod*r;//3*2=6*1=6
			
			n=n/10;//12 //1  //0
		}
		if(sum==prod) {
			System.out.println("yes sum and product is same so its a SPY NUMBER");
		}else {
			
			System.out.println("No sum and product is not same so its NOT A SPY NUMBER");
		}
		

	}

}
