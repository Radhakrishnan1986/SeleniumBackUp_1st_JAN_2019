package basicPrograms;

public class CubeRootofAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 153;
		int b = 10;
		int c = 0;
		int d = 0;
		int e = 1;
		int f = 0;
		int g = 0;
		for (int i = 1; i <= 3; i++) {
			c = a % b;
			a = a / b;
			d = d + c;

			for (int j = 0; j < 3; j++) {
				e = e * c;
				f = e;
			}
			System.out.println(f);
			e = 1;
			g = g + f;

		}
		System.out.println("The sum of unmbers is:" + d);
		System.out.println("The cube root of unmbers is:" + g);
	}

}
