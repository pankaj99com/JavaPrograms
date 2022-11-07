package StringPrograms_Type2;

public class PrintOnlyUpperCaseAndFormString {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";

		String s = "";// Take empty String

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {

				s = s + ch;
			}
		}
		System.out.println(s);
	}

}
