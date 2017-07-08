// Program som deler et tall på et annet. 
// Sjekker at ingen av tallene er null.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.String.*;

public class Deling {

	public static void main(String[] args) {
		double a = parseInt(showInputDialog("Vennligst oppgi et tall: "));
		double b = parseInt(showInputDialog("Vennligst oppgi neste tall: "));
		
		if (a == 0 || b == 0)
			showMessageDialog(null, "Du kan ikke dele på null.");
		else
			showMessageDialog(null, a + " / " + b + " = " + format("%.2f", a/b));
	}
}
