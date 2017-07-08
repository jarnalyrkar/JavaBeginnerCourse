import static javax.swing.JOptionPane.*;
public class AccountsBoot {
	
	public static void main(String[] args) {
		
		final int QTY_ACCOUNTS = 10;
		
	// Opprette array:
		final Accounts[] accountTab = new Accounts[QTY_ACCOUNTS];
				
		
	// Opprette kontoer
		for (int i = 0; i<QTY_ACCOUNTS;i++) {
			accountTab[i] = new Accounts(0.0);
		}
		
		tilStreng(accountTab);
		boolean run = true;
		
		while (run) {
			int accountNum = 0;
		while (accountNum < 1 || accountNum > QTY_ACCOUNTS) {
			accountNum = Integer.parseInt(showInputDialog("Enter account number:"));
		}
			double editBalance = Integer.parseInt(showInputDialog("Enter positive number for "
					+ "deposit, negative number for withdrawal: "));
			
			accountTab[accountNum-1].setBalance(editBalance);
			tilStreng(accountTab);
			String answer = "";
			answer = showInputDialog("Do you wish to continue? (Y/N)");
			answer = answer.toUpperCase();
			char[] aLetter = answer.toCharArray();
			
			if (aLetter[0] == 'N')
				run = false;			
		}
	}

	private static void tilStreng(Accounts[] a) {
		String strengen = "Information about accounts: \n";
		for (int i=0; i<a.length;i++) {
			strengen += "Account number: " + a[i].getAccountNumber() + ", " + 
						"Balance: " + a[i].getBalance() + "\n";
		}
		showMessageDialog(null, strengen);	
				
	}
}