import java.util.*;
import net.mindview.util.*;

public class Ex19 {
	public static void start(){
		System.out.println(new Ship(14,5,10));
	}
}

class Product{
	private final int id;
	private String description;
	private double price;
	public Product(int IDnumber, String descr, double price){
		id = IDnumber;
		description = descr;
		this.price = price;
		System.out.println(toString());
	}
	public String toString(){
		return id + ": " + description + ", price: $" + price;
	}
	public static net.mindview.util.Generator<Product> generator = 
			new net.mindview.util.Generator<Product>() {
		private Random rand = new Random(47);
		public Product next(){
			return new Product(rand.nextInt(1000), "Test",
					Math.round(rand.nextDouble()*1000.0) + 0.99);
		}
	};
}

class Containers extends ArrayList<Product>{
	public Containers(int nProducts){
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Decks extends ArrayList<Containers>{
	public Decks(int nContainers, int nProducts){
		for(int i = 0; i < nContainers; i ++)
			add(new Containers(nProducts));
	}
}

class Ship extends ArrayList<Decks>{
	public Ship(int nDecks, int nContainers, int nProducts){
		for(int i = 0; i < nDecks; i++)
			add(new Decks(nContainers, nProducts));
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(Decks a: this)
			for(Containers s: a)
				for(Product p : s){
					result.append(p);
					result.append("\n");
				}
		return result.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}