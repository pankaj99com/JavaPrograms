package StringPrograms_Type4;

public class MakeFirstLetterOfWordsAsUpperCase {

	
		public static void main(String[] args) {
			String str = "I love my MOM and DAD";
			//I love MY mom AND dad 
			String word = "";
			str = str + " ";
			String ns="";
		int count=0;
			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if (ch != ' ') {
					word = word + ch;
				} else {
					char first=word.charAt(0);
					first=Character.toUpperCase(first);
					ns=ns+first+word.substring(1)+" ";
					word="";
			}
			

		}
			System.out.println(ns);
	}
}