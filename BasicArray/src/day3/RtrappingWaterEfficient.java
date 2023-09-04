package day3;

public class RtrappingWaterEfficient {

	public static void main(String args[]) {
		int[] arr = { 7, 0, 1, 2, 5 };
		int tappedWater = getWater(arr);
		System.out.println("Tapped water collected : " + tappedWater);
	}

	private static int getWater(int[] arr) {
		int n=arr.length,waterTapped=0;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0]=arr[0];
		rmax[n-1]=arr[n-1];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1], arr[i]);
		}
		for(int j=n-2;j>=0;j--)
		{
			rmax[j]=Math.max(rmax[j+1],arr[j]);
		}
		for(int i=1;i<n-1;i++)
		{
			waterTapped+=(Math.min(rmax[i], lmax[i])-arr[i]);
		}
		return waterTapped;
	}

//	private static int getWater(int[] arr) {
//		int n=arr.length,waterTapped=0,lMax=arr[0];
//		
//		for(int i=1;i<n;i++) 
//		{
//		waterTapped +=	Math.min(lMax, arr[i]);
//		}
//		return waterTapped;
//	}
	
	
}
