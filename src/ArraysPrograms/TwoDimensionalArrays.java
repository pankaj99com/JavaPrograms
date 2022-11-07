package ArraysPrograms;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		String str[][]=new String[2][5];
		str[0][0]="pankaj";
		str[0][1]="999";
		str[0][2]="99.456";
		str[0][3]="india";
		str[0][4]="#";
		
		str[1][0]="%%";
		str[1][1]="TESTING";
		str[1][2]="123";
		str[1][3]="Bangalore";
		str[1][4]="Accolite";
		
		for(int row=0;row<str.length;row++) {
			
			for(int col=0;col<str[0].length;col++) {
				System.out.println(str[row][col]);
			}
			
		}
		

	}

}
