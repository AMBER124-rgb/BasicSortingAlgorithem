package day7;

public class ReverseWordInAString {

	public static void main(String[] args) {
		String str = "Welcome To CDAC Acts";
		char[]  c = str.toCharArray();
		reverseWords(c);
		String s = new String(c);
		System.out.println(s);
	}

	private static void reverseWords(char[] c) {
	int start = 0;
		for(int end=0;end<c.length;end++) 
		{
			if(c[end]==' ')
			{
				reverse(c,start,end-1);
				start=end+1;
			}
		}
		reverse(c,start,c.length-1);
		reverse(c,0,c.length-1);
	}

	private static void reverse(char[] c, int low, int high) {
		char temp;
		while(low<=high) 
		{
		temp=c[low];
		c[low]=c[high];
		c[high]=temp;
		low++;
		high--;
		}
		
	}

}
