package Day4package;

public class StringKMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome";
		String s1 = "to my home";
		
		System.out.println(s.length());  // length of the string
		
		System.out.println(s.concat(s1));  //joining of the string
		
		s ="   welcome   ";
		System.out.println(s); 
		
		// trimming the string
		
		System.out.println("Before trimming string is:" +s);
		System.out.println("After trimming string is:" + s.trim());
		
		// charAt()
		s = "welcome";
		System.out.println(s.charAt(4));  // index starts from the 0
		
		s = "welcome";
		System.out.println(s.contains("wel")); 
		System.out.println(s.contains("Wel")); 
		System.out.println(s.contains("com")); 

		//comparing string equals()

		s = "Welcome";
		
		System.out.println(s.equals("welcome")); // false
		System.out.println(s.equals("Welcome")); // true
		System.out.println(s.equals("Wel come")); //false
		
		System.out.println(s.equalsIgnoreCase("welcome"));	//true
		
		//replacing characters
		s = "welcome to java";
		System.out.println(s.replace('o', 'i')); //welcome ti java
		System.out.println(s.replace("java","selenium"));
		
		s = "Helloworld";
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(3,6));
		
		s = "welcome";
		System.out.println(s.toUpperCase());
		
		s = "WELCOME";
		System.out.println(s.toLowerCase());
		
		
		
	}

}
