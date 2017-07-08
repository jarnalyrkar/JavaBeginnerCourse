
public class CentiTommer {

	public static void main(String[] args) {
		int test = 10;
		System.out.println("Centimeter til tommer: "+CentiTomme(test));
		System.out.println("Tommer til centimenter: " +TommeCenti(test));
	}
	
	public static double CentiTomme(double centi) {
		return centi*0.393700787;
	}
	
	public static double TommeCenti(double tomme) {
		return tomme*2.54;
	}
}
