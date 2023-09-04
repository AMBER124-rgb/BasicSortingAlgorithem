package day5;

public class SubArraySumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		boolean isEqual = isSubSum(arr, 33);
		System.out.println(isEqual);
	}

	private static boolean isSubSum(int[] arr, int givenSum) {
		int n = arr.length, currSum = arr[0], s = 0;
		for (int e = 1; e < n; e++) {
			while (currSum > givenSum && s < (e - 1)) {
				currSum -= arr[s];
				s++;
			}
			if (currSum == givenSum)
				return true;
			if (e < n)
				currSum += arr[e];
		}
		return (currSum == givenSum);
	}
}
