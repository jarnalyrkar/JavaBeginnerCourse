import java.util.Arrays;

public class Bootsie {

	public static void main(String[] args) {
		Name navnA = new Name("edWarD", "olFenSchmiRtz");
		Name navnB = new Name("riNA", "solHeim");
		Name navnC = new Name("båRd", "Johansen");
		Name navnD = new Name("Hadia", "Tajik");
		Name navnE = new Name("greGorY", "hOUse");
		
		Name[] navnTab = {navnA, navnB, navnC, navnD, navnE};
		System.out.println(Arrays.toString(navnTab));
		
		navnA.setFirstName("Ulf");
		System.out.println(Arrays.toString(navnTab));
	
	}

}
