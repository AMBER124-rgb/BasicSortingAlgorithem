package day5;

public class WindowSlidingEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 30, -5, 20, 7 };
		int sum = windowSliding(arr, 3);
		System.out.println("Summation : " + sum);
	}

	private static int windowSliding(int[] arr, int k) {
		int n = arr.length, currSum = 0;
		for (int i = 0; i < k; i++)
			currSum += arr[i];
		int maxSum=currSum;
		
		for(int i=k;i<n;i++)
		{
			currSum=currSum+arr[i]-arr[i-k];
			maxSum=Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}

}
