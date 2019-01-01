package collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		//HashSet a = new HashSet();
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("A");
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}