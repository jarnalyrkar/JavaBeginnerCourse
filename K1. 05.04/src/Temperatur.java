// Program som printer ut alle temperaturene i løpet av en uke.
// Skal oppgi snittet av uken
// Skal oppgi varmeste og kaldeste dager, med temperaturer

public class Temperatur {

	public static void main(String[] args) {
		int[] temp = {27,29,29,32,33,31,18};
		
		// Printer ut alle temperaturene dag for dag
		for (int i = 0; i<temp.length;i++) {
			System.out.println(hvilkenDag(i) + " " + temp[i]);
		}
		
		// Regner ut snittet av uken
		int all = 0;
		for (int i=0;i<temp.length;i++) {
			all += temp[i];
		}
		System.out.println("\nI løpet av uken hadde gradestokken et snitt på "+Math.round(all/temp.length)+" grader\n");
				
		//For å finne minste temperatur og hvilken dag
		int minst = 70;
		int kaldDag = 0;
		for (int i=0;i<temp.length;i++)
			if (temp[i] < minst) {
				minst = temp[i];
				kaldDag = i;
			}
		System.out.println(hvilkenDag(kaldDag)+" hadde kaldest temperatur, på " + minst + " grader");
		
		// For å finne høyeste temperatur, og hvilken dag
		int maks = 0;
		int varmDag = 0;
		for (int i=0;i<temp.length;i++)
			if (temp[i] > maks) {
				maks = temp[i];
				varmDag = i;
			}			
		System.out.println(hvilkenDag(varmDag)+" hadde varmest temperatur på " + maks + " grader");
	}
	
	private static String hvilkenDag(int dag) {
		if (dag==0)
			return ("Mandag");
		else if (dag==1)
			return ("Tirsdag");
		else if (dag==2)
			return ("Onsdag");
		else if (dag==3)
			return ("Torsdag");
		else if (dag==4)
			return ("Fredag");
		else if (dag==5)
			return ("Lørdag");
		else if (dag==6)
			return ("Søndag");
		else return ("Out of bounds");
	}
}