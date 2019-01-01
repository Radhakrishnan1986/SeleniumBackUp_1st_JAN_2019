package hashTest;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();
		table.put("UserName", "ABC");
		table.put("Password", "123");
		table.put("Domain", "Testing");
		table.put("Company", "Vmetry");
		//table.put("address", null);
		//table.put(null, "ADAYAR");
		
		//System.out.println(table.get("UserName"));
		
		Enumeration e = table.keys();
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key+"-----"+table.get(key));
		}
	
	}

}
