package day3;

public class RtrappingWaterEfficient {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 2, 5 };
		int trappedWater = getWater(arr);
		System.out.println("Trapped water collected: " + trappedWater);
	}

	private static int getWater(int[] arr) {
		int n = arr.length;
		if (n <= 2) {
			return 0; // Not enough elements to trap water
		}

		int left = 0; // Left pointer
		int right = n - 1; // Right pointer
		int leftMax = 0; // Maximum height from the left
		int rightMax = 0; // Maximum height from the right
		int trappedWater = 0;

		while (left < right) {
			leftMax = Math.max(leftMax, arr[left]);
			rightMax = Math.max(rightMax, arr[right]);

			if (leftMax <= rightMax) {
				trappedWater += leftMax - arr[left];
				left++;
			} else {
				trappedWater += rightMax - arr[right];
				right--;
			}
		}

		return trappedWater;
	}
}
