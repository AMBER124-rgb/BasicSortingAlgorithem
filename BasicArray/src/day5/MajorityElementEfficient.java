package day5;

public class MajorityElementEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,8,6,6,6,4,6};
		int majorityElement=majoritElement(arr);
		System.out.println("Majority ELement : " + arr[majorityElement]);
	
	}

	private static int majoritElement(int[] arr) {
		int n = arr.length,res=0,count=1;
		for(int i=1;i<n;i++)
		{
			if(arr[res]==arr[i])
				count++;
			else
				count--;
			if(count==0)
			{
				res=i;
				count=1;
			}
		}
		count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[res]==arr[j])
				count++;
		}
		if(count>n/2)
			return res;
		
		return -1;
	}

}
