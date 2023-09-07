package day7;

public class LeftmostRepeatingOptimised {

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
		
		boolean[] visited=new boolean[SIZE];
		int index=-1;
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			if(visited[s.charAt(i)])
				index=i;
			else
				visited[s.charAt(i)]=true;
		}
		return index;
	}

}
