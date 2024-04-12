package packageaugust1;

import java.util.Scanner;

public class LongestCommonSubstring1 {

	static int LCSubstr(char X[],char Y[],int m, int n) 
	{
		int result[] = new int [m];
		int k = 0;
		int max = 0;
		int counter = 0;
		int j = 0;
		for (int i =0; i<m; i++) {
			System.out.println(+i+" " +j+ " " +k);
			for(j =0; j<n; j++) {
	//			System.out.println(+j);
				if(X[i] == Y[j]) {
					counter = counter + 1;
					j=i;
				} 
				else {
					result[k] = counter;
					if ( k >=1) max = Integer.max(result[k-1],result[k]);
//					System.out.println(+i+" " +j+ " " +k);
//					k = k +1;
				}
			} 
			j = 0;
		}
		return max;
				
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
		
		System.out.println(
				"Length of Longest Common Substring is"
				+LCSubstr(X.toCharArray(),Y.toCharArray(),m,n));
				
	}
	
}
