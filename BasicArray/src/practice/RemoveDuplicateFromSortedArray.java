package practice;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] sortedArray = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5 };

		int length = removeDuplicates(sortedArray);

		System.out.print("Array with duplicates removed: ");
		for (int i = 0; i < length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int removeDuplicates(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}

		int resultIndex = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[resultIndex++] = arr[i];

			}
		}

		return resultIndex;
	}
}
