package encapsulationTest;

public class EncapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleEncapTest s = new SampleEncapTest();
		s.setAge(123);
		s.setName("ABCDEF");
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}

}
