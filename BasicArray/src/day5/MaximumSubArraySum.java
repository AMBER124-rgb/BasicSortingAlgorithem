package day5;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, -2, 3, 4 };
		int sum = maxCircularSum(arr);
		System.out.println("MaximumSubArraySum : " + sum);
	}

	private static int maxCircularSum(int[] arr) {
		int n = arr.length;
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int currSum = arr[i];
			int maxSum = arr[i];

			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				currSum += arr[index];
				maxSum = Math.max(maxSum, currSum);

			}
			res = Math.max(maxSum, res);
		}
		return res;
	}

}
