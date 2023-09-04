package day5;

public class MajorityEmelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,8,6,6,6,4,6};
		int majorityElement=majoritElement(arr);
		System.out.println("Majority ELement : " +arr[majorityElement]);
	}

	private static int majoritElement(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=1;j<n;j++)
			{
				if(arr[i]==arr[j])
					count++;
					if(count>n/2)
						return i;
				
			}
		}
		return -1;
	}

}
