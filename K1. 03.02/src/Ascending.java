// Program som sorterer tre tall gitt av bruker, i stigende rekkefølge.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Ascending {
	public static void main(String[] args) {
		// inndata
		int a = parseInt(showInputDialog("Jeg skal sortere tre tall.\nOppgi det første: "));
		int b = parseInt(showInputDialog("Skriv inn tall nummer to: "));
		int c = parseInt(showInputDialog("Skriv inn tall nummer tre: "));
		
		int min = 0;
		int med = 0;
		int max = 0;
		
		// beregning
		if (a < b && a < c) {
			if (b < c) {
				min = a;
				med = b;
				max = c;
			} else {
				min = a;
				med = c;
				max = b;
			}
		}
		
		if (b < a && b < c) {
			if (a < c){
				min = b;
				med = a;
				max = c;				
			} else {
				min = b;
				med = c;
				max = a;
			}
		}
		
		if (c < a && c < b) {
			if (a < b) {
				min = c;
				med = a;
				max = b;
			} else {
				min = c;
				med = b;
				max = a;
			}
		}
		
		// utdata
		showMessageDialog(null, "Tallene i stigende rekkefølge:\n"+min+", "+med+", "+max);
	}
}