// Fletter to tabeller og sorterer
import java.util.Arrays;
public class FletteTabell {
	public static void main(String[] args) {
		int[] tabell1 = {1,3,5,7,9};
		int[] tabell2 = {2,4,6,8,10,12,14};
		int lengde = tabell1.length+tabell2.length;
		int[] nytabell = new int[lengde];
				
		for (int i=0; i<tabell1.length;i++) {
			nytabell[i] = tabell1[i];
		}
		
		int k = tabell1.length;
		for (int j = 0; j<tabell2.length;j++) {
			nytabell[k] = tabell2[j];
			k++;
		}
		Arrays.sort(nytabell);
		System.out.println(Arrays.toString(nytabell));
	}
}

