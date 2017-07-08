//Program that creates 2-10 rows of lottery numbers, simulating a lottery ticket.
//Also possible to check if a row of numbers is the same as a winning sequence.

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		
		int[] winRow = newRow();
		int[] myRow = newRow();
		System.out.println("(A message will be displayed if you win)\n      "
				+ "***************************");
		System.out.println("      "+ Arrays.toString(myRow) +"\n      "+ Arrays.toString(winRow));
		checkWin(myRow, winRow);
		System.out.println("\nExtra rows:");
		thisManyRows(10);
	}
	
	private static int[] newRow() {
		int[] row = new int[7];
		int max = 34;
		int min = 1;
		int range = (max-min)+1;
		
		for (int i=0; i<row.length;i++){
			row[i] = ((int)(Math.random()*range)+1);
			
			for (int j = 0; j < i; j++) {
				if (row[i] == row[j])
					i--;
				}

		}
		Arrays.sort(row);
		
		
		return row;
		}
	
	private static void thisManyRows(int num){
		if (num > 10 || num < 2) {
			System.out.println("Fudgecracker");
			} else {
				for (int i =0; i<num;i++)
					System.out.println("Kupong nr "+(i+1)+": " + Arrays.toString(newRow()));
			}
		}
	private static void checkWin(int[] myRow, int[] winRow) {
		int count = 0;
		for (int i=0; i<myRow.length;i++) {
			for (int j=0;j<winRow.length;j++) {
				if (myRow[i] == winRow[j])
					count++;				
			}
		}
		
		if (count == 4) {
			System.out.println("Du har vunnet en fire-rekker!");
		} else if (count == 5) {
			System.out.println("Du har vunnet en fem-rekker!");
		} else if (count == 6) {
			System.out.println("Du har vunnet en seks-rekker!");
		} else if (count == 7) {
			System.out.println("Du har vunnet i LOTTO!");
		}
	}
}
