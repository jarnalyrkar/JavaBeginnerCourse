public class Item {
	int id;
	String name;
	double price;
	int quantity;
	
	
	public Item(int id, String name, double price, int antall) {
	this.id = id; this.name = name;
	this.price = price; this.quantity = antall;
	}
	
	public Item(int id, String name, double price) {
	this.id = id; this.name = name;
	this.price = price; this.quantity = 0;
	}
	
	public Item(int id, String name) {
		this.id = id; this.name = name;
		this.price = 0.0; this.quantity = 0;
		}
	
	public double sumLine() {
		return price*quantity;
	}
	
	public double sumVAT() {
		return (sumLine()*0.25)+sumLine();
	}
	
	public String tilStreng() {
		String strengen = id + ", " + name + ", " + price + ", " + quantity;
		return strengen;
	}
	
}
