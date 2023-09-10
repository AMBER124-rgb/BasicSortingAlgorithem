package day3;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSpanWithSameSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 0, 1, 0, 0, 0, 1, 1, 1 };
		int[] arr2 = { 1, 0, 1, 0, 0, 0, 1, 0 };
		// int[] diff = { -1, 1,-1, 0, 0, 1, 0 , 1};
		int maxLength = findLongestCommonSpan(arr1, arr2);
		System.out.println("Maximum Length of Common Span with Same Sum: " + maxLength);

	}

	private static int findLongestCommonSpan(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return 0; // Arrays must have the same length
		}

		int[] diff = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			diff[i] = arr1[i] - arr2[i];
		}

		Map<Integer, Integer> sumIndexMap = new HashMap<>();
		int maxLen = 0;
		int cumulativeSum = 0;
		// sumIndexMap.put(0, -1);

		for (int i = 0; i < diff.length; i++) {
			cumulativeSum += diff[i];

			if (cumulativeSum == 0)
				maxLen = i + 1;

			else if (sumIndexMap.containsKey(cumulativeSum))
				maxLen = Math.max(maxLen, i - sumIndexMap.get(cumulativeSum));
			else
				sumIndexMap.put(cumulativeSum, i);
		}
		return maxLen;
	}

}
