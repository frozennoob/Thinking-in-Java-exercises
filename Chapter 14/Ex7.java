import java.util.*;

public class Ex7 {
	public static void start(){
		SweetShop.start(SweetShop.Product.Candy);
		SweetShop.start2("Candy");
	}
}

class Candy {
	  static { System.out.println("Loading Candy"); }
	}

	class Gum {
	  static { System.out.println("Loading Gum"); }
	}

	class Cookie {
	  static { System.out.println("Loading Cookie"); }
	}

	class SweetShop {
	  static public enum Product {Candy, Gum, Cookie}
		public static void start(Product product) {	
	    switch (product){
	    case Candy:
	    	new Candy();
	    	break;
	    case Gum:
	    	new Gum();
	    	break;
	    case Cookie:
	    	new Cookie();
	    	break;
	    default:
	    	System.out.println("Класс не найден");
	    }
		}
		public static void start2(String args) {
			Class c = null;
			try {
				c = Class.forName(args);
				System.out.println("Enjoy your " + args);
			} catch(ClassNotFoundException e) {
				System.out.println("Couldn't find " + args);
			}
		}
	}