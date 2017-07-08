import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		// eksempeldata
		int[] arrayA = {1,3,5,7,9};
		int[] arrayB = {2,4,6,8,10};
		int[] collect = samle(arrayA, arrayB);

		System.out.println(Arrays.toString(collect));
		
	}
	// Metoden:
	public static int[] samle(int[] tabA, int[] tabB) {
		int nyLengde = tabA.length + tabB.length;
		int[] nyTab = new int[nyLengde];
		for (int i=0; i<tabA.length;i++) {
			nyTab[i] = tabA[i];
		}
		for (int j=0; j<tabB.length; j++) {
			nyTab[tabA.length+j] = tabB[j];
		}
		// Sortering
		Arrays.sort(nyTab);
		
		return nyTab;
		
	}
	
}
