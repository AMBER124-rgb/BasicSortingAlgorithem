package day4;

public class MaximumSumSubArrayEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]  arr = {2,3,-8,7,-1,2,3};
		int[]  arr = {-3,8,-2,4,-5,3};
		int maximumSum=sumMax(arr);
		System.out.println("Maximum Sum of SubArray : "+maximumSum);
	}

	private static int sumMax(int[] arr) {
		int n=arr.length,maxEnding=arr[0],res=arr[0];
		for(int i=0;i<n;i++)
		{
		maxEnding=Math.max(maxEnding+arr[i], arr[i]);	
		res=Math.max(maxEnding, res);
		System.out.print(maxEnding+"---------");
		System.out.println(res);
		}
		return res;
	}

}
