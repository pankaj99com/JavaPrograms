package RemovingDuplicates;

public class RemovingDuplicatesInIntegerArray {

	public static void main(String[] args) {
		
		int [] arr= {23,45,12,23,4,3,12,6,78,45};
		int []  arr1=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			
			boolean flag=false;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
				
			}
			
			if(flag==false) {
				
				for(int k=0;k<arr1.length;k++) {
					arr1[k]=arr[i];
					
					
				}
				System.out.print(arr1[i]+" ");
			}
			
		}
		
	}

}
