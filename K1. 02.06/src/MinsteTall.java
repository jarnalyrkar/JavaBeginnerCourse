// Program som finner det minste av fire siffer, oppgitt av bruker

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class MinsteTall {
	public static void main(String[] args) {
		
		// Inndata
		int num = parseInt(showInputDialog("Oppgi fire siffer [f.eks 1234]:  "));
		
		// You shall not pass!
		while (num > 9999 || num < 1000) {
			num = parseInt(showInputDialog("Prøv igjen; fire siffer på formen [1234]: "));
		}
		
		// Utregning
		int num1 = num%10;
		int num2 = num%100/10;
		int num3 = num%1000/100;
		int num4 = num/1000;
		
		// Utdata
		showMessageDialog(null, "Det minste tallet er: " + (Math.min(num1, Math.min(num2, Math.min(num3, num4)))));
	}
}
