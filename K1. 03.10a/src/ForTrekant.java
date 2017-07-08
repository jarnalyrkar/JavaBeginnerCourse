public class ForTrekant {
	public static void main(String[] args) {
		final int MAX = 4;
		
		for (int i = 1;i<MAX+1;i++) {
			System.out.print("X");
			for (int j = 1;j<i;j++)
				System.out.print("X");
				System.out.println();
		}
	}
}
