package abstractionExamples;

public class SavingsAccount extends BankAccount implements Interest {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("Checking the savings in the Account");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		 System.out.println("Withdrawing money from the saving account");
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
		System.out.println("Calculating Interest per month");
	}

}
