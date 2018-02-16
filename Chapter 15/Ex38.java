import java.util.*;

public class Ex38 {
	public static void start(){
		Cappuccino2 cap1 = new Cappuccino2(new Coffee2());
		Cappuccino2 cap2 = new Cappuccino2(new Milk(new Coffee2()));
		Milk m1 = new Milk(new Coffee2());
		Milk m2 = new Milk(new Cappuccino2(new Coffee2()));
		System.out.println(cap1 + " " + cap2 + " " + m1 + " " + m2);
	}
}

class Coffee2 {
	private static String name = "Coffee";
	  public String toString() {
	    return name;
	  }
}

class Decorator extends Coffee2{
	protected Coffee2 coffee;
	public Decorator(Coffee2 coffee) { this.coffee = coffee;}
}

class Cappuccino2 extends Decorator {
	private final String name = "Cappuccino";
	public Cappuccino2(Coffee2 coffee){
		super(coffee);
	}
	public String toString() {
	    return name;
	  }
}

class Chocolate extends Decorator {
	private final String name = "Chocolate";
	public Chocolate(Coffee2 coffee){
		super(coffee);
	}
	public String toString() {
	    return name;
	  }
}
class Milk extends Decorator {
	private final String name = "Milk";
	public Milk(Coffee2 coffee){
		super(coffee);
	}
	public String toString() {
	    return name;
	  }
}