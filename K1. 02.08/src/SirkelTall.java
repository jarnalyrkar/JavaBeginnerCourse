// Program som bytter om verdien p� tre variabler p� en sirkul�r m�te
//  y f�r x verdi, z f�r verdien til y og x f�r verdien til z
public class SirkelTall {
	public static void main(String[] args) {
		
		int x = 1; // skal v�re 3
		int y = 2; // skal v�re 1
		int z = 3; // skal v�re 2
		
		System.out.println("X: " + x + "\nY: " + y + "\nZ: " + z);
		System.out.println();
		z = z+y;
		y = z-y;
		z = z-y;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("X: " + x + "\nY: " + y + "\nZ: " + z);
	}
}
