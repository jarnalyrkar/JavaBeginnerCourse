/* Leksjon 4: Obligatorisk oppgave (Bankinformasjon)
 * Verkt�yklasse med hjelpemetoder til Bank-programmet.
 * NB! Filen lagres i mappen med BankInfo, som: Hjelp.java
 */

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Hjelp {
    // Dagens valutakurs settes utenfor bankprogrammet.
    //      final -> konstant    
    //     static -> brukes uten objekt: Klasse.KONSTANT
  final static double USD_NKR = 8.65; // M� endre verdi
    // Viser aktuelle brukervalg via en tekstkonstant.
  final static String MENY = ("KONKUS BANK" + "\n" +
                                      "------------------------" + "\n" +
                                      "[V]alutaveksling" + "\n" +
                                      "[S]paring" + "\n" +
                                      "[L]�n" + "\n" +
                                      "[A]vslutt"+"\n" +
                                      "------------------------" + "\n" +
                                      "Skriv inn tjenestekode: "
  ); 


  public static double lesInn(String ledetekst) {   
    // Metode som ber om og leser inn en desimalverdi fra 
    // brukeren, presentert ved 'ledetekst' i inndialogvindu.
    double bel�p = parseDouble(showInputDialog(ledetekst));
    return bel�p;
  }

  public static char stor(char tegn) { 
    // Metode som sjekker om 'tegn' er en liten bokstav, og 
    // i s� fall gj�res den om til en stor bokstav. �vrige
    // tegn returneres slik de kom inn.
    
      int valgkode = (int)tegn;
          if (valgkode > 96 && valgkode < 123)
          valgkode = valgkode - 32;
        tegn = (char)valgkode;

    return tegn;
  }

  public static double avrund(double tall) {
    // Metode som avrunder et desimaltall til to siffer 
    // etter komma. Se l�reboka side 58.
    
    
    // double gange = tall*100;
    tall = (int)tall/100.0;
        
    return tall;
  }

}
