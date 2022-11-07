package StringPrograms_Type5;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String str = " j   a    v    a  ";

		String plaintext = str.replaceAll("\\s", "");

		System.out.println(plaintext);

	}

}
