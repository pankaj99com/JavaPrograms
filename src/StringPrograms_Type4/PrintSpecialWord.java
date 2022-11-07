package StringPrograms_Type4;

public class PrintSpecialWord {

	public static void main(String[] args) {
		String str="I love my MOM and DAD";
		String word="";
		str=str+" ";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}else {
				char first=word.charAt(0);
				char last=word.charAt(word.length()-1);
				
				if(Character.toUpperCase(first)==Character.toUpperCase(last)) {
					System.out.println(word);
					
				}
				word="";
			}
		}

	}

}
