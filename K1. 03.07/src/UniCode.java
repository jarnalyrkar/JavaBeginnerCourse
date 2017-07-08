//Program som skriver ut tallkode + bokstav hentet fra Unicode-tabellen

public class UniCode {
	public static void main(String[] args) {
		for (int i=32; i< 127;i++) {
		char tegn = (char) i;
		String melding = i + " = " + tegn;
		System.out.println(melding);
		}
	}
}