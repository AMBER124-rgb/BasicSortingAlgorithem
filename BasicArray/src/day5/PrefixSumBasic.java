package day5;

public class PrefixSumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,3,9,6,5,4};
		int result=getSum(arr,0,2);
		int result1=getSum(arr,1,3);
		int result2=getSum(arr,2,6);
		System.out.println("result : "+result);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		prefixSum(arr);
		
	}

	private static void prefixSum(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int[] prefix_sum=new int[n];
		prefix_sum[0]=arr[0];
		System.out.print(prefix_sum[0] + " ");
		for(int i=1;i<n;i++)
		{
		prefix_sum[i]=prefix_sum[i-1]+arr[i];
		System.out.print(prefix_sum[i] + " ");
		}
	}

	private static int getSum(int arr[],int l, int r) {
		int sum=0;
		for(int i=l;i<=r;i++)
		{
		sum+=arr[i];	
		}
		return sum;
	}
	
	

}
