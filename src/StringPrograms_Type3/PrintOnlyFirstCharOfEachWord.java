package StringPrograms_Type3;

public class PrintOnlyFirstCharOfEachWord {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		
		String word="";
		str=str+" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}else {
				
				if(word.length()<2) {
					System.out.print(word);
				}else {
					System.out.print(word.substring(0,2));
					
					word="";
				}
				
			}
		}

	}

}
