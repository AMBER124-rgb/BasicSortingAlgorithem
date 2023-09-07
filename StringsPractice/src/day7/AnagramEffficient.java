package day7;

public class AnagramEffficient {

	public static void main(String[] args) {
		String s1 = "abaac";
		String s2 = "aacba";
		System.out.println("The String is Anagram : "+isAnagramByFrequency(s1,s2));

	}

	private static boolean isAnagramByFrequency(String s1, String s2) {
		final int SIZE = 256;
		
		if(s1.length()!=s2.length())
		return false;

	int[] c = new int[256];

	for(int i=0;i<s1.length();i++) 
	{
		c[s1.charAt(i)]++;
		c[s2.charAt(i)]--;
	}
	
	for(int i=0;i<SIZE;i++) {
	if(c[i]!=0)
		return false;
		}
	return true;
	}

}
