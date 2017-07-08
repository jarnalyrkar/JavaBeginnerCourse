public class Accounts {
	private static int quantity;
	
	private int accountNumber;
	private double balance;
	
	
	public Accounts(Double startBalance) {
		accountNumber = ++quantity;
		balance = startBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int newAccountNumber) {
		accountNumber = newAccountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double editBalance) {
		balance += editBalance;
	}
}