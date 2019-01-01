package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataProviderTest {

	@Test(dataProvider="dataset")
	public void loginTest(String Username, String password ) {
		System.out.println(Username);
		System.out.println(password);
		System.out.println("Click login button");
	}
	@DataProvider(name="dataset")
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
	
}
