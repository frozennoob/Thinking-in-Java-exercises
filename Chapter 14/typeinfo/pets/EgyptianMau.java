//: typeinfo/pets/EgyptianMau.java
package typeinfo.pets;

import typeinfo.pets.EgyptianMau.Factory;

public class EgyptianMau extends Cat {
  public EgyptianMau(String name) { super(name); }
  public EgyptianMau() { super(); }
  public static class Factory
  implements PFactory<EgyptianMau> {
    public EgyptianMau create() { return new EgyptianMau(); }
  }
} ///:~
