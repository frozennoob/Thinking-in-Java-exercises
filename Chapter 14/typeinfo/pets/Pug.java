//: typeinfo/pets/Pug.java
package typeinfo.pets;

import typeinfo.pets.Pug.Factory;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }
  public static class Factory
  implements PFactory<Pug> {
    public Pug create() { return new Pug(); }
  }
} ///:~
