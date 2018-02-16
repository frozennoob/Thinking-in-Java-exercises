//: typeinfo/pets/Mouse.java
package typeinfo.pets;

import typeinfo.pets.Mouse.Factory;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }
  public static class Factory
  implements PFactory<Mouse> {
    public Mouse create() { return new Mouse(); }
  }
} ///:~
