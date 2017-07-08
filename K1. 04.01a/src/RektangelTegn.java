// Program som benytter en metode for å skrive ut en figur
public class RektangelTegn {

	public static void skrivTegn(int x, int y) {
		for (int i=1;i<=x;i++) {
			System.out.print("*");
			for (int j=1;j<=y;j++)
			System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		skrivTegn(3, 4);

	}

}
