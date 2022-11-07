package StringPrograms_Type1;

public class CountVowels {

	public static void main(String[] args) {
		String str = "INDIA is a great country 78";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			char ch = Character.toUpperCase(c);

			if (ch == 'A' || ch == 'E' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
