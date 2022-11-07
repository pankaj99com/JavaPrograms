package ArraysPrograms;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		
		/*1.Static Arrays:-used to store similar kind of data type in an array variable
		lower index=0
		upper index=n-1
		
		Disadvantages:-Size is fixed and stores similar kind of data.
		To overcome with this problem we use object array*/
		//1st way
		int i[]=new int[4];
		i[0]=23;
		i[1]=2;
		i[2]=34;
		i[3]=10;
		System.out.println(i[3]);
		//System.out.println(i[4]);//Array index out of bound exception 
		
		
		//2nd way
		int j[]= {23,8,9,45,88};
		//we can also initialize and declare arrays in same statement.
		
		System.out.println(j[4]);
		
		
		//size of an array using array.length
		
		
		System.out.println(j.length);
		
		//How to print an array
		
		for(int k=0;k<j.length;k++) {
			System.out.println(j[k]);
		}
		
	
		
		//double array
		
		double d[]=new double[3];
		
		d[0]=12.45;
		d[1]=23.34;
		d[2]=11.0;
		
		for(int l=0;l<d.length;l++) {
			System.out.println(d[l]);
		}
		
		
		//char array
		
		char ch[]=new char[3];
		ch[0]='P';
		ch[1]='2';
		ch[2]='@';
		for(int m=0;m<ch.length;m++) {
			System.out.println(ch[m]);
		}
		
		//boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		for(int n=0;n<b.length;n++) {
			System.out.println(b[n]);
		}
		
		//String Array
		
		String str[]=new String[3];
		str[0]="PANKAJ";
		str[1]="Accolite digital";
		str[2]="Bangalore";
		
		for(int o=0;o<str.length;o++) {
			System.out.println(str[o]);
		}
		
		
		//Object Array
		
		Object arr[]=new Object[3];
		
		arr[0]="India";
		arr[1]=9;
		arr[2]='Q';
		for(int p=0;p<arr.length;p++) {
			System.out.println(arr[p]);
		}
	}

}
