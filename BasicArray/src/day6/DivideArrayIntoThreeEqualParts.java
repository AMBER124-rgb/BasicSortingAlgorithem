package day6;

public class DivideArrayIntoThreeEqualParts {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 1, 3, 4 };
		System.out.println(canDivideArray(arr));

	}

	private static boolean canDivideArray(int[] arr) {
		int n = arr.length, partSum = 0, partCount = 3;
		int totalSum = 0;
		for (int i = 0; i < n; i++)
			totalSum += arr[i];
		if (totalSum % 3 != 0)
			return false;
		int targetSum = totalSum / 3;

		for (int j = 0; j < n; j++) {
			partSum += arr[j];

			if (partSum == targetSum) {
				partSum = 0;
				partCount++;
			}
			if (partCount == 3)
				return true;
		}
		return false;
	}

}
