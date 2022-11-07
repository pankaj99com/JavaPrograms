package StarPatternPrograms;

public class SquarePattern {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {//This is row
			for (int j = 1; j <= n; j++) {//this is col
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
