// Program som regner ut tverrsummen av opptil fire siffer
// 
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Tverrsum {
	public static void main(String[] args) {
		int num = parseInt(showInputDialog("Vennligst oppgi et firesifret tall: "));
		if ( num > 999 && num < 10000 ) {
			int num1 = num%10;
			int num2 = num%100/10;
			int num3 = num%1000/100;
			int num4 = num/1000;
			
			showMessageDialog(null, "Tverrsummen av " + num + " er " + (num1+num2+num3+num4) + 
					"\n              (" + num4 + " + " + num3 + " + " + num2 + " + " + num1 + ")" );
		}
			
	}

}
