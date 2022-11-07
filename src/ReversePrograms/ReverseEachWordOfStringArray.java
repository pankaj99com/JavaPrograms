package ReversePrograms;

public class ReverseEachWordOfStringArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 4, 4 };
		String[] str = new String[] { "java", "TestNg", "Selenium", "Jenkins", "Cucumber", "Postman" };
		for (int j = 0; j < str.length; j++) {
			String s = str[j];// java
			String rev = "";

			for (int k = 0; k < s.length(); k++) {
				char c = s.charAt(k);
				rev = c + rev;
			}

			System.out.print(rev + " ");

		}
	}

}
