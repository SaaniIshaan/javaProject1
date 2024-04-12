package Day1package;

public class IntDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i = 0;
    
   // i++; // i = i+1;
   // i++; // 2;
   // i--; // 1 = i-1;
     
     System.out.println(i++);  // post increment
     System.out.println(i);
     
     System.out.println(++i); // pre increment
     
     System.out.println(i--); //post decrement
     System.out.println(i);
     
     System.out.println(--i);  //pre decrement
     
     
     for(i = 0; i < 5; i++) {
    	System.out.println(i);
    	
    
     int j = 5;
     for(j = 5; j > 1; j--) {
    	 System.out.println(j);
     }
     }
     
   
	}

}
