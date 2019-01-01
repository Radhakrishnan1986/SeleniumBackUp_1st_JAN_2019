package collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet s = new LinkedHashSet();
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
