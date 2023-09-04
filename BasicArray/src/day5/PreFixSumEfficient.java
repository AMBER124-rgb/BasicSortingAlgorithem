package day5;

public class PreFixSumEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 8, 3, 9, 6, 5, 4 };
		int[] prefix=prefixSum(arr);
		int result = getSum(prefix, 0, 2);
		int result1 = getSum(prefix, 1, 3);
		int result2 = getSum(prefix, 2, 6);
		System.out.println("result : "+result);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}

	private static int getSum(int[] prefix, int l, int r) {
		if(l!=0)
			return prefix[r]-prefix[l-1];
		else
		return prefix[r];
	}

	private static int[] prefixSum(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] prefix_sum = new int[n];
		prefix_sum[0] = arr[0];

		for (int i = 1; i < n; i++) {
			prefix_sum[i] = prefix_sum[i - 1] + arr[i];

		}
		return prefix_sum;
	}
}
