// Program som veksler USD til NOK.
// F�r USD gitt av bruker.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class UsdNok {
	public static void main(String[] args) {
		final double USD = 8.3139;
		int amount = parseInt(showInputDialog("Hvor mange USD �nsker du?"));
		showMessageDialog(null, amount + " USD tilsvarer "+ (amount*USD) + " NOK.");
	}
}
