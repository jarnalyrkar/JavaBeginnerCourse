// Program which

public class NameFormat {

	public static void main(String[] args) {
		String navn = "jOsEf";
		System.out.println(nameFormat(navn));
	}
	
	private static String nameFormat(String navn){
		String low = navn.toLowerCase();
		char[] name = low.toCharArray();
		name[0] = Character.toUpperCase(name[0]);
		String navnet = new String(name);
		return navnet;
	}

}
