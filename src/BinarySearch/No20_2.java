package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No20_2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		System.out.println(Collections.binarySearch(list, 1));
	}
}
