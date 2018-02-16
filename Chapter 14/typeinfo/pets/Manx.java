//: typeinfo/pets/Manx.java
package typeinfo.pets;

import typeinfo.pets.Manx.Factory;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }
  public static class Factory
  implements PFactory<Manx> {
    public Manx create() { return new Manx(); }
  }
} ///:~
