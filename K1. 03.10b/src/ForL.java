
public class ForL {

	public static void main(String[] args) {
		final int MAX = 4;
		
		for (int i=1; i<MAX;i++) {
			System.out.print("X");
			System.out.println();
			if (i==MAX-1)
				for (int j=0; j<MAX;j++)
					System.out.print("X ");
			}
		//for (int j=1; j<MAX+1;j++)
		//	System.out.print("X ");
	}
}
