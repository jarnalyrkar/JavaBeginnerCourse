// Program som oppgir vekselvalører utifra sum.
// Flest mulig store valører.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Veksel {
	public static void main(String[] args) {
		
		// inndata
		int vekselsum = parseInt(showInputDialog("Vennligst oppgi et vekselbeløp: "));
		int curSum = vekselsum;
		
		// Omregning
		int ant1000kr = vekselsum/1000;
		curSum -= (ant1000kr*1000);
		int ant500kr = curSum/500;
		curSum -= (ant500kr*500);
		int ant200kr = curSum/200;
		curSum -= (ant200kr*200);
		int ant100kr = curSum/100;
		curSum -= (ant100kr*100);
		int ant50kr = curSum/50;
		curSum -= (ant50kr*50);
		int ant20kr = curSum/20;
		curSum -= (ant20kr*20);
		int ant10kr = curSum/10;
		curSum -= (ant10kr*10);
		int ant5kr = curSum/5;
		curSum -= (ant5kr*5);
		int ant1kr = curSum/1;
		curSum -= ant1kr;
				
		// utdata
		System.out.println(curSum);
		showMessageDialog(null, "Vekselbeløp: " + vekselsum + "\n" +
								"<--------------------------------------->\n" +
								"    Valør:                          Antall:\n" +
								"    1000-lapper:.................." + ant1000kr+ "\n" +
								"    500-lapper:...................." + ant500kr+ "\n" +
								"    200-lapper:...................." + ant200kr+ "\n" +
								"    100-lapper:...................." + ant100kr+ "\n" +
								"    50-lapper:......................" + ant50kr+ "\n" +
								"    20kr................................." + ant20kr+ "\n" +
								"    10kr................................." + ant10kr+ "\n" +
								"    5kr..................................." + ant5kr+ "\n" +
								"    1kr..................................." + ant1kr+ "\n" +
								"<--------------------------------------->\n" + 
								"          Ha en trivelig dag!");
		
	}

}
