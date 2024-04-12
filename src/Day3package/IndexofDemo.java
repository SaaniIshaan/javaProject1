package Day3package;

public class IndexofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//indexOf() method returns index of a particular character.
		//indexOf()	returns-1 when the character is not present in the string
		//int indexOf(char ch)
		
		String str = "Hello World";
		System.out.println("Index of W =" +str.indexOf("W"));   //as it counts space  as a digit
		
		
	//	String str ="Hello People";
	System.out.println("Index of P ="+str.indexOf('P'))	;
		
	
		
	}
}
