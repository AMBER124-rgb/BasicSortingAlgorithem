package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 50, 10, 40, 10 };
		countfrequency(arr);

	}

	private static void countfrequency(int[] arr) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i : arr)
			h.put(i, h.getOrDefault(i, 0) + 1);
//		for(Entry<Integer, Integer> e : h.entrySet())
//			System.out.println(e.getKey()+" "+e.getValue());
		System.out.println(h);
	}

}
