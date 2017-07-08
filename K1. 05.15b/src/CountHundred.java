// Program that simulates counts between 1-9, hundred times, 
// displays occurances of each number as an asterisk-sign.
import java.util.Arrays;

public class CountHundred {

	public static void main(String[] args) {
		
		int[] results = getRandom(100);
		int[] countResults = countUnique(results);
		//System.out.println(Arrays.toString(results));
		//System.out.println(Arrays.toString(countResults));			
		System.out.print(stringBuilder(countResults));	
	}
	
	private static int[] getRandom(int toss) {
		int range = (9 - 1) + 1;
		int[] diceArray = new int[toss];
		for (int i=0; i<diceArray.length; i++)
			diceArray[i] = ((int)(Math.random()*range)+1);
		return diceArray;
	}
	
	private static int[] countUnique(int[] anArray) {
		Arrays.sort(anArray);
		int[] counter = new int[9];
		for (int i = 0; i<anArray.length;i++) {
			counter[anArray[i] - 1]++;
		}	
		return counter;
	}	
	
	private static String stringBuilder(int[] array) {
		String strengen = "";
		for (int i=0; i<array.length;i++) {
			strengen += "" + (i+1) + ": " + starBuilder(array[i]) + "\n";
		}
		return strengen;
	}
	
	private static String starBuilder(int stars) {
		String drawStars = "";
		for (int i=0;i<stars;i++) {
			drawStars += "*";
		}
		
		return drawStars;
	}
	
	
}