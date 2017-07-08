// Program som bytter om verdien på tre variabler på en sirkulær måte
//  y får x verdi, z får verdien til y og x får verdien til z
public class SirkelTall {
	public static void main(String[] args) {
		
		int x = 1; // skal være 3
		int y = 2; // skal være 1
		int z = 3; // skal være 2
		
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
