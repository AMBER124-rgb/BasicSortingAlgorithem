package day4;
public class LongextEvenOddSubArrayKadaneAlgo {

	public static void main(String[] args) {
		int[]  arr = {5,10,20,6,3,8};
		int length = maxLengthEvenOddSubArrayCadanceAlgo(arr);
		System.out.println("Maximum Length of Even Odd SubArray : "+length);
	}

	private static int maxLengthEvenOddSubArrayCadanceAlgo(int[] arr) {
		int n=arr.length;
		int res=1,count=1;
		for(int i=1;i<n;i++)
		{
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
			{
				count++;
				res=Math.max(count, res);
			}
			else
				count=1;
		}
		return res;
	}

}
