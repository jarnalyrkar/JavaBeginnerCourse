import java.util.Arrays;

public class Lotto {
	int[] rekke;
	
	public Lotto() {
		this.rekke=newRow();
	}
	
	private int[] newRow() {
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
	
	
	 public String toString() {
	    return Arrays.toString(rekke);
		  }

	boolean lik (int[] a, int[] b){
		return Arrays.equals(a, b);
	}
}
