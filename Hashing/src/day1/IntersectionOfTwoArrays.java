package day1;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 15, 20, 15, 30, 30, 5 };
		int[] b = { 30, 5, 30, 80 };
		int m = a.length, n = b.length;
		intersection(a, b, m, n);
		intersectionHash(a,b,m,n);
		// System.out.println(freq);
	}

	private static void intersectionHash(int[] a, int[] b, int m, int n) {
		Set<Integer> s = new HashSet<>();
		for (int i : a) {
			s.add(i);
		}
		System.out.println(s);
		
		int freq=0;
		for(int j : b) {
			if(s.contains(j))
			{
				freq++;
				s.remove(j);
			}
		}
		System.out.println(freq);
	}
	

	private static void intersection(int[] a, int[] b, int m, int n) {
		int freq = 0;
		for (int i = 0; i < m; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				continue;
			}

			for (int j = 0; j < n; j++) {
				if (a[i] == b[j]) {
					freq++;
					break;
				}
			}
			
		}
		System.out.println(freq);
		// return freq;
	}

}
