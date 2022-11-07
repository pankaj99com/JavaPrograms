package StringPrograms_Type2;

public class PrintStringWithDigitAtFirstPlace {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		String digit = "";
		String s = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else {

				s = s + ch;
			}
		}
		String s1 = digit + s;
		System.out.println(s1);
	}

}
