package day4;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]  arr = {2,3,-8,7,-1,2,3};
		//int[]  arr = {1,-2,3,-1,2};
		int[]  arr = {-5,1,-2,3,-1,2,-2};
		int maximumSum=sumMax(arr);
		System.out.println("Maximum Sum of SubArray : "+maximumSum);
	}

	private static int sumMax(int[] arr) {
		int n=arr.length,curr;
		int maxSum = arr[0];
		for(int i=0;i<n;i++)
		{
			curr=0;
			for(int j=i;j<n;j++)
			{
				curr+=arr[j];
				maxSum=Math.max(maxSum,curr);
			}
			
		}
		return maxSum;
	}
	
	

}
