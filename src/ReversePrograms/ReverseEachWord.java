package ReversePrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "I am learning Java";
		String result = "";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			result = ch[i] +result+ ' ';
		}
		System.out.println(result);
	}

}
