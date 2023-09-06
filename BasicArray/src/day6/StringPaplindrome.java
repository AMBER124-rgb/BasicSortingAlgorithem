package day6;

public class StringPaplindrome {

	public static void main(String[] args) {
		String str = "ABCDCBA";

	//	System.out.println(isPalindrome(str));
		System.out.println(isPalindromeEff(str));
		
	}

	private static boolean isPalindromeEff(String str) {
		int n = str.length();
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i)!=str.charAt(n-i-1))
				return false;
			
		}
		return true;
	}

	private static boolean isPalindrome(String str) {
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();

		return str.equals(rev.toString());

	}

}
