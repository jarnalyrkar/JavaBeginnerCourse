import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumNumbersInFile {

	public static void main(String[] args) {

		String filename = "thefile.txt";
		
	try {
		Scanner sc = new Scanner(new File(filename));
		
		// Count how many lines exists
		int lines = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			lines++;
		}
			
		// Makes an array of size == number of lines in the document.
		int[] sumArr = new int[lines];
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		PrintWriter writer = new PrintWriter("Res" + filename, "UTF-8");
		
		writer.println("Ant:\tSum:");
		for (int i = 0; i < lines; i++) {
			line = br.readLine();
			sc = new Scanner(line);
			int count = 0;
			while (sc.hasNext()){
				sumArr[i] += sc.nextInt();
				count++;	
			}
			writer.println(count + "\t" + sumArr[i]);
		}
		
		br.close();
		sc.close();
		writer.close();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}	
	}
}
