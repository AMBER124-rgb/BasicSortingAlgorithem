package day7;

import java.util.Arrays;

public class LeftmostRepeatingMoreEff {

	static final int SIZE = 256;
	
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int index = leftMost(s);
		if(index!=-1)
		System.out.println("LeftMost Repeating Character is : "+ s.charAt(index));
		else
			System.out.println("Non repeating characters are present");
	}

	private static int leftMost(String s) {
		int[] fIndex = new int[SIZE];
		int index=Integer.MAX_VALUE;
		Arrays.fill(fIndex, -1);
		
		for(int i=0;i<s.length();i++)
		{
			int currIndex = fIndex[s.charAt(i)];
			if(currIndex==-1)
				fIndex[s.charAt(i)]=i;
			else
				index=Math.min(index, currIndex);
		}
		return (index==Integer.MAX_VALUE)?-1:index;
	}

}
