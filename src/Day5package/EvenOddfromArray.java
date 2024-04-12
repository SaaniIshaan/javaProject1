package Day5package;

public class EvenOddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[] = {1,2,3,4,5,6,7,8,9};
        
        //Extracting even numbers.......
        
       System.out.println("Even numbers in an Array");
        
      for(int i = 0; i<a.length; i++)	
       {
    	  if(a[i]%2==0)
    		  
        System.out.println(a[i]);
       }
    
       
    /*    // Enhanced for loop
        
        for(int value:a)
        {
        	if(value % 2 ==0)
        
        		System.out.println(value);		2 4 6 8 
        }
        
        
        
        System.out.println("Odd numbers in an array");
			for(int i = 0; i<a.length; i++)		//9
{
				if(a[i]%2 !=0)
				System.out.println(a[i]);		1 3 5 7 9
	}	
				//Enhanced for loop
			
			for( int value:a)
			{
				if(value %2 != 0)
					System.out.println(value);		1 3 5 7 9
			}*/
			
			System.out.println("Odd numbers in an Array");
			
			for(int i = 0; i<a.length; i++) {
				if (a[i]%2!=0)
			System.out.println(a[i]);

 			}
		}		
	}			
	        		
