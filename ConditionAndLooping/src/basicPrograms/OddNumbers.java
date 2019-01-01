package basicPrograms;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 100) {
			int j = i % 2;
			if (j == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
