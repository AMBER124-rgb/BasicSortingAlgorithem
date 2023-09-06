package day6;

public class EquilibriumPointEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 8, -9, 20, 26 };
		System.out.println(isEquilibrium(arr));
	}

	private static boolean isEquilibrium(int[] arr) {
		int n = arr.length, totalSum = 0, lSum = 0;

		for (int i = 0; i < n; i++) {
			totalSum += arr[i];
		}

		for (int k = 0; k < n; k++) {
			if (lSum == (totalSum - arr[k]))
				return true;
			lSum += arr[k];
			totalSum -= arr[k];
		}
		return false;
	}
}
