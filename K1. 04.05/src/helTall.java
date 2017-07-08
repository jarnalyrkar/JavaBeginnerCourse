import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class helTall {
	public static void main(String[] args) {
		System.out.println(lesHeltall(1, 100));
		
	}
	
	private static int lesHeltall(int min, int max) {
		int inn;
		inn = parseInt(showInputDialog("Gi heltall: "));
		
		while (inn < min || inn > max) {
			inn = parseInt(showInputDialog("Du må oppgi tall mellom "+ min + " og " + max));
		}
		return inn;
	}
}