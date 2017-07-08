// Program som benytter en metode for å skrive ut en trekant
public class TrekantTegn {
	public static void main(String[] args) {
		skrivTegn(5);
	}
	
	public static void skrivTegn(int x) {
		for (int i=0;i<x;i++) {
			System.out.print("*");
				for (int j=0;j<i;j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
