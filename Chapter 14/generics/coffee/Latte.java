//: generics/coffee/Latte.java
package generics.coffee;
public class Latte extends Coffee{
public static class Factory 
implements CFactory<Latte> {
	public Latte create (){
		return new Latte();
	}
	} 
}///:~
