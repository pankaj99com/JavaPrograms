package StringPrograms_Type4;

public class PrintlargestWord {

	public static void main(String[] args) {
		String str = "I love my MOM and DAD";
		String word = "";
		str = str + " ";
		String largest = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.length() > largest.length())
					largest = word;

				word = "";
			}

		}
		System.out.println(largest);

	}

}
