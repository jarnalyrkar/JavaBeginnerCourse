import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFile {

	public static void main(String[] args) {
		// Takes a text file with an alphabetical 
		// list of something and reverses the content
		String filename = "list.txt";
		int lines = 0;
		String[] contentTab = null;
		PrintWriter writer = null;
		try {
			Scanner sc = new Scanner(new File(filename));
			lines = 0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				lines++;
			}
			System.out.println(lines);
			contentTab = new String[lines];
			
			sc = new Scanner(new File(filename));
			
			int i = 0;
			while (sc.hasNextLine()) {
				contentTab[i] = sc.nextLine();
				i++;
			}
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

			try {
				writer = new PrintWriter(filename);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			String[] reverseTab = new String[lines];
			int k = 0;
			for (int j = lines-1; j >= 0; j--) {
				reverseTab[j] = contentTab[k];
				k++;
			}
			
			for (int l = 0; l < reverseTab.length; l++) {
				writer.write(reverseTab[l] + System.lineSeparator());
			}
			writer.close();
	}
}
