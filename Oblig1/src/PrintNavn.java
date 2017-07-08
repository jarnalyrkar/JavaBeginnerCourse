/* 	Obligatorisk oppgave #1
* 	Løst av Joachim Strøm (151709)
* 	Programmet skriver dagens dato (fra user input)
* 	skriver mine initialer som ASCII-art, 
*	og skriver et dialogvindu om at obligen er levert.
*/ 	
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class PrintNavn {

	public static void main(String[] args) {	
		String Date = showInputDialog("Dagens dato: ");
		showMessageDialog(null, "Oblig 1 er levert " + Date);

		out.print("***********    *****");
		out.print("\n" + "     *        *     *");
		out.print("\n" + "     *       *       *");
		out.print("\n" + "     *        *");
		out.print("\n" + "     *          *");
		out.print("\n" + "  *******         *");
		out.print("\n" + "     *              *");
		out.print("\n" + "     *       *        *");
		out.print("\n" + "*    *        *       *");
		out.print("\n" + "*    *         *     *");
		out.print("\n" + " ****           * * *" + "\n");
		}
	}