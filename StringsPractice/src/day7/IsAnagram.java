package day7;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abaac";
		String s2 = "aacba";
		System.out.println("The String is Anagram : "+isAnagram(s1,s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		System.out.println(s1.length()); 
		System.out.println(s2.length());
		if(s1.length()!=s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		s1=String.valueOf(c1);
		System.out.println(s1);
		
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		s2=String.valueOf(c2);
		System.out.println(s2);
		
		return s1.equals(s2);
	}

	

}
