package day2;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr= {-3,2,1,4};//{1,4,13,-3,-10,5};
		System.out.println(is0SubArray(arr));
		
	}

	private static boolean is0SubArray(int[] arr) {
		Set<Integer> s = new HashSet<Integer>();
		int prefixSum=0;
		for(int i : arr)
		{
			prefixSum+=i;
			if(s.contains(prefixSum ))
				return true;
			if(prefixSum==0)
				return true;
			s.add(prefixSum);
		}
		return false;
	}

}
