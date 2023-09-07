package day7;

public class LeftmostRepeatingCharEfficient {

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
		
		int[] c = new int[SIZE];
		
		for(int i=0;i<s.length();i++)
			c[s.charAt(i)]++;
		
		for(int i=0;i<s.length();i++)
			if(c[s.charAt(i)]>1)
				return i;
		return -1;
	}

}
