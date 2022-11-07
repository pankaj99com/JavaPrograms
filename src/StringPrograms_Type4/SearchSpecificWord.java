package StringPrograms_Type4;

public class SearchSpecificWord {

	public static void main(String[] args) {
		String str = "I love my MOM and DAD";
		String word = "";
		str = str + " ";
	
		boolean flag=false;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {
				if(word.equalsIgnoreCase("mom")) {
					System.out.println(word);
					flag=true;
				}
				word = "";
			}

		}
		if(flag==true) {
			System.out.println("Word found");
		}else {
			System.out.println("word not found");
		}

	}

}
