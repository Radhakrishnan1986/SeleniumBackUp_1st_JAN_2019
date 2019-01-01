package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("test 1");// 0
		a.add(123);// 1
		a.add('a');// 2
		a.add(true);// 3

		for (int i = 0; i < a.size(); i++) {
			System.out.println("Before sort:" + a.get(i));
		}
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.println("After sort:" + a.get(i));
		}

	}

}
