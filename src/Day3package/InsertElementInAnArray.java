package Day3package;

public class InsertElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[]a = {10,20,30,40,50};
		
		int pos =3;
		int element =100;
		
		for(int i =a.length-1; i>pos-1;i--)
		{
			a[i] = a[i-1];
		}
		a[pos-1] =element;
		
		for(int i =0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);

	}*/
		
		int[]a = {10,20,30,40,50};
		
		int index_pos =3;
		int element =100;
		
		for(int i =a.length-1; i>index_pos;i--)
		{
			a[i] = a[i-1];
		}
		a[index_pos]=element;
		
		for(int i =0; i<a.length; i++)		
		{
			System.out.println(" "+a[i]);
	}
		
		
		
		
		
		
		
		
		
		

	}
}