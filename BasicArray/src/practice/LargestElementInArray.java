package practice;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,27,19,20,17,04};
		int largest = getLargest(arr);
		System.out.println(largest);
	}

	private static int getLargest(int[] arr) {
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(largest<arr[i]) 
			{
				largest=arr[i];
				;
			}
		}
		return largest;
	}

}
