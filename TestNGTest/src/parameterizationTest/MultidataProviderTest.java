package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultidataProviderTest {

	@Test(dataProvider="dataset1")
	public void loginTest(String Username, String password ) {
		System.out.println(Username);
		System.out.println(password);
		System.out.println("Click login button");
	}
	@DataProvider(name="dataset1")
	public static Object[][] getdata() {
		Object[][] data = new Object[3][2];
		//First Data Set
		data[0][0] ="Admin";
		data[0][1] = "ABCDE";
		
		//Second Data Set
		data[1][0] = "Staff";
		data[1][1] = "12345";
		
		//Third Data Set
		data[2][0] = "Student";
		data[2][1] = "11111";
		return data;
	}
	@Test(dataProvider="dataset2")
	public void bookingTest(String ticket1, String ticket2) {
		System.out.println(ticket1);
		System.out.println(ticket2);
		System.out.println("Click booking button");
	}
	@DataProvider(name="dataset2")
	public static Object[][] getbookingdata() {
		Object[][] data = new Object[3][2];
		//First Data Set
		data[0][0] = "Movie Ticket 1";
		data[0][1] = "Movie Ticket 2";
		
		//Second Data Set
		data[1][0] = "Bus Ticket 1";
		data[1][1] = "Bus Ticket 2";
		
		//Third Data Set
		data[2][0] = "Train Ticket 1";
		data[2][1] = "Train Ticket 2";
		return data;
	}

}