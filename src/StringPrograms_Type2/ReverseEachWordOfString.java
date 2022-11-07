package StringPrograms_Type2;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "INDIA is a great Country 78";
		//expected:87 yrtnuoC taerg a si AIDNI
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			reverse = ch + reverse;
		}

		System.out.println(reverse);
	}

}
