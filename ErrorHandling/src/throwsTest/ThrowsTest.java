package throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class ThrowsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		filehandling();
	}
	public static void filehandling() throws IOException {

			File f = new File("Global file");
			FileInputStream fis = new FileInputStream(f);	
			Properties prop = new Properties();
			prop.load(fis);
	}

}
