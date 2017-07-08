// Program som beregner areal av sirkel.
// mottar radius fra bruker.

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class SirkAreal {
	public static void main(String[] args) {
		double radius = parseDouble(showInputDialog("Vennligst oppgi radius av sirkelen: "));
		showMessageDialog(null, "Arealet av sirkelen er: "+ round((PI*radius*radius)*100)/100);
	}

}
