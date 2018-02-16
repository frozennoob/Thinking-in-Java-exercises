import java.util.*;
import static net.mindview.util.Print.*;

public class Ex31 {
	public static void start(){
		RandomShapeGenerator gen = 
				new RandomShapeGenerator(9);
		for (Shape s: gen){
			s = gen.next();
			s.draw();
		}
	}
}

class RandomShapeGenerator implements Iterable<Shape>{
	private Random rand = new Random(47);
	private Shape[] shapes;
	RandomShapeGenerator(int size){
		shapes = new Shape[size];
	}
	public Shape next(){
		switch(rand.nextInt(4)){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			case 3: return new Line();
		}
	}
	public Iterator<Shape> iterator(){
		return new Iterator<Shape>(){
			private int index = 0;
			public boolean hasNext(){
				return index < shapes.length;
			}
			public Shape next() {return shapes[index++];}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
}

class Circle extends Shape {
	public void draw() { print("Circlee.draw()");}
	public void erase() { print("Circle.erase()");}
	public void msg(){System.out.println("Circle.msg()");}
}
class Square extends Shape {
	public void draw() { print("Square.draw()");}
	public void erase() { print("Square.erase()");}
	public void msg(){System.out.println("Square.msg()");}
}
class Triangle extends Shape {
	public void draw() { print("Triangle.draw()");}
	public void erase() { print("Triangle.erase()");}
	public void msg(){System.out.println("Triangle.msg()");}
}
class Line extends Shape {
	public void draw() { print("Line.draw()");}
	public void erase() { print("Line.erase()");}
	public void msg(){System.out.println("Line.msg()");}
}
class Shape {
	public void draw() {}
	public void erase() {}
	public void msg(){System.out.println("Shape.msg()");}
}