
public class Booter {

	public static void main(String[] args) {
		Account konto1 = new Account(1234, 2500);
		Account konto2 = new Account(4321, 1800);
		Account konto3 = new Account(2341, 500);
	
		konto1.deposit(200);
		System.out.println(konto1.getBalance());
		
		konto2.withdraw(400);
		System.out.println(konto2.getBalance());
		
		konto3.deposit(1000);
		konto3.withdraw(50);
		System.out.println(konto3.getBalance());
	}

}
