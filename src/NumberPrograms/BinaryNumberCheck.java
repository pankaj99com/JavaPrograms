package NumberPrograms;

import java.util.Scanner;

public class BinaryNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int sum=0,r=0;
		boolean flag=false;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			if(r>1) {
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Its a Binary Number");
		}else {
			System.out.println("Its not a Binary Number");
		}
	}

}
