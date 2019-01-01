package returnTypeTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = add();
		int s = sub();
		int x = a * s;
		System.out.println(x);
		System.out.println(addmsg());
	}

	public static int add() {
		int i = 1;
		int j = 1;
		int k = i + j;
		System.out.println(k);
		return k;
	}

	public static int sub() {
		int i = 6;
		int j = 3;
		int k = i - j;
		System.out.println(k);
		return k;
	}

	public static String addmsg() {
		int i = 5;
		int j = 10;
		int k = i + j;
		String a = "Hellow";
		String b = "Vmetry";
		String c = a+b + k;
		return c;
	}
	public ReturnTypeTest() {
		System.out.println("Constructor Test");
	}

}
