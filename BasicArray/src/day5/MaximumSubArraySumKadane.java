package day5;

public class MaximumSubArraySumKadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, -2, 3, 4 };
		int sum = maxSubArraySum(arr);
		System.out.println("MaximumSubArraySum : " + sum);
	}

	private static int maxSubArraySum(int[] arr) {
		int n=arr.length,arrSum=0;
		
		int noramlMaxSum=maxNormalSum(arr);
		if(noramlMaxSum<0)
			return noramlMaxSum;
		
		for(int i=0;i<n;i++)
		{
			arrSum+=arr[i];
			arr[i]=-arr[i];
		}
		int maxCircularSum=arrSum+maxNormalSum(arr);
		return Math.max(noramlMaxSum, maxCircularSum);
		
	}

	private static int maxNormalSum(int[] arr) {
		int n=arr.length,maxNormal=arr[0],res=arr[0];
		for(int i=1;i<n;i++)		//For calcualting Normal Max using Kadane
		{
			maxNormal=Math.max(maxNormal+arr[i], arr[i]);
			res=Math.max(maxNormal, res);
		}
		return res;
	}
	

}
