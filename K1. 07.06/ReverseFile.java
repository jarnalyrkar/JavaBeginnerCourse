import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFile {

	public static void main(String[] args) {
		// Takes a text file with an alphabetical 
		// list of something and reverses the content
		String filename = "list.txt";
		try {
			Scanner sc = new Scanner(new File(filename));
			int lines = 0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				lines++;
			}
			System.out.println(lines);
			String[] contentTab = new String[lines];
			
			sc = new Scanner(new File(filename));
			
			int i = 0;
			while (sc.hasNextLine()) {
				contentTab[i] = sc.nextLine();
				i++;
			}
			sc.close();
			
			PrintWriter writer = new PrintWriter(filename);
			
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
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
