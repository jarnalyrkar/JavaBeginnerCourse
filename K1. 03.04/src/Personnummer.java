// Program som bestemmer kjønn utifra personnummer.
public class Personnummer {

	public static void main(String[] args) {
		int pnr = 12345;
		int sex = pnr%1000/100;
		
		if (sex%2 == 1)
			System.out.println("Mann");
		else System.out.println("Kvinne");
	}
}