package hashTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("UserName", "ABC");
		map.put("Password", "123");
		map.put("Domain", "Testing");
		map.put("Company", "Vmetry");
		map.put("address", null);
		map.put(null, "ADAYAR 1");
		map.put(null, "ADAYAR 2");
		
		// System.out.println(map.get("UserName"));
		
		Set s = map.keySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key+"-------"+map.get(key));
		}
	}

}
