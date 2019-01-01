package constructorTest;

public class SampleTest {
	// static int i = 6;
	// static int j = 6;
	public static int i;
	public static int j;

	public static void main(String[] args) {
		int k = i + j;
		System.out.println(k);

		SampleTest s = new SampleTest();
		int z = s.i + s.j;
		System.out.println(z);

		SampleTest a = new SampleTest(10, 10);
		int x = a.i + a.j;
		System.out.println(x);
	}

//Default constructor
	public SampleTest() {
		i = 5;
		j = 5;
	}

//Parameterized constructor 
	public SampleTest(int i, int j) {
		this.i = i;
		this.j = j;
	}

}