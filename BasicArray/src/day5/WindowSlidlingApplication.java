package day5;

public class WindowSlidlingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 30, -5, 20, 7 };
		
		System.out.println(windowSliding(arr, 33));
	}

	private static boolean windowSliding(int[] arr, int givenSum) {
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int currSum=0;
			for(int j=i;j<n;j++)
			{
				currSum+=arr[j];
				if(currSum==givenSum)
					return true;
			}
		}
		return false;
	}

}
