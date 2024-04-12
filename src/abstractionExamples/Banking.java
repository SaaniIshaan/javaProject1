package abstractionExamples;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount aoj = new SavingsAccount();
		
		aoj.calculateInterest();
		aoj.deposit();
		aoj.withdraw();
		
		CheckingAccount boj = new CheckingAccount();
		boj.deposit();
		boj.withdraw();
	}
	

}
