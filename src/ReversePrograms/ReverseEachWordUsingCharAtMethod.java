package ReversePrograms;

public class ReverseEachWordUsingCharAtMethod {

	public static void main(String[] args) {
		String str = "I am learning Java";
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			result=ch+result+" ";

		}
		System.out.println(result);
	}

}
