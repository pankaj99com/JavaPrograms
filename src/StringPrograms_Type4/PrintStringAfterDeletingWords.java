package StringPrograms_Type4;

public class PrintStringAfterDeletingWords {

	
		public static void main(String[] args) {
			String str = "I love my MOM and DAD";
			String word = "";
			str = str + " ";
			String ns="";
		
			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if (ch != ' ') {
					word = word + ch;
				} else {
					if(word.equals("DAD")) {
						ns=ns+"DADDY"+" ";
				
				}else {
					ns=ns+word+" ";
					word = "";
				}

			}
			

		}
			System.out.println(ns);
	}
}