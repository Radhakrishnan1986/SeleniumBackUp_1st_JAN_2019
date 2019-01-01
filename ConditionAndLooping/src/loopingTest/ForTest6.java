package loopingTest;

/**
 * for loop to print Pyramid 
 */
public class ForTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) { // i <= 5; (or) i <= 4;
			for (int k = 1; k < i; k++) { // k = 1; (or) K = 0;
				System.out.print(" ");
			}
			for (int j = 0; j <= 5 - i; j++) { // j <= 5 - i; (or) j <= 4 - i;
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}