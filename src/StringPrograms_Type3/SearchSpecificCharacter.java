package StringPrograms_Type3;

public class SearchSpecificCharacter {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";

		String word = "";
		str = str + " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				word = word + ch;

			} else {
				if (word.contains("i"))

					System.out.println(word);
				word = "";

			}

		}
	}
}
