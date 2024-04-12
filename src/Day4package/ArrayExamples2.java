package Day4package;

/*public class ArrayExamples2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,4,8,6};
		double sum = 0;
		int n = arr.length;
		for(int i =0 ; i<n; i++) {
			sum = sum + arr[i];
			System.out.println("sum of array =" +sum);	
		}
		double avg = sum /n ;
		System.out.println("final sum of array =" +sum);
		System.out.println("averge of the array =" +avg);
	}

}
*/
public class ArrayExamples2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/*	String[] arr = {"Mansi", "Monika", "Mona", "manu", "Meow", "4"};		
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);	
			if (arr[i]== "Mona") {
				System.out.println("Found the right string: " + arr[i]);		
			}
		}
*/		
			int[]arr = {10,20,30,40,50};
			for(int i = 0; i<arr.length; i++) {
				//System.out.println(arr[i]);
				if(arr[i]==30) {
					System.out.println(+arr[i]);
				}
			} 
	
	
	}
}