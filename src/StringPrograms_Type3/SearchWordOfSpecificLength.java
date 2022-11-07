package StringPrograms_Type3;

public class SearchWordOfSpecificLength {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";

		String word = "";
		str = str + " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				word = word + ch;

			} else {
				if (word.endsWith("t"))

					System.out.println(word);
				word = "";

			}

		}
	}
}
