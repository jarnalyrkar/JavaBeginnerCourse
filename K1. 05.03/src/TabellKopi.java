// Program som sjekker hvor mange tall som er på lik posisjon i begge tabellene
import java.util.Arrays;

public class TabellKopi {

	public static void main(String[] args) {
		int[] tabell = {5,2,3,9,1,6,7,8,9};
		int[] tabellKopi = Arrays.copyOf(tabell, tabell.length);
		Arrays.sort(tabellKopi);
		System.out.println(Arrays.toString(tabellKopi));
		System.out.println(Arrays.toString(tabell));
		
		int counter=0;
		for (int i=0;i<tabell.length;i++) {
			if (tabell[i] == tabellKopi[i])
				counter++;
		}
		System.out.println(counter);
	}
}
