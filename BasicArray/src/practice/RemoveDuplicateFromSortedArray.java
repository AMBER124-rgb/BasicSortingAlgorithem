package practice;

public class RemoveDuplicateFromSortedArray {

	// Java program to remove duplicates

		// Function to remove duplicate elements
		// This function returns new size of modified
		// array.
		static int removeDuplicates(int arr[], int n)
		{
			if (n == 0 || n == 1)
				return n;
		int res=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1]) {
				arr[res++]=arr[i];
			}
		}
		arr[res++]=arr[n-1];
			
		System.out.println("length = " +res);
			return res;
		}
		
		public static void main (String[] args)
		{
			int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
			int n = arr.length;
			
			n = removeDuplicates(arr, n);

			// Print updated array
			for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
			
		}

		
	}

	

