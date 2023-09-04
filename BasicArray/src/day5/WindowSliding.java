package day5;

public class WindowSliding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,30,-5,20,7};
		int sum = windowSliding(arr,3);
		System.out.println("Summation : "+sum);
	}

	private static int windowSliding(int[] arr, int k) {
		int n= arr.length,sumMax=Integer.MIN_VALUE;
		for(int i=0;i<n-k;i++)
		{
			int sum=0;
			
			for(int j=i;j<k+i;j++)
			{
				sum+=arr[j];
				
			}
			sumMax=Math.max(sum, sumMax);
			System.out.println(sumMax);
		}
		return sumMax;
	}
	
	
}
