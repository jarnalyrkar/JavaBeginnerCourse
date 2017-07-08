/* Leksjon 5: Obligatorisk oppgave, FlySete (teatersal, kinosal, eller 
 * andre steder der folk sitter altfor tett ihop)
 * 151709 - JSE
 * Program som setter opp kolonner og rader (nummerert og bokstavert).
 * Booker tilfeldig plasser som opptatt, eller ledig, og printer ut resultat
 * Reklame medfølger, som forventet i lignende tjenester på nett.
 */

public class FlySete {
	// Her settes final-valører - disse bestemmer hvor stor tabellen blir.
	final static int RAD = 15 + 1; // +1 her, for at trekktall skal funke best
	final static int KOL = 15 + 1; // Samme som over.
	// Første rad settes som 0
	public static int telleRad = 0;
	// Første kolonnebokstav settes til 'A' (eller unicode 65 om du vil)
	public static int telleKol = 65;
	public static int row, col;
	public static char[][] kart = new char[RAD][KOL];
	public static char opptatt = 'X';
	// Ikke spør..
	public static String trademark = "\u2122";

	public static void main(String[] args) {
		for (int i = 0; i < RAD; i++) {
			for (int j = 0; j < KOL; j++) {
				kart[i][j] = ' ';
			}
		}
		// Tilfeldigfiserer hva som er booket og hva som er ledig
		for (int i = 0; i < kart.length * 4; i++) {
			row = (int)(Math.random() * RAD - 1) + 1;
			col = (int)(Math.random() * KOL - 1) + 1;
			kart[row][col] = opptatt;
		}
		// Kjører metoden printkart
		PrintKart();

		// Obligatorisk reklame
		System.out.println("\nToday's delightful booking system" + "\nwas brought to you by THOMPSONS TEETH" + trademark
				+ "\n" + "- The only teeth strong enough to eat other teeth!");
	}

	// Metode for å printe kartet
	public static void PrintKart() {
		System.out.print("   ");
		for (int k = 0; k < KOL - 1; k++)
			System.out.print("   " + (char) (telleKol++));
		for (int i = 0; i < 9; i++) {
			System.out.println();
			// For de ni første tallene (ett-sifrede tall)
			for (int j = 0; j < KOL; j++) {
				if (j == 0) {
					System.out.print((telleRad++) + 1);
					System.out.print(kart[i][j] + "  | ");
				} else {
					System.out.print(kart[i][j] + " | ");
				}
			}
		}
		// For de resterende tallene (to-sifrede tall)
		for (int i = 10; i < RAD; i++) {
			System.out.println();
			for (int j = 0; j < KOL; j++) {
				if (j == 0) {
					System.out.print((telleRad++) + 1);
					System.out.print(kart[i][j] + " | ");
				} else {
					System.out.print(kart[i][j] + " | ");
				}
			}
		}
		// Linje etter tabellen, for det ser fint ut.
		System.out.println();
	}

}
