package sorting;

import java.util.Arrays;

public class SortingAlgo {

	public static void seletionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void improvedBubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void moreImpBubbleSort(int[] arr) {
		// execute n-1 passes
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapFlag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// compare consecutive elements
				// if left element is greater than right element, then swap them
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapFlag = true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if (!swapFlag)
				break;
		}
	}
	
		
	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++) 
		{
			int j,temp=arr[i];
			for(j=i-1;j>=0 && arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
				
			}
		arr[j+1]=temp;
		System.out.println(Arrays.toString(arr));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 6,4,2,8,3,1 };// [1, 2, 3, 4, 6, 8]
		System.out.println("Before sorting " + Arrays.toString(arr));
		// seletionSort(arr);
		// bubbleSort(arr);
		//improvedBubbleSort(arr);
		insertionSort(arr);
		System.out.println("After sorting " + Arrays.toString(arr));
	}

}
