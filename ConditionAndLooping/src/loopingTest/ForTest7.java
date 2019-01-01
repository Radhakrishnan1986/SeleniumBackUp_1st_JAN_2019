package loopingTest;

/**
 * for loop to split a string and reverse the string
 */
public class ForTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "VMETRY";
		/*for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}*/
	for(int j = a.length()-1; j>=0; j--) {
		System.out.println(a.charAt(j));
	}
}
}