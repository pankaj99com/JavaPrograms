package StringPrograms_Type2;

public class PrintStringAfterRemovingSpaces {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		String s = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				s = s + ch;
			}
		}
		System.out.println(s);
	}

}
