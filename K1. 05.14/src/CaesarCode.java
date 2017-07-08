
public class CaesarCode {
	public static final int THEKEY = 3;
	
	public static void main(String[] args) {
		
		String code = "This is a code";
		String coded = codeTxt(code);
		String decoded = decodeTxt(coded);
		System.out.println("Original message: " + code + "\n" + "Coded: " + coded + "\n" + "Decoded: " + decoded);
	}

	private static String codeTxt(String txt) {
		txt = txt.toUpperCase();
		char[] txtArray = txt.toCharArray();
		int[] intArray = new int[txtArray.length];
		
		for (int i=0; i<txtArray.length;i++) {	
			intArray[i] = (int)txtArray[i];
				if (intArray[i] > 64 || intArray[i] < 91) {
					if (intArray[i] == 32) { // Empty if-statement; do nothing!
					} else intArray[i] = intArray[i]+THEKEY;
				}	
			}
		
		for (int i=0; i<intArray.length;i++) {
			txtArray[i] = (char)intArray[i];
		}
		
		String newText = new String(txtArray);
		return newText;
	}

	private static String decodeTxt(String txt) {
		char[] txtArray = txt.toCharArray();
		int[] intArray = new int[txtArray.length];
		
		for (int i=0; i<txtArray.length;i++) {	
			intArray[i] = (int)txtArray[i];
				if (intArray[i] > 64 || intArray[i] < 91) {
					if (intArray[i] == 32) {
					} else intArray[i] = intArray[i]-THEKEY;
				}	
			}
		
		for (int i=0; i<intArray.length;i++) {
			txtArray[i] = (char)intArray[i];
		}
		
		String newText = new String(txtArray);
		return newText;
	}
	
	
}
