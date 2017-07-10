import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordOrganizer {
	public static void main (String[] args) {
		
		// Tar inn tekstfil
		String filename = "thefile.txt";

			Scanner sc;
			try {
				sc = new Scanner(new File(filename));
				
				int shortWord = 0;
				int mediumWord = 0;
				int longWord = 0;
				int totalWords = 0;
				
				while (sc.hasNextLine()) {
					totalWords++;
					String word = sc.next();
					if (word.length() < 6 && word.length() > 0) {
						shortWord++;
					} else if (word.length() < 10) {
						mediumWord++;
					} else longWord++;
				}

				// Prints counted words:
				System.out.println("Total words: " + totalWords);
				System.out.println("Short words: " + shortWord);
				System.out.println("Medium words: " + mediumWord);
				System.out.println("Long words: " + longWord);
				
				// Prints percentage:
				System.out.println("Short words percentage: " + Math.rint(((double)shortWord / totalWords) * 100));
				System.out.println("Medium words percentage: " + Math.rint(((double)mediumWord / totalWords) * 100));
				System.out.println("Long words percentage: " + Math.rint(((double)longWord / totalWords) * 100));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
	}
}
