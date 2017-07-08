// Regner snitt av en array og sier hvilken bokstavkarakter snittet tilsvarer

public class Karakterer {
	public static void main(String[] args) {
		int[] karakter = new int[6];
		karakter[0] = 70;
		karakter[1] = 69;
		karakter[2] = 68;
		karakter[3] = 67;
		karakter[4] = 66;
		karakter[5] = 65;
		
		int[] karakterrekke = {4,4,4,4,4,3,3,3,5,5,5,1,1,1,3,3,3,3,4,4,4,4,2,2,1,1,2,2,2,2};
		int snitt = 0;
		for (int i=0; i<karakterrekke.length;i++) {
			snitt += karakterrekke[i];
		}
		
		int snittTall = (int)(Math.round(1.0*snitt/karakterrekke.length)+65);
		char snittBokstav = (char)snittTall;
		
		System.out.println("Snittet er " + snitt + " / " + karakterrekke.length + " = " 
		+ Math.round(1.0*snitt/karakterrekke.length)+ " som tilsvarer karakterbokstaven "+ snittBokstav);
	}
}