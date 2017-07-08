 
public class metoder {

	public static void main(String[] args) {
		// Test av metoder
		
		System.out.println("er bokstav: "+isLetter('r'));
		System.out.println("er vokal: "+isVocal('o'));
		System.out.println("er stor: "+isUppercase('S'));
	}

	//metode som avgjør om et tegn er en bokstav, eller ikke
	private static boolean isLetter(char test) {
		int bokstav = (int)test;
		if (bokstav <123 && bokstav > 96 || bokstav < 91 && bokstav > 64)
			return true;
		else return false;
	}
	
	//metode som avjgør om bokstaven er en vokal eller ikke
	private static boolean isVocal(char test) {
		int bokstav = (int)test;
		if (bokstav == 65 || bokstav == 69 || bokstav == 73 || bokstav == 79 ||	bokstav == 85 ||
			bokstav == 97 || bokstav == 101 || bokstav == 105 || bokstav == 111 || bokstav == 117 )
			return true;
		else return false;
	}
	//metode som avgjør om bokstaven er uppercase eller ikke
	private static boolean isUppercase(char test) {
		int bokstav = (int)test;
		if (bokstav <91 && bokstav > 64)
			return true;
		else return false;
	}
}
