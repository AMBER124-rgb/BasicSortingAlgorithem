package day2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraywithEqualNoOf0And1 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 0, 0, 0 };
		int length = longestEqualSubArray(arr);
		System.out.println(length);
	}

	private static int longestEqualSubArray(int[] arr) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int maxLen = 0;
		int count = 0;
		m.put(0, -1); // Initialize with a count of 0 at index -1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count--;
			else
				count++;
			System.out.println(m);
			if (m.containsKey(count))
				maxLen = Math.max(maxLen, i - m.get(count));
			else
				m.put(count, i);

		}
		return maxLen;
	}

}
