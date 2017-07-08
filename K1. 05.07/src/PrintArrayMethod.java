// Metode som printer en array, med v foran, komma bak, og firkantklammer rundt
import java.util.*;
public class PrintArrayMethod {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		printArray(array);

	}
	
	private static void printArray(int[] a) {
		Arrays.toString(a);
		for (int i=0; i<=a.length;i++) {			
			if (i == 5)
				System.out.print("]");
			if (i == 0)
				System.out.print("[");
			
			if (i != 5 && i != a.length) {
			System.out.print("v"+a[i]);
				if (i != a.length-1) {
				System.out.print(", ");
			}
			}					
		}
	}
}
