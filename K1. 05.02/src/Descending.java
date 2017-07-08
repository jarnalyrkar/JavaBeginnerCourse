// Program som oppretter en tabell, 
// og skriver ut tallene i fallende rekkefølge
public class Descending {

	public static void main(String[] args) {
		int[] tabell = {1,2,3,4,5,6,7,8,9};
			
		for (int i = tabell.length-1; i>=0 ;i--) {
			System.out.println(tabell[i]);
		}
	}
}
