package practice;

public class LeaderInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 10, 4, 8, 3, 2 };
		leaderOfArray(arr);
	}

	private static void leaderOfArray(int[] arr) {

		int n = arr.length;
//		for(int i=0;i<n;i++)
//		{
//			boolean flag=false;
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]<arr[j]) 
//				{
//					flag=true;
//					break;
//				}
//			}
//			if(flag==false)
//				System.out.print(arr[i]+" ");
//		}
		int leader = arr[n - 1];
		System.out.println(leader);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				System.out.println(arr[i]);
				leader = arr[i];
			}

		}

	}

}
