package StringPrograms_Type2;

public class PrintStringAfterConvertingCases {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		String s = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				s = s + Character.toUpperCase(ch);
			} else {
				s = s + Character.toLowerCase(ch);
			}
		}
		System.out.println(s);
	}

}
