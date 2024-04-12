package Day4package;

public class ReverseEachWordInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		//Approach 1
		
		String str = "Welcome To Java and Selenium";			//Original String
		
		String[] words=str.split("  ");    //Splitting string into words
		
		String reverseString="";
		
		for(String w:words)
		{
			String reverseword="";
			
			for(int i =w.length()-1;i>=0;i--)		//Welcome
			{
			 reverseword=reverseword+w.charAt(i);
			 }
			
			reverseString = reverseString+reverseword+"  ";  //emoclew ot avaj
		}
			System.out.println(reverseString); 
			
			//Approach 2
		
	/*	String str = "Welcome To Java";
		String[] words=str.split("\\s");
		
		String reverseword ="";
		
		for(String w:words)  //Java
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();		//avaJ
			
			reverseword=reverseword+sb.toString()+"  ";  //emoclew ot avaJ
		}
		System.out.println(reverseword); */
		
		
	
		
		
		
		
		
	}
}