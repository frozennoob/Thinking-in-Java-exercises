//: generics/coffee/Breve.java
package generics.coffee;
public class Breve extends Coffee{
public static class Factory 
implements CFactory<Breve> {
	public Breve create (){
		return new Breve();
	}
} 
}///:~
