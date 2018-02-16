//: typeinfo/pets/Mutt.java
package typeinfo.pets;

import typeinfo.pets.Mutt.Factory;

public class Mutt extends Dog {
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }
  public static class Factory
  implements PFactory<Mutt> {
    public Mutt create() { return new Mutt(); }
  }
} ///:~
