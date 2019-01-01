package throwableTest;

import java.util.Hashtable;

public class ThrowableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initiated");
		try {
			Hashtable table = new Hashtable();
			table.put("null", null);
			int a[] = new int[1];
			a[2] = 10;
			int i = 1 / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println("Alert: You have entered invalid number" + e.getMessage());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Alert: You entered invalid index" + e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("sorry some thing went wrong" + e.getMessage());
		}
		/*Not sure whether this is correct
			catch (Throwable e) {
			System.out.println("sorry some thing went wrong" + e.getMessage());
		}*/
		System.out.println("Completed");
	}

}
