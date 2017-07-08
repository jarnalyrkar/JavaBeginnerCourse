// Program som gjør om 3 inndatatall til en sammensatt dato

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class DatoHeltall {
	public static void main(String[] args) {
		int date = parseInt(showInputDialog("Oppgi dato [1-31]: "));
		while (date > 32 || date < 0)
			date = parseInt(showInputDialog("Ugyldig dato, prøv igjen [1-31]: "));
		
		int mnth = parseInt(showInputDialog("Oppgi måned [1-12]: "));
		while (mnth > 13 || mnth < 0)
			mnth = parseInt(showInputDialog("Ugyldig måned, prøv igjen [1-12]: "));
		
		int year = parseInt(showInputDialog("Oppgi årstall [1910-2016]: "));
		while (year > 2017 || year < 1910)
			year = parseInt(showInputDialog("Ugyldig årstall, prøv igjen [1910-2017]: "));
								
		showMessageDialog(null, "Datoen du oppga var: "+date+"."+mnth+"."+year);
	}
}
