// Program som skriver ut summen av to tall.
// Tallene blir gitt som input av bruker

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Sum {
	public static void main(String[] args) {
	int num1 = parseInt(showInputDialog("Vennligst oppgi et tall: "));
	int num2 = parseInt(showInputDialog("Vennligst oppgi tallet du vil legge til: "));
	int sum = num1+num2;
	
	showMessageDialog(null, num1 + " + " + num2 + " = " + sum);
	}
}
