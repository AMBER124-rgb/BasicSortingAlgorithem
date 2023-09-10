package day2;

import java.util.HashSet;
import java.util.Set;

public class SubArryWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 6, 13, 3, -1 };
		int givenSum = 22;
		System.out.println(isSum(arr, givenSum));

	}

	private static boolean isSum(int[] arr, int givenSum) {
		int prefixSum = 0;
		Set<Integer> s = new HashSet<>();
		for (int i : arr) {
			prefixSum += i;
			System.out.println(s);
			if (prefixSum == givenSum)
				return true;
			if (s.contains(prefixSum - givenSum))
				return true;
			s.add(prefixSum);
		}

		return false;
	}

}
