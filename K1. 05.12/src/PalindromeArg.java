// Program som sjekker om en string-array inneholder et palindrom
import java.util.Arrays;

public class PalindromeArg {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("We need parameters!");
		} else Palindrome(args);
	}
	
	private static char[] revTab(char[] array) {
		for (int i=0; i<array.length/2;i++) {
			char temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i - 1] = temp;
		}		
		return array;
	}
	
	private static void isPalindrome(char[] Forward, char[] Reversed) {
		if (Arrays.equals(Forward, Reversed)) {
			System.out.println("Palindrom");
		} else System.out.println("Ikke et palindrom");
	}

	private static void Palindrome(String[] args) {
		for (int i =0; i<args.length;i++) {
			String ord = args[i];
			char[] Forward = ord.toCharArray();
			char[] Reversed = Arrays.copyOf(Forward, Forward.length);
			revTab(Reversed);
			System.out.print(args[i]+" - ");
			isPalindrome(Forward, Reversed);
			}
		}
}