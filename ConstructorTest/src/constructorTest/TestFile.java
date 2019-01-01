package constructorTest;

public class TestFile {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Normal Block");
	}

	public TestFile() {
		System.out.println("Constructor Block");
	}

	public static void add() {
		System.out.println("Funcation Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFile f = new TestFile();
		add();
	}

}
