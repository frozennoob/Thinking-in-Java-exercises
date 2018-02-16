//: generics/coffee/Americano.java
package generics.coffee;

public class Americano extends Coffee {
public static class Factory
implements CFactory<Americano> {
	public Americano create (){
		return new Americano();
	}
	}
}
///:~
