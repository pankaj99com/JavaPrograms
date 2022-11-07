package StringPrograms_Type1;

public class PrintOnlyDigits {

	public static void main(String[] args) {
		String str="INDIA is a great country 78";
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
			}
			
		}
		
	}

}
