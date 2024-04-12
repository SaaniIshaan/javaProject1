package Day1package;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i = 0;
   
   while(i<10) {
   System.out.println("i" +i);
   i++;
   }
   
   i = 11;
   while(i<10) {
	   System.out.println("check" +i);
	   i++;
   } 
	   
	   int j =0;
	   
	   do {System.out.println("test " +j);
	   j++;}
	   while(j<10);
	   
	   j = 11; 
	   do { 
		   System.out.println(j);
		   j++;
	   }
       while(j<10);
   
 }

}
