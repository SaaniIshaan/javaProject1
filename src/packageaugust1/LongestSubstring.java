package packageaugust1;

import java.util.Scanner;

public class LongestSubstring {

	static int LCSubstr(char X[], char Y[], int m, int n) {
		int LCStuff[][] = new int[m + 1][n + 1];
		int result = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					LCStuff[i][j] = 0;
				else if (X[i - 1] == Y[j - 1]) {
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
					result = Integer.max(result, LCStuff[i][j]);
				} else
					LCStuff[i][j] = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence 1");
		String X = sc.nextLine();
		System.out.println("Enter a Sentence 2");
		String Y = sc.nextLine();
		int m = X.length();
		int n = Y.length();
		System.out.println("Length of Longest Common Substring is" + LCSubstr(X.toCharArray(), Y.toCharArray(), m, n));

	}

}
