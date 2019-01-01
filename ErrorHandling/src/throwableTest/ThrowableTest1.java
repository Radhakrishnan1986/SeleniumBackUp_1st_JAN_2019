package throwableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initaiated");
		try {
			File f = new File("Global file");
			FileInputStream fis = new FileInputStream(f);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Alert: Global file not present looking for local file" + e.getMessage());
		}
		System.out.println("Completed");		
	}

}
