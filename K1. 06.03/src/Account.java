
public class Account {
	//Object variables
	int accountnumber;
	int balance;
	
	//Constructor
	public Account (int accountnumber, int balance){
		this.accountnumber = accountnumber;
		this.balance = balance;
	}

	public void deposit(int add) {
		setBalance(balance += add);
	}
	
	public void withdraw(int add) {
		setBalance(balance += add);
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//Object methods
	
}


