// This class draws a square, and gives information about
// areal, circumference, diagonal and whether it can be made
// by adding two other squares together
public class Square {
	//Object-variables
	int side;
	
	//Constructor
	public Square(int side) {
		this.side = side;
	}
	
	//Object-Methods
	//These already have access to "side"; do NOT use paramaters.
	public void draw() {
		for (int i=0; i<side;i++) {
			for (int j=0; j<side;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public int areal() {
		return (side*side);
	}
	
	public int circumference() {
		return (4*side);
	}
	
	public double diagonal() {
		return Math.sqrt(2)*side;
	}
	
	public boolean sum(Square a, Square b) {
		return areal() == (a.areal()+b.areal());
	}

}