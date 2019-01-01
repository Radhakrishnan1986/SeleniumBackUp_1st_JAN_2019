package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultitestSingleDataProvider {
	String Username;
	String password;
	String ticket1;
	String ticket2;
	
	@Factory(dataProvider = "dataset")
	public MultitestSingleDataProvider(String Username, String password, String ticket1, String ticket2){
		this.Username = Username;
		this.password = password;
		this.ticket1 = ticket1;
		this.ticket2 = ticket2;
	}

	@Test(priority =1)
	public void loginTest() {
		System.out.println(Username);
		System.out.println(password);
		System.out.println("Click login button");
	}
	@Test(priority =2)
	public void bookingTest() {
		System.out.println(ticket1);
		System.out.println(ticket2);
		System.out.println("Click booking button");
	}
	@DataProvider(name = "dataset")
	public static Object[][] getdata() {
		Object[][] data = new Object[3][4];
		// First Data Set
		data[0][0] = "Admin";
		data[0][1] = "ABCDE";
		data[0][2] = "Movie ticket 1";
		data[0][3] = "Movie ticket 2";

		// Second Data Set
		data[1][0] = "Staff";
		data[1][1] = "12345";
		data[1][2] = "Bus ticket 1";
		data[1][3] = "Bus ticket 2";

		// Third Data Set
		data[2][0] = "Student";
		data[2][1] = "11111";
		data[2][2] = "Train ticket 1";
		data[2][3] = "Train ticket 2";
		return data;
	}

}