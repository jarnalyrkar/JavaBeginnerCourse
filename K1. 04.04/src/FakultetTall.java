//Metode som multipliserer en tallrekke på samme måte som fibonacci.

public class FakultetTall {

	public static void main(String[] args) {
		System.out.println(fakultet(4));
	}
	
	public static int fakultet(int max) {
		int sum = 1;
		// Tallet i er konsekvent - 1, 2, 3, 4 osv.
		// Tall1 endrer seg etter gangestykket - 1 2 6 24
		
		for (int i = 1; i<=max;i++){
			sum = (i*sum);
			}
		
		return sum;
	}

}
