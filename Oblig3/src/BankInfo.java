/* Leksjon 4: Obligatorisk oppgave (Bankinformasjon) 
 * Programmet bruker verktøyklassen 'Hjelp' som inneholder relevante
 * metoder (innlesing, avrunding) og konstanter (kurs og meny). 
 * NB! Filen lagres i mappen sammen med Hjelp, som: BankInfo.java
 */ 

// Import av nødvendige bibliotekressurser 
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class BankInfo {

  public static void main(String[] args) {

    // Variabel for programgjentak
    boolean fortsett = true;
    do {
      // Leser inn ønsket info-tjeneste fra en meny
      char bokstav = showInputDialog(Hjelp.MENY).charAt(0);
      char valg = Hjelp.stor(bokstav);
      System.out.println(valg);
      if (valg == 'A')
        fortsett = false;
      else 
        switch ( valg ) {
          case 'V': veksling(); break;
          case 'S': sparing(); break;
          case 'L': låning(); break;
          default : feilmelding(); break;
        }
    } while ( fortsett );
    
  } // slutt på main-metoden


  /* Hjelpemetode for å gi info om valutaveksling fra et beløp
   * i USdollar til norske kroner ved en fastsatt valutakurs.
   */
  private static void veksling() {    
    // Les inn et dollarbeløp via kall på hjelpe-metode. 
	  double dollar = Hjelp.lesInn("Oppgi et dollarbeløp, mellom 5 og 1000");
	  double vekselSum;
    // Hvis lovlig beløp
	  if (dollar >= 5 && dollar <= 1000) {
	       // beregn beløp i norske kroner
		  	vekselSum = dollar*Hjelp.USD_NKR;
	       // skriv ut beløpene avrundet til 2 siffer etter komma
	       Hjelp.avrund(vekselSum);
		  	// skriv ut vekslingskursen		  
		  showMessageDialog(null, "VEKSLING" + "\n" +
				  			"------------------------" + "\n" +
				  			"Beløp i USD: " + dollar + "\n" + 
				  			"Kurs: 1 USD = " + Hjelp.USD_NKR + "\n" +
				  			"Beløp i NOK: " + vekselSum + "\n" +
				  			"------------------------"
				  			
				  );
		    // Skriv feilmelding ved ulovlig beløp
		  } else showMessageDialog(null, "Ugyldig beløp, prøv igjen");
  }

  /* Hjelpemetode for å gi info om sparing med ett innskud som
   * følges over et gitt antall år til en gitt årsrente (%).
   */
  private static void sparing() {     
    // Les inn via kall på hjelpe-metode: et sparebeløp, en årsrente 
    // og et antall år i spareperioden.
	  double sparebeløp = Hjelp.lesInn("Vennligst oppgi et sparebeløp [1-50000]: ");
      double årsrente = Hjelp.lesInn("Vennligst oppgi ønsket årsrente [1-10]: " + "\n"
    		  						+ "(Obs, benytt punktum[.] som skilletegn ved desimaler)");
      double år = Hjelp.lesInn("Vennligst oppgi antall år [1-30]: ");
      int antår = (int)år;
      double saldo = sparebeløp;
      double prosent = (årsrente/100);
   // skriv ut (kvitter) de aktuelle inndataene
      String kvittering = ("SPARING\n" + 
				"------------------\n" +
			"Sparebeløp:" + sparebeløp + "\n" +
			"årlig rente: " + årsrente + " %\n" +
			"Antall år: " + antår + "\n" +
			"-------------------\n" +
			"år   Rente   Saldo" + "\n");
         
    // Hvis lovlige inndata
   
   // skriv ut år, renter og saldo
  	if (sparebeløp >= 1.00 && sparebeløp <= 50000.00 && 
    	årsrente >= 1.0 && årsrente <= 10.0 &&
    	antår >= 1 && antår <= 30) {
  	// beregn år for år: påløpt rente og ny saldo (økt beløp)
  	// hvis fÃ¦rre enn eller lik 10 år
  		for (int i = 1; i<=antår; i++) {
    	 	prosent = (årsrente/100)*saldo;
    	 	saldo = saldo+prosent;
    	 	if (i<=10)
    	 	kvittering += (i +") " + Hjelp.avrund(prosent*100)
    	 	+ "  " + Hjelp.avrund(saldo*100) + "\n");	
    	 	};
    	 
    	 // Etter beregningene skrives sluttsaldo ut hvis år er over 10
    	 	if (antår >10)
    	 		kvittering += ("------------------\n" + 
    	 					"Saldo etter "+ antår + " år: " + Hjelp.avrund(saldo*100));
    	 	
    	 	showMessageDialog(null, kvittering + "\n");
        
    // Skriv feilmelding ved ulovlige inndata
  } else showMessageDialog(null, "Ugyldig(e) valg, prøv igjen");
  }  

  /* Hjelpemetode for å gi info om annuitetslån, dvs. et fast årlig 
   * beløp for å betale et lån til en gitt rente over et antall år. 
   */
  private static void låning() {     
    // Les inn via kall på hjelpe-metode: et lånebeløp, en årsrente  
    // og et antall år for nedbetalingsperioden.
	  double låneBeløp = Hjelp.lesInn("Vennligst oppgi et lånebeløp: \n[10'000-15'000'000]");
	  double rente = Hjelp.lesInn("Vennligst oppgi en rente [1-20]: \nVed desimaler, benytt punktum [.]")/100;
	  double låneår = Hjelp.lesInn("Vennligst oppgi antall år [1-30]: ");
    // Hvis lovlige inndata:
	  if (låneBeløp >= 10000 && låneBeløp <= 15000000.00 &&
			  rente > 0.0 && rente <= 20.0 &&
			  låneår >= 1 && låneår <=30) {
       // skriv ut (kvitter) de aktuelle inndataene
	  String kvitto = ("LåN" + "\n" +
			  			"----------------------" + "\n" +
			  			"Lånebeløp: " + låneBeløp + "\n" +
			  			"årlig rente: " + rente*100 + "%" + "\n" +
			  			"Antall år: " + låneår + " år" + "\n" +
			  			"----------------------" + "\n"			
			  );
	  	// beregn årlig betaling (nettsøk: formel for annuitetslån)
       //  bruk matematiske metoder (Math) til regnearbeidet
	  double fv = låneBeløp*Math.pow((1 + rente), låneår);
	  double årligBetaling = (fv * rente) / (pow((1 + rente), låneår) - 1); 
			  
       // skriv ut årlig betaling
	  // Obs: Når jeg avrunder denne får jeg galt svar, så jeg lot heller vÃ¦re.
	  kvitto += "årlig betaling: " + Hjelp.avrund(årligBetaling)*100;
	  showMessageDialog(null, kvitto);
	  } else {
    // Skriv feilmelding ved ulovlige inndata
			  showMessageDialog(null, "Ugyldig(e) verdier, prøv igjen!");
	  }
  }

  /* Hjelpemetode for å gi en standard feilmelding i situasjonene
   * som er aktuelle i dette programmet. 
   */ 
  private static void feilmelding() {  
    showMessageDialog(null, "Brukerfeil.");
  }  

}