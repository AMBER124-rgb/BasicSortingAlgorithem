package day2;

public class LongestSubArrywithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 5, 8, -4, -4, 9, -2, 2 };
		int givenSum = 0;
		int length = maxLen(arr, givenSum);
		System.out.println(length);
	}

	private static int maxLen(int[] arr, int givenSum) {
		int n = arr.length, maxLength = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0, len = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				len++;
				//System.out.print(sum + " ");
				if (sum == givenSum)
				{
					//System.out.println(sum+"------"+givenSum);
					maxLength = Math.max(maxLength, len);
				}
			}
			//System.out.println();
		}
		return maxLength;
	}

}
