package Day3package;

public class BubbleSort {  
	

      static void bubbleSort (int[] arr) {
            int n = arr.length;
			int temp = 0;
			 for (int i=0;i < n; i++) {
			 for (int j = 1; j<(n-i); j++) {
			 if (arr[j-1] > arr[j]){
				 temp = (arr[j-1]);
				 (arr[j-1]) = (arr[j]);
				 (arr[j]) = temp;
			 }
			 }
		 }
		}

	public static void main(String[]arg) {
		int arr[] = {5,3,4,8,6};
		System.out.println("Array before bubble sort");
		
		for (int i =0; i< arr.length ; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		bubbleSort(arr);
		System.out.println("/n array after bubblesort");
		
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		
		}
	}
		
	}
	
	
	
			 
			 
					 	
					 
		




	
	
	