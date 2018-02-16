//: typeinfo/pets/Rodent.java
package typeinfo.pets;

public class Rodent extends Pet {
  public Rodent(String name) { super(name); }
  public Rodent() { super(); }
  public static class Factory
  implements PFactory<Rodent> {
    public Rodent create() { return new Rodent(); }
  }
} ///:~
