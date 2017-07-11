import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileWordCount {

	public static void main(String[] args) {
		
		// Ta inn tekstfil
		String filename = "test.txt";
		int[] countTab = new int[11];
		
		try {
			Scanner sc = new Scanner(new File(filename));
			int i = 1;
			while (sc.hasNext()) {
				String content = sc.next();
				
				// Regex for å fjerne ",", "." og " ": "( |\\.|,)+"
				if (!Pattern.matches("( |\\.|,)+", content)) {					
					// Tell ordlengde på hvert ord
					while (content.length() == i) {
						// Legg tellingen på respektive arrayplasser (lengde 1 = countTab[1])
						countTab[i]++;
					}					
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
