package Day3package;

public class LinearSearch {
	

/*	public static int LinSearch(int[]arr, int key) {
		for(int i = 0; i< arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
				return -1;
			}
	
	public static void main(String a[]) {
		int[]a1 = {20,30,45,58,66,74,89,95};
		int key = 74;
		System.out.println(key+" is found at index: "+ LinSearch( a1,key));
	}
*/
	
	
	public static int LinSearch(int [] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i]== key) {
				return i;
				
			}
		}
		return -1;
	
	}
	public static void main(String a[]) {
		int[]a1 = {5,10,24,51,23,45};
		int key = 23;
		System.out.println("key+ is found at index: "+ LinSearch(a1, key));
		
	}
}	
		 
	



	


