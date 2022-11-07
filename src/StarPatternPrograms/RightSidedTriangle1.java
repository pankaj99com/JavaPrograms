package StarPatternPrograms;

public class RightSidedTriangle1 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {//This is row
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
