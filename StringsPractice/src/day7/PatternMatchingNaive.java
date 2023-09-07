package day7;

public class PatternMatchingNaive {

	public static void main(String[] args) {
		String str = "ABCEABEFABCD";// "ABCABCD"; // "AAAAA";
		String pattern = "ABCD"; // "ABC"; // "AAA";
		// patternSearch(str, pattern);
		patternSearchImproved(str, pattern);
	}

	private static void patternSearchImproved(String str, String pattern) {
		int n = str.length();
		int m = pattern.length();
		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++)
				if (str.charAt(i + j) != pattern.charAt(j))
					break;
			if (j == m)
				System.out.println(i + " ");
			if (j == 0)
				i++;
			else
				i = i + j;
		}

	}

	private static void patternSearch(String str, String pattern) {
		int n = str.length();
		int m = pattern.length();
		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (str.charAt(i + j) != pattern.charAt(j))
					break;
			}
			if (j == m)
				System.out.print(i + " ");
		}

	}

}
