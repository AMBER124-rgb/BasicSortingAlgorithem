package day2;

import java.util.HashSet;
import java.util.Set;

public class IsPairWithSumInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 8, 15, -8 }; // { 11, 5, 6 };
		int givenSum = 17; // 10;
		isPair(arr, givenSum);

	}

	private static void isPair(int[] arr, int givenSum) {
		Set<Integer> s = new HashSet<>();
		for (int i : arr) {
			if (s.contains(givenSum - i))
				System.out.println(true);
			s.add(i);
		}
	}

}
