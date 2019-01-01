package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("test 1");// 0
		a.add("test 2");// 1
		a.add("test 4");// 2
		a.add("test 3");// 3

		ArrayList b = new ArrayList();
		b.add("test 5");// 0
		b.add("test 6");// 1
		b.add("test 7");// 2
		b.add("test 8");// 3

		a.addAll(b);
		System.out.println(a.size());
		System.out.println(b.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}