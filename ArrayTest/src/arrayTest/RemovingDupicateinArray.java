package arrayTest;

public class RemovingDupicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[9];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 2;
		a[6] = 3;
		a[7] = 4;
		a[8] = 6;

		for (int i = 0; i < a.length; i++) {
			// System.out.print(a[i]);
			// System.out.println();
			for (int j = i + 1; j < a.length; j++) {
				// System.out.print(a[j] + " ");
				if (a[i] == a[j]) {
					System.out.print(a[i]);
				}

			}
			System.out.println();
		}

	}
}
