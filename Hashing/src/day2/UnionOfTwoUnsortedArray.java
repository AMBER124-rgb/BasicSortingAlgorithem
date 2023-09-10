package day2;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArray {

	public static void main(String[] args) {
		int[] a = { 10, 15, 10, 15, 30, 30, 15 };
		int[] b = { 30, 5, 30, 10 };
		int m = a.length, n = b.length;
		findUnion(a, b, m, n);

	}

	private static void findUnion(int[] a, int[] b, int m, int n) {
		Set<Integer> s = new HashSet<>();
		for(int i : a)
			s.add(i);
		for(int j : b)
			s.add(j);
		System.out.println(s);
		System.out.println(s.size());
	}

}
