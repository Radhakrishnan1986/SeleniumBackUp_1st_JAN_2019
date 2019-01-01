package basicPrograms;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 100) {
			int j = i % 2;
			if (j == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
