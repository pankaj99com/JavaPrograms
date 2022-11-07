package StringPrograms_Type2;

public class PrintStringAfterRemovingSpaces1 {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		String s="";
		String a[]=str.split(" ");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]);
		}

	}

}
