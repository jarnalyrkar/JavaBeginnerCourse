// This class is for testing the square-class
public class Boot {
	public static void main(String[] args) {
		Square kv3 = new Square(3);
		Square kv4 = new Square(4);
		Square kv5 = new Square(5);
		
		
		String txtOut3 ="Information about the square: \n"+ 
						"Circumference: "+kv3.circumference()+"\n"+
						"Diagonal: "+kv3.diagonal()+"\n"+
						"Areal: "+kv3.areal()+"\n"+
						"Sum: "+kv3.sum(kv4, kv5);
		System.out.println(txtOut3);	
						 kv3.draw();
		
		System.out.println();					
		String txtOut4 ="Information about the square: \n"+ 
						"Circumference: "+kv4.circumference()+"\n"+
						"Diagonal: "+kv4.diagonal()+"\n"+
						"Areal: "+kv4.areal()+"\n"+
						"Sum: "+kv4.sum(kv3, kv5);
		System.out.println(txtOut4);	
						 kv4.draw();
		
		System.out.println();				 
		String txtOut5 ="Information about the square: \n"+ 
						"Circumference: "+kv5.circumference()+"\n"+
						"Diagonal: "+kv5.diagonal()+"\n"+
						"Areal: "+kv5.areal()+"\n"+
						"Sum: "+kv5.sum(kv3, kv4);
		System.out.println(txtOut5);	
						 kv5.draw();
	}
}