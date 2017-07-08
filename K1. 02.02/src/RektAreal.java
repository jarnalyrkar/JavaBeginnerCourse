// Program som beregner arealet av et rektangel.
// Leser inn bredde og lengde fra bruker.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class RektAreal {
	public static void main(String[] args) {
		int bredde = parseInt(showInputDialog("Vennligst oppgi arealets bredde: "));
		int lengde = parseInt(showInputDialog("Vennligst oppgi arealets lengde: "));
		
		showMessageDialog(null, "Rektangelets areal er: " + ((bredde*2)+(lengde*2)));

	}

}
