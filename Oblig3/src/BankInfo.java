/* Leksjon 4: Obligatorisk oppgave (Bankinformasjon) 
 * Programmet bruker verkt�yklassen 'Hjelp' som inneholder relevante
 * metoder (innlesing, avrunding) og konstanter (kurs og meny). 
 * NB! Filen lagres i mappen sammen med Hjelp, som: BankInfo.java
 */ 

// Import av n�dvendige bibliotekressurser 
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class BankInfo {

  public static void main(String[] args) {

    // Variabel for programgjentak
    boolean fortsett = true;
    do {
      // Leser inn �nsket info-tjeneste fra en meny
      char bokstav = showInputDialog(Hjelp.MENY).charAt(0);
      char valg = Hjelp.stor(bokstav);
      System.out.println(valg);
      if (valg == 'A')
        fortsett = false;
      else 
        switch ( valg ) {
          case 'V': veksling(); break;
          case 'S': sparing(); break;
          case 'L': l�ning(); break;
          default : feilmelding(); break;
        }
    } while ( fortsett );
    
  } // slutt p� main-metoden


  /* Hjelpemetode for � gi info om valutaveksling fra et bel�p
   * i USdollar til norske kroner ved en fastsatt valutakurs.
   */
  private static void veksling() {    
    // Les inn et dollarbel�p via kall p� hjelpe-metode. 
	  double dollar = Hjelp.lesInn("Oppgi et dollarbel�p, mellom 5 og 1000");
	  double vekselSum;
    // Hvis lovlig bel�p
	  if (dollar >= 5 && dollar <= 1000) {
	       // beregn bel�p i norske kroner
		  	vekselSum = dollar*Hjelp.USD_NKR;
	       // skriv ut bel�pene avrundet til 2 siffer etter komma
	       Hjelp.avrund(vekselSum);
		  	// skriv ut vekslingskursen		  
		  showMessageDialog(null, "VEKSLING" + "\n" +
				  			"------------------------" + "\n" +
				  			"Bel�p i USD: " + dollar + "\n" + 
				  			"Kurs: 1 USD = " + Hjelp.USD_NKR + "\n" +
				  			"Bel�p i NOK: " + vekselSum + "\n" +
				  			"------------------------"
				  			
				  );
		    // Skriv feilmelding ved ulovlig bel�p
		  } else showMessageDialog(null, "Ugyldig bel�p, pr�v igjen");
  }

  /* Hjelpemetode for � gi info om sparing med ett innskud som
   * f�lges over et gitt antall �r til en gitt �rsrente (%).
   */
  private static void sparing() {     
    // Les inn via kall p� hjelpe-metode: et sparebel�p, en �rsrente 
    // og et antall �r i spareperioden.
	  double sparebel�p = Hjelp.lesInn("Vennligst oppgi et sparebel�p [1-50000]: ");
      double �rsrente = Hjelp.lesInn("Vennligst oppgi �nsket �rsrente [1-10]: " + "\n"
    		  						+ "(Obs, benytt punktum[.] som skilletegn ved desimaler)");
      double �r = Hjelp.lesInn("Vennligst oppgi antall �r [1-30]: ");
      int ant�r = (int)�r;
      double saldo = sparebel�p;
      double prosent = (�rsrente/100);
   // skriv ut (kvitter) de aktuelle inndataene
      String kvittering = ("SPARING\n" + 
				"------------------\n" +
			"Sparebel�p:" + sparebel�p + "\n" +
			"�rlig rente: " + �rsrente + " %\n" +
			"Antall �r: " + ant�r + "\n" +
			"-------------------\n" +
			"�r   Rente   Saldo" + "\n");
         
    // Hvis lovlige inndata
   
   // skriv ut �r, renter og saldo
  	if (sparebel�p >= 1.00 && sparebel�p <= 50000.00 && 
    	�rsrente >= 1.0 && �rsrente <= 10.0 &&
    	ant�r >= 1 && ant�r <= 30) {
  	// beregn �r for �r: p�l�pt rente og ny saldo (�kt bel�p)
  	// hvis færre enn eller lik 10 �r
  		for (int i = 1; i<=ant�r; i++) {
    	 	prosent = (�rsrente/100)*saldo;
    	 	saldo = saldo+prosent;
    	 	if (i<=10)
    	 	kvittering += (i +") " + Hjelp.avrund(prosent*100)
    	 	+ "  " + Hjelp.avrund(saldo*100) + "\n");	
    	 	};
    	 
    	 // Etter beregningene skrives sluttsaldo ut hvis �r er over 10
    	 	if (ant�r >10)
    	 		kvittering += ("------------------\n" + 
    	 					"Saldo etter "+ ant�r + " �r: " + Hjelp.avrund(saldo*100));
    	 	
    	 	showMessageDialog(null, kvittering + "\n");
        
    // Skriv feilmelding ved ulovlige inndata
  } else showMessageDialog(null, "Ugyldig(e) valg, pr�v igjen");
  }  

  /* Hjelpemetode for � gi info om annuitetsl�n, dvs. et fast �rlig 
   * bel�p for � betale et l�n til en gitt rente over et antall �r. 
   */
  private static void l�ning() {     
    // Les inn via kall p� hjelpe-metode: et l�nebel�p, en �rsrente  
    // og et antall �r for nedbetalingsperioden.
	  double l�neBel�p = Hjelp.lesInn("Vennligst oppgi et l�nebel�p: \n[10'000-15'000'000]");
	  double rente = Hjelp.lesInn("Vennligst oppgi en rente [1-20]: \nVed desimaler, benytt punktum [.]")/100;
	  double l�ne�r = Hjelp.lesInn("Vennligst oppgi antall �r [1-30]: ");
    // Hvis lovlige inndata:
	  if (l�neBel�p >= 10000 && l�neBel�p <= 15000000.00 &&
			  rente > 0.0 && rente <= 20.0 &&
			  l�ne�r >= 1 && l�ne�r <=30) {
       // skriv ut (kvitter) de aktuelle inndataene
	  String kvitto = ("L�N" + "\n" +
			  			"----------------------" + "\n" +
			  			"L�nebel�p: " + l�neBel�p + "\n" +
			  			"�rlig rente: " + rente*100 + "%" + "\n" +
			  			"Antall �r: " + l�ne�r + " �r" + "\n" +
			  			"----------------------" + "\n"			
			  );
	  	// beregn �rlig betaling (netts�k: formel for annuitetsl�n)
       //  bruk matematiske metoder (Math) til regnearbeidet
	  double fv = l�neBel�p*Math.pow((1 + rente), l�ne�r);
	  double �rligBetaling = (fv * rente) / (pow((1 + rente), l�ne�r) - 1); 
			  
       // skriv ut �rlig betaling
	  // Obs: N�r jeg avrunder denne f�r jeg galt svar, s� jeg lot heller være.
	  kvitto += "�rlig betaling: " + Hjelp.avrund(�rligBetaling)*100;
	  showMessageDialog(null, kvitto);
	  } else {
    // Skriv feilmelding ved ulovlige inndata
			  showMessageDialog(null, "Ugyldig(e) verdier, pr�v igjen!");
	  }
  }

  /* Hjelpemetode for � gi en standard feilmelding i situasjonene
   * som er aktuelle i dette programmet. 
   */ 
  private static void feilmelding() {  
    showMessageDialog(null, "Brukerfeil.");
  }  

}