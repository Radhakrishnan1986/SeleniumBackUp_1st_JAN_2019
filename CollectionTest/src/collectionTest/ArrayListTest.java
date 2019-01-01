package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<String> a = new ArrayList<String>();
		// ArrayList<Integer> a = new ArrayList<Integer>();
		// a.add("test 1");
		// a.add(1);
		// a.add('a');
		ArrayList a = new ArrayList();
		a.add("test 1");// 0 (To note here indexing is made in assumption)
		a.add("test 3");// 1
		a.add("test 4");// 2
		a.add("test 2");// 3

		// System.out.println(a.size());
		// System.out.println(a.get(2));
		// a.remove(2);
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Before sort:" + a.get(i));
		}
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.println("After sort:" + a.get(i));
		}
	}

}
