import java.util.*;

public class Ex4 {
	public static void start(){
		Receipt receipt = new Receipt();
	    receipt.printTitle();
	    receipt.print("Jack's Magic Beans", 4, 4.25);
	    receipt.print("Princess Peas", 3, 5.1);
	    receipt.print("Three Bears Porridge", 1, 14.29);
	    receipt.printTotal();
	}
}

class Receipt {
	private final int w1 = 15;
	private final int w2 = 5;
	private final int w3 = 10;
	private final String titleW = "%-" + w1 + "s %" + w2 + "s %" + w3 + "s\n";
	private final String printW = "%-" + w1 + "." + w1 + "s %" + w2 + "d %" 
			+ w3 + ".2f\n";
	private final String totalW = "%-" + w1 + "s %" + w2 + "s %" + w3 + ".2f\n";
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle(){
		f.format(titleW, "Item", "Qty", "Price");
		f.format(titleW, "----", "---", "-----");
	  }
	  public void print(String name, int qty, double price) {
	    f.format(printW, name, qty, price);
	    total += price;
	  }
	  public void printTotal() {
	    f.format(totalW, "Tax", "", total*0.06);
	    f.format(titleW, "", "", "-----");
	    f.format(totalW, "Total", "",
	      total * 1.06);
	  }
}