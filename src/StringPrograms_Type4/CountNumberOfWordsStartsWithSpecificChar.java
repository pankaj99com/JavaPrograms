package StringPrograms_Type4;

public class CountNumberOfWordsStartsWithSpecificChar {

	
		public static void main(String[] args) {
			String str = "I love my MOM and DAD";
			String word = "";
			str = str + " ";
		
			int count=0;
			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if (ch != ' ') {
					word = word + ch;
				} else {
					if(word.startsWith("M"))
						
					count++;
					
					word = "";
				}

			}
			System.out.println(count);

		}

	}