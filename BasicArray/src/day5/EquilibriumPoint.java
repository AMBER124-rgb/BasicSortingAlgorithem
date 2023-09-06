package day5;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 8, -9, 20, 6 };
		System.out.println(isEquilibrium(arr));
	}

	private static boolean isEquilibrium(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int lSum = 0, rSum = 0;
			for (int j = 0; j < i; j++) {
				lSum += arr[j];
				System.out.print(lSum+"-------------");
			}
			for (int k = i + 1; k < n; k++) {
				rSum += arr[k];
				System.out.println(rSum);
			}
			if (lSum == rSum)
				return true;
		}

		return false;
	}

}
