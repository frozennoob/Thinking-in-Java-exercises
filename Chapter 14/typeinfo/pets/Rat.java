//: typeinfo/pets/Rat.java
package typeinfo.pets;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }
  public static class Factory
  implements PFactory<Rat> {
    public Rat create() { return new Rat(); }
  }
} ///:~
