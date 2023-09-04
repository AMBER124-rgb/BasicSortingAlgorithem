package day4;

public class LongestEvenOddSubArray {

	public static void main(String[] args) {
		int[]  arr = {5,10,20,6,3,8};
		int length = maxLengthEvenOddSubArray(arr);
		System.out.println("Maximum Length of Even Odd SubArray : "+length);

	}

	private static int maxLengthEvenOddSubArray(int[] arr) {
		int n = arr.length;
		int res=1;
		for(int i= 0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0))
						count++;
				else
					break;
			}
			res=Math.max(res, count);
		}
		return res;
	}

}
