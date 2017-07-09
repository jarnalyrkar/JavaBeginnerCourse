import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SumNumbersInFile {
	public static void main(String[] args) {
		String filename = "thefile.txt";
		String content = "";
		int sum = 0;
		
		try {
			content = new String(Files.readAllBytes(Paths.get(filename)));
			System.out.println(content);
			Scanner sc = new Scanner(new File("thefile.txt"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			System.out.println(sum);

	}

}
