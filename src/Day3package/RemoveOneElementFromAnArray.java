package Day3package;

public class RemoveOneElementFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {10,40,30,80,60,20};
		
		int delete =30; 
		
		for(int i =0;i<a.length; i++)
		{
			if(delete ==a[i])
			{
		    	for(int j =i ;j<a.length -1;j++)
				{
					a[j] =a[j+1];
				}
				break;
			
			} 
		}
		for(int k=0;k<a.length-1;k++)
		
			System.out.println("a[i]"+a[k]);	
		}   
		
}
	
	
	