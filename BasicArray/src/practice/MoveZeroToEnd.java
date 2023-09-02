package practice;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,8,0,0,12,0};
		 moveZero(arr);
		 System.out.println("Array after pushing zeros to the back: ");
	        for (int i=0; i<arr.length; i++)
	            System.out.print(arr[i]+" ");
	    }
	

	private static void moveZero(int[] arr) {
		int count=0;
		//for every non zero element, we increment the count
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length)
			arr[count++]=0;
	}

}
