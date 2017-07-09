import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveBlankLines {

	public static void main(String[] args) {
		String filename = args[0];
		try {
			Scanner sc = new Scanner(new File(filename));
			String content = "";
			String cleanedContent = "";
			
			while (sc.hasNextLine()) {
				content = sc.nextLine();	
			System.out.println(content);
			if (!content.isEmpty()) {
				cleanedContent += content + System.lineSeparator();	
			}
			}
			
			System.out.println(cleanedContent);

			PrintWriter writer = new PrintWriter(filename);
			BufferedWriter bw = new BufferedWriter(writer);
			writer.write(cleanedContent);
			
			writer.close();
			bw.close();
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
