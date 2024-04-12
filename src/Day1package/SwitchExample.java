package Day1package;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Declaring a variable for switch expression
		
		int student = 5;
		String studentString;
		//switch statements with int data type
		switch(student) {
			case 1:
			studentString ="Ishaan";
			break;
			
			case 2:
		    studentString =" Saani";
		    break;
		    
			case 3:
			studentString ="Saatvik";
			break;
			
			case 4:
			studentString ="Adam";
			break;
			
			case 5:
			studentString ="Mustafa";
			break;
			
			case 6:
			studentString ="Ryan";
			break;
			
			default:
			studentString ="Invalid Student";
		}
		System.out.println("The student is:" +studentString);
					
	
	}

}
 