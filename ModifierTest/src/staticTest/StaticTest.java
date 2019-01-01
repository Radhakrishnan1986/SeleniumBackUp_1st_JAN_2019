package staticTest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest s = new StaticTest();
		s.mul();
		s.add();
		s.sub();
	}

	public static void add() {
		System.out.println("add");
	}

	public void sub() {
		System.out.println("sub");
	}

	public void mul() {
		add();
		sub();
	}
}
