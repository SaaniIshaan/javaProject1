package Day3package;

public class FactorialbyRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int num = 5;
		long factorial = fact(num);
		System.out.println("factorial("+num+ " )= "+ factorial);

	}
	 public static long fact(int num) {
		long factorial = 1;
		 if (num==1) {
//			 System.out.println("factorial("+num+ ") = 1\n");
			 return factorial;
		 }
		 else
			 System.out.println("factorial("+num+ ") = "+num+ " *factorial(" +(num-1)+ ")" );
			 return factorial = num * fact(num-1);
	 }
*/	 
	 
	/* int age = 7;
	 long factorial = fact(age);
	 System.out.println("factorial(" +age+ ")= " + factorial);
	 }
	 public static long fact(int age) {
		 long factorial = 1;
		 if (age == 1) {
			 System.out.println("factorial ("+age+")= 1/n");
			 return factorial;
		 } 
		 else
			 System.out.println("factorial("+age+ ") = "+age+ " *factorial("+(age-1)+")");
		   	return factorial = age *fact(age-1);
	 
	 } */
	 	
	 int student = 9;
	 long factorial = fact(student);
	 System.out.println("factorial("+student+")=" + factorial);
	}
		public static long fact(int student) {
			long factorial = 1;
			if (student == 1) {
				System.out.println("factorial("+student+")= 1/n");
				return factorial ;
			}
			else
		System.out.println("factorial ("+student+") = "+student+" *factorial("+(student-1)+")");
			return factorial = student *fact(student-1);
			
				
			}
		}
			
	 		
			 

	
	 

