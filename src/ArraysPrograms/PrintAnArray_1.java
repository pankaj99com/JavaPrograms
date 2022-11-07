package ArraysPrograms;

public class PrintAnArray_1 {

	public static void main(String[] args) {
		int a[]= {12,4,2,23,20,12,3,4};
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("Another Array");
		int[] a1=new int[6];
		a1[0]=2;
		a1[1]=45;
		a1[2]=34;
		a1[3]=4;
		a1[4]=67;
		a1[5]=56;
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+",");
		}

	}

}
