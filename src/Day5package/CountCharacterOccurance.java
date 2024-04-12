package Day5package;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Programing Java oops";
		
		int totalcount = s.length();   //total len  5
		
	int totalcount_afterremove = s.replace("a","").length();   //total length after removing a
	int count = totalcount - totalcount_afterremove;
		
		System.out.println("Number occurance of a is:" +count);
		
	}

}
