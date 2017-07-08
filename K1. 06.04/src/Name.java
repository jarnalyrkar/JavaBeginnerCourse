
public class Name {
	//Object variables
	private String firstName;
	private String lastName;
	
	//Constructor
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Object methods
	public static String format(String navn){
		String low = navn.toLowerCase();
		char[] name = low.toCharArray();
		name[0] = Character.toUpperCase(name[0]);
		String navnet = new String(name);
		return navnet;
	}

	public String toString(){
		return ""+format(getLastName())+", "+format(getFirstName());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}