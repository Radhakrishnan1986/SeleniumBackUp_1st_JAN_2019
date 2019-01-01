package stringTest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "VMETRY";//Literals string
		String b = "VMETRY";
		String c = new String("VMETRY"); //String Object
		String d = new String("VMETRY");

		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));

	}

}
