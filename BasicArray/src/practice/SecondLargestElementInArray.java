package practice;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 27, 19, 27, 17, 04 };
		int secondLargest = getSecondLargest(arr);
		System.out.println(secondLargest);
	}

	private static int getSecondLargest(int[] arr) {
		int indexOfLargest = 0;
		int indexOfSecondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[indexOfLargest] < arr[i]) {
				indexOfSecondLargest = indexOfLargest;
				indexOfLargest = i;

			} else if (arr[i] != arr[indexOfLargest]) {
				if (indexOfSecondLargest == -1 || arr[indexOfSecondLargest] < arr[i])
					indexOfSecondLargest = i;
			}
		}

		return indexOfSecondLargest == -1 ? -1 : arr[indexOfSecondLargest];

	}

}
