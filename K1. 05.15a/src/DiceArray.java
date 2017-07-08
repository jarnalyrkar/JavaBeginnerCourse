// Program that simulates throwing a dice x-times, and counts occurances of each number.
import java.util.Arrays;

public class DiceArray {

	public static void main(String[] args) {
		// User input:
		// int toss = showInputDialog(parseInt("Enter how many dice throws: "));
		
		int[] diceResults = getRandom(10); // switch 10 with variable toss for user input
		System.out.println(Arrays.toString(diceResults));
		int[] countResults = countUnique(diceResults);
		System.out.println(Arrays.toString(countResults));
	}

	private static int[] getRandom(int toss) {
		int range = (6 - 1) + 1;
		int[] diceArray = new int[toss];
		for (int i=0; i<diceArray.length; i++)
			diceArray[i] = ((int)(Math.random()*range)+1);
		return diceArray;
	}
	
	private static int[] countUnique(int[] anArray) {
		Arrays.sort(anArray);
		int[] counter = new int[6];
		for (int i = 0; i<anArray.length;i++) {
			counter[anArray[i] - 1]++;
		}
		return counter;
	}	
}