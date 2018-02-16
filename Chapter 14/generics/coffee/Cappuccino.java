//: generics/coffee/Cappuccino.java
package generics.coffee;
public class Cappuccino extends Coffee {
public static class Factory
implements CFactory<Cappuccino> {
	public Cappuccino create (){
		return new Cappuccino();
	}
} 
}///:~
