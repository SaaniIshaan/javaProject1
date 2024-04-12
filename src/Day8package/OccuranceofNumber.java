package Day8package;

public class OccuranceofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] a = {1,3,23,45,4,3,23};
			
			int totalcount = a.length;
			int numberofoccurance = 0;
			int num = 23;
			
			for (int i=0; i<a.length; i++){
				if (a[i]==num) {
					numberofoccurance = numberofoccurance +1;
				}
					
			}
		
			

			
			System.out.println("number occurance of " +num+ " is:" +numberofoccurance);
	}

}
