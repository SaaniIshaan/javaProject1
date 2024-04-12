package abstractionExamples;

public class CheckingAccount extends BankAccount {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	 System.out.println("Depositing money in the account");
		 }
	

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Withdrawing money from the account");
	}

}
