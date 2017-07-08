public class ItemBoot {
	
	public static void main(String[] args) {
		Item itemOne = new Item(1, "Hammer", 85.0, 4);
		Item itemTwo = new Item(2, "Nails", 4.0, 199);
		Item itemThree = new Item(3, "Ladder", 400.0, 6);
		
		Item[] itemArr = new Item[3];
		itemArr[0] = itemOne;
		itemArr[1] = itemTwo;
		itemArr[2] = itemThree;
		
		for (int i=0; i<itemArr.length;i++) {
			System.out.println(itemArr[i].tilStreng());
		}
		
		double sum = 0; double totalSum = 0;
		for (int i=0; i<itemArr.length;i++) {
			sum += itemArr[i].sumLine();
			totalSum += itemArr[i].sumVAT();
		}
		System.out.println("*******************");
		System.out.println("Sum ex. VAT: " + sum);
		System.out.println("Sum inc. VAT: " + totalSum);
		
		
	}
}