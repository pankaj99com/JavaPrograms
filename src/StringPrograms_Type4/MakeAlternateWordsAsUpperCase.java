package StringPrograms_Type4;

public class MakeAlternateWordsAsUpperCase {

	
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
					if(count++%2==0) {
						ns=ns+word.toUpperCase()+" ";
					}else {
						ns=ns+word.toLowerCase()+" ";
					}
                   word="";
			}
			

		}
			System.out.println(ns);
	}
}