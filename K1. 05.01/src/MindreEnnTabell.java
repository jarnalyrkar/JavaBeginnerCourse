// Program som oppretter tabell, og sjekker
// hvor mange tall i tabellen som er mindre enn
// et gitt tall.

public class MindreEnnTabell {

	public static void main(String[] args) {
		int[] tabell = {3, 5, 9, 7, 4};
		int mindreEnn = 6;
		int counter = 0;
		
		for (int i = 0; i<tabell.length;i++)
			if (tabell[i] < mindreEnn)
				counter++;
		
		System.out.println(counter);
	}

}
