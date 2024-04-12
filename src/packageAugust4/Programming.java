package packageAugust4;

public class Programming {

	public void displayingmessage(String s) {
		
		// check whether variable contain any value
		
		if(s.trim()=="") {
		System.out.println("I love programming languages");
		}
		else {
			System.out.println("I love" +s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programming  pm = new Programming();
		
		pm.displayingmessage(" ");
		pm.displayingmessage(" Java");

	}

}
