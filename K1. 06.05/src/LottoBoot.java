public class LottoBoot {

	public static void main(String[] args) {
		Lotto rekke1 = new Lotto();
		Lotto rekke2 = new Lotto();
		
		do {
			rekke2 = new Lotto();
		} while (rekke1.equals(rekke2));
			
		String strengen = "Rekke 1: " + rekke1.toString() + "\n" + 
						  "Rekke 2: " + rekke2.toString();
		
		System.out.println(strengen);
	
	}

}
