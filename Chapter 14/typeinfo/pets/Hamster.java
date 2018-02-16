//: typeinfo/pets/Hamster.java
package typeinfo.pets;

import typeinfo.pets.Hamster.Factory;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }
  public static class Factory
  implements PFactory<Hamster> {
    public Hamster create() { return new Hamster(); }
  }
} ///:~
