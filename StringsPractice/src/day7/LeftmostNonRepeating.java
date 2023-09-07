package day7;

import java.util.Arrays;

public class LeftmostNonRepeating {

	static final int SIZE = 256;

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		// int index = leftMostNonRepeating(s);
		// int index = leftMostNonRepeatingBetterSolution(s);
		int index = leftMostNonRepeatingEfficient(s);
		if (index != -1)
			System.out.println("LeftMost Non Repeating Character is : " + s.charAt(index));
		else
			System.out.println("Non repeating characters are present");
	}

	private static int leftMostNonRepeatingEfficient(String s) {
		int[] fIndex = new int[SIZE];
		int index = Integer.MAX_VALUE;
		Arrays.fill(fIndex, -1);
		for (int i = 0; i < s.length(); i++) {
			if (fIndex[s.charAt(i)] == -1)
				fIndex[s.charAt(i)] = i;
			else
				fIndex[s.charAt(i)] = -2;
		}

		for (int i = 0; i < SIZE; i++)

			if (fIndex[i] > 0)
				index = Math.min(index, fIndex[i]);

		return (index==Integer.MAX_VALUE)?-1:index;
	}

	private static int leftMostNonRepeatingBetterSolution(String s) {
		int[] c = new int[SIZE];
		for (int i = 0; i < s.length(); i++)
			c[s.charAt(i)]++;

		for (int j = 0; j < s.length(); j++)
			if (c[s.charAt(j)] == 1)
				return j;
		return -1;
	}

	private static int leftMostNonRepeating(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				return i;
		}
		return -1;
	}

}
