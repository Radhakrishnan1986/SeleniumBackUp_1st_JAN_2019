package abstarctTest;

public abstract class RBITest {
	// 'Credit' 'debit', Looks like interface
	public abstract void credit();

	public abstract void debit();

//'loan' Looks like inheritance
	public static void loan() {
		System.out.println("Loan");
	}
}
