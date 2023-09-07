package day7;

public class LeftmostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		int index = leftMost(s);
		if(index!=-1)
		System.out.println("LeftMost Repeating Character is : "+ s.charAt(index));
		else
			System.out.println("Non repeating characters are present");
	}

	private static int leftMost(String s) {
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					return i;
			}
		}
		return -1;
	}

}
