package StringPrograms_Type1;

public class CountnoOfSpecificChar {

	public static void main(String[] args) {
		String str="INDIA is a great country 78";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A') {
				count++;
			}
		}
		System.out.println("count is "+count);

	}

}
