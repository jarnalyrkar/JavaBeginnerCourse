// Program som tester metode for å legge sammen alle tallene fra x til y

public class LoopSum {

	public static void main(String[] args) {
		System.out.println(loopSum(2,6));
	}

	//Metode som summerer en tallserie via en for-loop
	private static int loopSum(int min, int max) {
		int svar = 0;
		for (int i = min; i <=max;i++) {
			svar += i;
		}
		return svar;
	}
	
}
