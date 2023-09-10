package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElemenets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 10, 20, 30 };
		countDistinct(arr);
		// countDistinctEfficient(arr);

	}

//	private static void countDistinctEfficient(int[] a) {
//		HashSet<Integer> s = new HashSet<Integer>(Arrays.asList(a));
//		System.out.println(s.size());
//	}

	private static void countDistinct(int[] arr) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			s.add(arr[i]);
		System.out.println(s.size());
	}

}
