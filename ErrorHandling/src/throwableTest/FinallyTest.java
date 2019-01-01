package throwableTest;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initaiated");
		try {
			int i = 1 / 0;
		} 
		/*catch (Exception e) {
			System.out.println("Alert: Sorry some thing went wrong" + e.getMessage());
		}*/
		finally {
			System.out.println("Log.DB");
		}
		System.out.println("Completed");
	}
}