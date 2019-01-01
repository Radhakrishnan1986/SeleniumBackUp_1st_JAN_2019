package basicPrograms;

public class DivideANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 101;
		int divisor = 10;
		int i = 0;
		while (number >= divisor) {
			number = number - divisor;
			i++;
		}
		System.out.println("Quotient is:"+i);
		System.out.println("remainder is:"+ number);
	}

}
