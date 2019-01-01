package variableTest1;

public class VaraibleTest1 {
	int i =10; 
	int j = 1; 
// public static int i = 10;
// public static int j = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		int k = i + j;
		System.out.println(k);
		
		add();
	}

	public static void add() {
		VaraibleTest1 v = new VaraibleTest1();
		int z = v.i + v.j;
		System.out.println(z);
	}
}