	package practice;
	
	public class MaxDifferenece {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {232,3,127,6,421,8,1};
			int maxDiff = maxDiff(arr);
			System.out.println(maxDiff);
		}
	
		private static int maxDiff(int[] arr) {
			int n=arr.length;int res=Integer.MIN_VALUE;
			
			//Time Complexicity:n*n
//			for(int i=0;i<n;i++) 
//			{
//				for(int j=i+1;j<n;j++)
//				{
//					
//					res=res>(arr[j]-arr[i])?res:(arr[j]-arr[i]);
//				}
//			}
			
		
			
			//Efficient Algorithem
			int minVal=arr[0];
			for(int j=1;j<n;j++)
			{
				res=res>(arr[j]-minVal)?res:(arr[j]-minVal);
				minVal=minVal>arr[j]?arr[j]:minVal;
			}
			return res;
		}
	}
