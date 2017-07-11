/**
 *  Takes in a textfile, counts the length of each word, and adds it to an array.
 *  Index 0 in the array holds any letters with 12 or more letters, the rest is
 *  indexed according to length of the word (so index 1 = one letter words)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileWordCount {

	public static void main(String[] args) {
		String filename = "test.txt";
		int[] countTab = new int[12];
		try {
			Scanner sc = new Scanner(new File(filename));
			while (sc.hasNext()) {
				String content = sc.next();
				System.out.println(content);	
				
				if (!Pattern.matches("( |\\.|,)+", content)) {					
				// I would much prefer having this whole bit as a loop,
				// and not hardcoded pr line, but i couldn't figure it out.
					if (content.length() == 1) {
						countTab[1]++;
					} else if (content.length() == 2) {
						countTab[2]++;
					} else if (content.length() == 3) {
						countTab[3]++;
					} else if (content.length() == 4) {
						countTab[4]++;
					} else if (content.length() == 5) {
						countTab[5]++;
					} else if (content.length() == 6) {
						countTab[6]++;
					} else if (content.length() == 7) {
						countTab[7]++;
					} else if (content.length() == 8) {
						countTab[8]++;
					} else if (content.length() == 9) {
						countTab[9]++;
					} else if (content.length() == 10) {
						countTab[10]++;
					} else if (content.length() == 11) {
						countTab[11]++;
					} else countTab[0]++;
					}
				}
			System.out.println(Arrays.toString(countTab));
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
