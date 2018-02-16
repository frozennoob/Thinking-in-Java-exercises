//: typeinfo/pets/Dog.java
package typeinfo.pets;

import typeinfo.pets.Cymric.Factory;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }
  public static class Factory
  implements PFactory<Dog> {
    public Dog create() { return new Dog(); }
  }
} ///:~
