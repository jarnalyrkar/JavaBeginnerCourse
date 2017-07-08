// Program som sjekker om en string-array inneholder et palindrom
import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		char[] tabell = {'m','a','d','a','r'};
		char[] revTab = Arrays.copyOf(tabell, tabell.length);
		
		revTab(revTab);
		
		if (Arrays.equals(tabell, revTab)) {
			System.out.println("Palindrom");
		} else System.out.println("Ikke et palindrom");
		
		
	}

	private static char[] revTab(char[] array) {
		for (int i=0; i<array.length/2;i++) {
			char temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
	
}
