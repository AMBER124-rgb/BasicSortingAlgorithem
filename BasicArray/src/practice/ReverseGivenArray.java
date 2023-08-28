package practice;

import java.sql.Array;

public class ReverseGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 27, 19, 20, 17, 04 };
		reverseArray(arr);

	}

	private static void reverseArray(int[] a) {

		int top = a.length - 1, bottom = 0, temp;
		while (bottom < top) {
			temp = a[bottom];
			a[bottom] = a[top];
			a[top] = temp;
			bottom++;
			top--;
		}
		System.out.print("Reversed array is: ");

		for (int k : a) {
			System.out.print(k + " ");
		}

	}

}
