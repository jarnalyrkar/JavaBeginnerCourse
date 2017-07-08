// Program som beregner antall mulige tipperekker
// i et gitt antall kamper

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TippeMuligheter {
	public static void main(String[] args) {
		int antKamper = parseInt(showInputDialog("Vennligst oppgi antall kamper: "));
		showMessageDialog(null, "Antall mulige rekker er: "+(int)Math.pow(3.0, antKamper));
	}
}
