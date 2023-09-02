package practice;

public class LeftRotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		//leftRotate(arr);
		leftRotateBetter(arr,2);
		System.out.println("Array after left rotation : ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
		
		
	}

	private static void leftRotateBetter(int[] arr, int d) {
		int n=arr.length;
		int[] temp = new int[d];
		for(int i=0;i<d;i++)
			temp[i]=arr[i];
		
		for(int j=d;j<n;j++)
			arr[j-d]=arr[j];
		
		for(int k=0;k<d;k++)
			arr[n-d+k]=temp[k];
		
	}

	

//	private static void leftRotate(int[] arr) {
//		int l=arr[0],n=arr.length;
//		for(int i=1;i<n;i++)
//		{
//			arr[i-1]=arr[i];
//		}
//		arr[n-1]=l;
//		
//	}
	

}
