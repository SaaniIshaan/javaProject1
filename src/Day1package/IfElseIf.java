package Day1package;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //  if(){
 //	} else if() {
 //	} else if() {
 // } else {
 //	}
		
	//	marks < 33 fail
	//	33 - 75  pass
	//	75 - 100 distinction
		
		int marks = 35;
		if(marks < 33) { 
		 System.out.println("Failed");
		} else if (marks >= 33 && marks < 75) {
			System.out.println("Passed");
		} else if(marks >=75 && marks < 100) {
			System.out.println("Passed");
		} else {
			System.out.println("provide valid marks");
		}
		}
		
	}


