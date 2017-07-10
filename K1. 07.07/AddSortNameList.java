import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Tekstfil med navneliste
// Kan legge inn flere navn i liste
// Tekstfil blir automatisk sortert

public class AddSortNameList {

	public static void main(String[] args) {

		String filename = "namelist.txt";
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));

			// count lines
			int lines = 0;
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				lines++;
			}

			// "resets" the scanner.
			sc = new Scanner(new File(filename));
			String[] contentTab = new String[lines];

			// Add each line as a string in an array:
			int k = 0;
			while (sc.hasNextLine()) {
				contentTab[k] = sc.nextLine();
				k++;
			}

			// newContentTab[contentTab.length+1], nytt navn, og sortert.
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a name: ");
			String inputString = "";
			while (inputString.equals("")) {
				inputString = input.next();
			}

			String[] newContentTab;
			newContentTab = Arrays.copyOf(contentTab, contentTab.length + 1);
			newContentTab[contentTab.length] = inputString;
			input.close();
			Arrays.sort(newContentTab);
			System.out.println(Arrays.toString(newContentTab));

			// Write newContentTab back to file
			PrintWriter writer = new PrintWriter(filename);
			for (int i = 0; i < newContentTab.length; i++) {
				writer.write(newContentTab[i] + System.lineSeparator());
			}
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
