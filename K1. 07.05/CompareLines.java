// Takes two text files.
// Compares one line in each.
// Every line that's not equal get's written out with a line number.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompareLines {
	public static void main(String[] args) {
		String path1 = "firstfile.txt";
		String path2 = "secondfile.txt";
		
		Scanner file1;
		Scanner file2;
		String[] lineTab1;
		String[] lineTab2;
		
		try {
			// Both files will have the same amount of lines
			// Counting the lines of the first file.
			file1 = new Scanner(new File(path1));
			int lines = 0;
			while (file1.hasNextLine()) {
				file1.nextLine();
				lines++;
			}
			
			// Assigns variables.
			lineTab1 = new String[lines];
			lineTab2 = new String[lines];
			file1 = new Scanner(new File(path1));
			int i = 0;
			
			// Adds the first text file to a string array.
			while (file1.hasNextLine()) {
				lineTab1[i] = file1.nextLine();
				i++;
			}
			
			// resets counter
			i = 0;
			file2 = new Scanner(new File(path2));
			// Adds the second text file to a string array
			while (file2.hasNextLine()) {
				lineTab2[i] = file2.nextLine();
				i++;
			}
				
			// Compares the two arrays
			for (int j = 0; j < lines; j++) {
				if (!lineTab1[j].equals(lineTab2[j])) {
					System.out.println((j+1) + " " + lineTab1[j] + " != " + lineTab2[j]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
