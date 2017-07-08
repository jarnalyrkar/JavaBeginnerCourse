import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;

public class KinoPris {

	public static void main(String[] args) {
		final int MAXPRIS = 110;
		final int MINPRIS = 10;
		
		// Inndata
		String prisTxt = showInputDialog("Fullpris: ");
		double pris = parseDouble(prisTxt);
		String alderTxt = showInputDialog("Alder: ");
		int alder = parseInt(alderTxt);
		
		// Begrensning
		if (pris < MINPRIS) {
			showMessageDialog(null, "For lav pris");
		} else if (pris > MAXPRIS) {
			showMessageDialog(null, "For høy pris");
		} else if (alder <= 5) {// gratis
			pris = 0.0;
			showMessageDialog(null, "Pris: " + pris);
			
		} else if (alder < 12 || alder >= 60) {// halv pris
				pris = pris/2.0;
				showMessageDialog(null, "Pris: " + pris);
		}
		

	}

}
