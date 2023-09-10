package day2;

import java.util.HashMap;
import java.util.Map;

public class LomgestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 1, 5, -6, 6, 2, 2 };
		int givenSum = 4;
		int maxLen = maxLen(arr, givenSum);
		System.out.println(maxLen);
	}

	private static int maxLen(int[] arr, int givenSum) {
		int preFixSum = 0, length = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			preFixSum += arr[i];
			if (preFixSum == givenSum)
				length = i + 1;
			if (m.containsKey(preFixSum) == false)
				m.put(preFixSum, i);
			if (m.containsKey(preFixSum - givenSum))
				length = Math.max(length, i - m.get(preFixSum - givenSum));

		}
		return length;
	}

}
