package day3;

public class StockBuyANdSellBasic {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 8, 12 };
		int maxProfit = maxProfit(arr, 0, arr.length - 1);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] price, int start, int end) {
		int profit = 0, totalProfit = 0;
		if (end <= start)
			return 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					profit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);

					totalProfit = Math.max(totalProfit, profit);
				}
			}
		}
		return totalProfit;

	}

}
