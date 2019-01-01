package basicPrograms;

public class Numberdevisibleby3or5 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print("ABC" + ",");
			} else if (i % 5 == 0) {
				System.out.print("DEF" + ",");
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}
