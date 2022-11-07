package ArraysPrograms;

import java.util.Scanner;

public class KthLargestElement {
	
	public static void kthLargest(int number,String str) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of array You want to Create");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of any array");
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Arrays Elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		int k=number;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if(i==k-1) {
				System.out.println(str+":"+a[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		System.out.println("Enter your String which you want to print");
		System.out.println();
		String text=sc.next();
		System.out.println();
		kthLargest(choice,text);

	}

}
