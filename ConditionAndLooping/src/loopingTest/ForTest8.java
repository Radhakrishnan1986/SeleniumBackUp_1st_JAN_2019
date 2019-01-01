package loopingTest;

public class ForTest8 {
	/**
	 * @author Radhakrishnan To find the cube root of given number (Say: 153)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 153;
		int b = 10;
		int e = 0;
		int f = 1;
		int g = 0;

		for (int i = 0; i < 3; i++) {
			int c = a % b;
			int d = a / b;
			a = d;
			System.out.print(c + " ");
			e = e + c;
			f = (c * c * c);
			g = g + f;
		}
		System.out.println();
		System.out.println("Sum of the value is:" + e);
		System.out.println("Cube root of given number is:" + g);
	}

}
