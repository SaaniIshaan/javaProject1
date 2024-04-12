package optionalAssignment;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,9,2,5,3,7,101,18};
		int n =a.length;
		
		longestincreasingsubsequence(a,n);
	}

	private static void longestincreasingsubsequence(int[] a, int n) {
		// TODO Auto-generated method stub
		int[] a1 = {10,9,2,5,3,7,101,18};
		for(int i =0; i<n ; i++)	{
			System.out.println(a[i]+ " ");
			int count = 1;
			int temp = a[i];  //it checks with the previous bigger number
			
			for(int j = i+1; j<n; j++) {
				if(temp < a[j]);{  //a[i]<a[j] && temp<a[j]
				temp = a[j];
				System.out.println(a[j]+" ");
				count++;
				}
			}
			System.out.println("Length of increasing subsequence is :" +count);
			System.out.println();
		}
	}

}
