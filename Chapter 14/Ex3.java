import java.util.*;

public class Ex3 {
	public static void start(){
		Shapes.start();
	}
}

abstract class Shape {
	  enum Inv {Circle, Square, Triangle, Rhomboid}
	  static Inv inv = null;
	  void draw() { System.out.println(this + ".draw()"); }
	  void rotate(){
		  if (!(this instanceof Circle))
			  System.out.println(this + ".rotate()");
	  }
	  void invert(Inv i){
		  inv = i;
	  }
	  boolean invSt(){
		  return this.getClass().getName() == inv.toString();
	  }
	  abstract public String toString();
	}

	class Circle extends Shape {
	  public String toString() { return "Circle " + invSt(); }
	}

	class Square extends Shape {
	  public String toString() { return "Square " + invSt(); }
	}

	class Triangle extends Shape {
	  public String toString() { return "Triangle " + invSt(); }
	}	
	
	class Rhomboid extends Shape {
		public String toString() { return "Rhomboid " + invSt(); }
	}

	class Shapes {
	  public static void start() {
		  Shape.inv = Shape.Inv.Triangle;
	    List<Shape> shapeList = Arrays.asList(
	      new Circle(), new Square(), new Triangle(), new Rhomboid()
	    );
	    for(Shape shape : shapeList)
	      shape.draw();
	    for(Shape shape : shapeList)
		      shape.rotate();
	    Rhomboid r = new Rhomboid();
	    Shape s = r;
	    s.draw();
	   if (s instanceof Rhomboid){
	    	Rhomboid r2 = (Rhomboid) s;
	    	r2.draw();
	    }
	  }
	}