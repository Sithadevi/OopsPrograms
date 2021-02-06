package assignment3;

class SavingsAccount{
		double balance;
		double interest;
		public char[] getBalance;
		public SavingsAccount(double balance, double interest) 
		{
			super();
			this.balance = balance;
			this.interest = interest;
		}
		void withdraw(int amount)
		{
			balance=balance-amount;
		}
		void deposit(int amount)
		{
			balance=balance+amount;
		}
		/*void addInterest(){
			double inter=balance*(interest/100);
			balance+=inter;*/
		
		public double getInterest() {
			double inter=balance*(interest/100);
			balance+=inter;
			return balance;
		}
		public double getBalance() {
			return balance;
		}
	
}
		
class TestBankApp {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(2000.00, 4.0);
		sa.deposit(500);
		System.out.println("The updated account balance after deposit amount is:"+sa.getBalance());
		sa.withdraw(200);
		System.out.println("The update account balance after withdraw is:"+sa.getBalance());;
	}
	

}
