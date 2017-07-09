import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
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
		
		for (int i = 0; i < lines; i++) {
			line = br.readLine();
			sc = new Scanner(line);
			while (sc.hasNext()){
				sumArr[i] += sc.nextInt();
			}
		}
		br.close();
		sc.close();
		
		System.out.println(Arrays.toString(sumArr));		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
