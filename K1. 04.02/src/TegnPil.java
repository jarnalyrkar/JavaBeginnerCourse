public class TegnPil {

	public static void main(String[] args) {
		tegnPil(3); 
	}

	  public static void tegnPil(int lengde) {
		    for (int i=1; i<=lengde; i++)
		      skrivTegn(i);
		    
		    for (int i=lengde-1; i>=1; i--)
		      skrivTegn(i);
		  }
		 
		  public static void skrivTegn(int antall) {
		    for (int i=1; i<=antall; i++)
		      System.out.print('>');
		    System.out.println();
  }
}