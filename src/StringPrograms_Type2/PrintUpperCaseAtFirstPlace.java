package StringPrograms_Type2;

public class PrintUpperCaseAtFirstPlace {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		String uc="";
		String s="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				
				uc=uc+ch;
			}else {
				
				s=s+ch;
			}
		}
		System.out.println(uc+s);
	}

}
