package day3;

public class StockBuyAndSellEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 3, 8, 12 };
		int maxProfit = maxProfit(arr,arr.length);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] price,int n) {
		int profit=0;
		for(int i=1;i<n;i++)
		{
			if(price[i]>price[i-1])
			{
				profit+=(price[i]-price[i-1]);
				
			}
		}
		return profit;
	}

}
