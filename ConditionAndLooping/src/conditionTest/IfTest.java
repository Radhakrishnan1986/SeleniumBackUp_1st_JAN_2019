package conditionTest;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		String country = "PAK";
		if (age > 18) {
			System.out.println("Allow to vote");
		}
		else if(country.equals("PAK")) {
			System.out.println("He is pakistan Allowed to Vote");
		}
		else {
			System.out.println("Age is Under 18");
		}
	}

}
