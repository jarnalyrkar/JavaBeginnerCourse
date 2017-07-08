// Fyller en tabell med samme tall i alle indekser (why?..)
import java.util.*;

public class TulleTabell {
	public static void main(String[] args) {
		int[] a = new int[5];
		fyllTabell(a, 1);
		System.out.println(Arrays.toString(a));
	}
	
	private static int[] fyllTabell(int[] array, int tall) {
		for (int i = 0; i<array.length;i++)
			array[i] = tall;
			return array;
	}
	
}
