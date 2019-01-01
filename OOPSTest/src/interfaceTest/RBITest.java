package interfaceTest;

public interface RBITest {

	public void credit();

	default void debit() {
	}

	public void loan();
}
