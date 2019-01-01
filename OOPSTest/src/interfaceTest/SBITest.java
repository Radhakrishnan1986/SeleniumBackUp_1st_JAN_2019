package interfaceTest;

public class SBITest implements RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBITest s = new SBITest();
		s.credit();
		s.debit();
		s.loan();
	}

	@Override
	public void credit() {
		System.out.println("Credit");

	}

	@Override
	public void debit() {
		System.out.println("Debit");

	}

	@Override
	public void loan() {
		System.out.println("Loan");
//Polymorphism 
	}

}
