package RemovingDuplicates;

public class RemovingDuplicatesUsingArray {

	public static void main(String[] args) {

		String str = "Programming";

		char[] ch = str.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {

			boolean repeated = false;

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {

					repeated = true;
					break;
				}
			}

			if (repeated == false) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}

}
