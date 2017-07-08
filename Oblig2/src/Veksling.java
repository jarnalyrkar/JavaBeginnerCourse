/*	Obligatorisk oppgave #2
*	Løst av Joachim Strøm (151709) 	
*	Programmet skal ta inn et beløp i USD og veksle til NOK
* 	for deretter å skrive ut kvittering med spesifiserte valører.
*/

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Veksling {
	public static void main(String[] args) {

	// Oppsett av konstant
	double usdKurs = 8.68; // Sist endret 27. Jan. 2016

	// Innlesing av tall
	String infoBox = showInputDialog("Oppgi USD i heltall: ");

	// Parse inntekst
	double vekselSum = parseDouble(infoBox);

	// Utregning
	double veksel = vekselSum * usdKurs;
	int total = (int)veksel;

	// Bruker x som hjelpevariabel til å holde på hvor mye som er "igjen" av totalsummen
	int ant1000kr = total/1000;
	int x = total - (ant1000kr*1000);
	int ant500kr = x/500;
	x = x - (ant500kr*500);
	int ant200kr = x/200;
	x = x - (ant200kr*200);
	int ant100kr = x/100;
	x = x - (ant100kr*100);
	int ant50kr = x/50;
	x = x - (ant50kr*50);
	int ant20kr = x/20;
	x = x - (ant20kr*20);
	int ant10kr = x/10;
	x = x - (ant10kr*10);
	int ant5kr = x/5;
	x = x - (ant5kr*5);
	int ant1kr = x/1;
	x = x - (ant1kr*1);
	
	// Utskrift til skjerm
	showMessageDialog(null, "Valutakalk" + "\n" + 
					"---------------------------------" + "\n" + 
					"For " + (int)vekselSum + " USD" + "\n" + 
					"får du " + total + " NOK" + "\n" + 
					"---------------------------------" + "\n" +
					"Antall 1000kr: " + "   " + ant1000kr + "\n" +
					"Antall 500kr: " + "     " + ant500kr + "\n" +
					"Antall 200kr: " + "     " + ant200kr + "\n" +
					"Antall 100kr: " + "     " + ant100kr + "\n" +
					"Antall 50kr: " + "       " + ant50kr + "\n" +
					"Antall 20kr: " + "       " + ant20kr + "\n" + 
					"Antall 10kr: " + "       " + ant10kr + "\n" + 
					"Antall 5kr: " + "         " + ant5kr + "\n" + 
					"Antall 1kr: " + "         " + ant1kr + "\n" + 
					"--------------------------------");
	}

}