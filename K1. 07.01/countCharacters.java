import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class countCharacters {
	public static void main(String[] args) {
		// Input:
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a filepath: ");
		String filename = sc.nextLine();
		
		String content = "";
		try {
			System.out.println("-----START OF TEXT-----");
			content = new String(Files.readAllBytes(Paths.get(filename)));
			System.out.println(content);
			System.out.println("-----END OF TEXT-----");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int counter = 0;
		for (char ch : content.toCharArray()) {
			counter ++;
		}
		
		System.out.println(counter + " characters in total!");
		
	}
}
