package basicPrograms;

public class MultiplyANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 6;
		int i = 1;
		int output = 0;

		while (i <= num2) {
			output = output + num1;
			i++;
		}
		System.out.println(output);
	}

}
