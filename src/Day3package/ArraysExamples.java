package Day3package;

public class ArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a[]	= new int [5];
		for (int i =0; i<5; i++) {
			a [i] = i;
		}
		System.out.println("Elements of the array");
		
		for ( int j =0; j<5; j++) {
			System.out.println("a[" +j+ "] =" + a[j]);
			
		}*/
		
		int b[][] = {{10,20,30} , {30,20,10}};
		int c[][] = {{30,20,10} , {10,20,30}};
		int d[][] = new int [2][3];
		  
		System.out.println("array- B:");
		for (int i = 0; i<2 ;i++) {
			for (int j = 0; j<3; j++) {
				
			System.out.print("  " +b[i][j]);
			}
			System.out.println();
		} 
		System.out.println();
		
		System.out.println("array-c:");
		for (int i =0; i<2 ; i++) {
			for (int j =0;j<3; j++) {
				
				System.out.print("  " +c[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Sum of the two array B and C is array D");
		
		for (int i = 0;i<2; i++) {
			for (int j=0;j<3;j++) 
			{
				d[i][j] = b[i][j] + c[i][j];
			System.out.print("  " +d[i][j]);
			}
			System.out.println();
		}
			}
		
		
		
		
	}


