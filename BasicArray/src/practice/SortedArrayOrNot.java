package practice;

public class SortedArrayOrNot {

	public static void main(String[] args) {

		int[] arr = { 23, 27, 29, 37, 47, 54 };
		System.out.println(isSorted(arr));
	}

	private static boolean isSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}

}
