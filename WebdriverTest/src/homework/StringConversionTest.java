package homework;

public class StringConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc123";
		a = a.replaceAll("[^a-zA-Z]","");
		//a = a.replaceAll("[^0-9]","");
		System.out.println(a);

	}

}
