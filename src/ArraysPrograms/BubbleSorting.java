package ArraysPrograms;

public class BubbleSorting {

	public static void main(String[] args) {
		int a[] = { 23, 56, 234, 2, 87, 8, 3, 43, 22, 4 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k] + " ");
		}
	}
}
