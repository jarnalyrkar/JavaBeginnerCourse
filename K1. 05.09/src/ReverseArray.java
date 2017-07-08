// Metode som reverserer rekkefølgen av en array
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		int[] tabell = {1,2,3,4,5};
		revTab(tabell);
		System.out.println(Arrays.toString(tabell));
		
	}
	private static int[] revTab(int[] array) {
		
		for (int i=0; i<array.length/2;i++) {
			int temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i - 1] = temp;
		}
			
		return array;
	}
}
