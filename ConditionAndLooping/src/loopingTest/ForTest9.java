package loopingTest;

/**
 * To find a string is Palindrom
 */
public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "MADAMM";
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + (input.charAt(i));
		}
		if(input.equals(output)) {
			System.out.println("The given string is a Palindrom");
		}
		else {
			System.out.println("The given string is not a Palindrom");
		}
	}

}
