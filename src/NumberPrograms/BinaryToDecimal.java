package NumberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decial Number");
		int number=sc.nextInt();
		
		int n=0;
		n=number;
		int r=0;
		int i=0;
		int sum=0;
		while(n>0) {
			r=n%10;//1011-->1,1,,0,1
			
			sum=sum+r*(int)Math.pow(2,i++);//0+1=1,1+1*2=3,3+0=3,3+1*8=11
			//1+1*4=5
			
			n=n/10;//101,10,1,0
			
			
		}
		System.out.println(sum);
		

	}

}
