package day3;

public class TrappingRainWaterBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 0, 1, 2, 5 };
		int tappedWater = getWater(arr);
		System.out.println("Tapped water collected : " + tappedWater);
	}

	private static int getWater(int[] arr) {
		int n = arr.length, waterTap = 0;
		for (int i = 0; i < n -1; i++) {
			int lmax = arr[i];
			for (int j = 0; j < i; j++) {
				lmax = Math.max(lmax, arr[j]);
			}

			int rmax = 0;
			for (int k =i+ 1; k < n; k++) {
				rmax = Math.max(rmax, arr[k]);
			}

			waterTap += (Math.min(lmax, rmax) - arr[i]);
			System.out.println(waterTap);
		}
		return waterTap;
	}

}
