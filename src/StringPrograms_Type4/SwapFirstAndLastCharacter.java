package StringPrograms_Type4;

public class SwapFirstAndLastCharacter {

	
		public static void main(String[] args) {
			String str = "We love my MOM and DAD";
			//eW eovl ym MOM dna DAD 

			String word = "";
			str = str + " ";
			String ns="";
		
			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if (ch != ' ') {
					word = word + ch;
				} else {
					char first=word.charAt(0);
					char last=word.charAt(word.length()-1);
					String middle=word.substring(1,word.length()-1);
					ns=ns+last+middle+first+" ";
					word="";
			}
			

		}
			System.out.println(ns);
	}
}