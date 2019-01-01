package collectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet s = new TreeSet();
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
