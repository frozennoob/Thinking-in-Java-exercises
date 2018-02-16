import java.util.*;

public class Ex16 extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public Ex16(int i){
		super(i +1);
		for(int j = 0; j < lines.length; j++)
			lines[j] = new Line (j, j*j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Комбинированный конструктор");
	}
	void dispose(){
		System.out.println("Ex16.dispose()");
		t.dispose();
		c.dispose();
		for(int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}
	public static void start(){
		Ex16 x = new Ex16(47);
		try{
			return;
		}finally{
			x.dispose();
		}
	}
}

class Shape{
	Shape(int i) { System.out.println("Конструктор Shape");}
	void dispose() { System.out.println("Завершаем Shape");}
}

class Circle extends Shape {
	Circle(int i){
		super(i);
		System.out.println("Рисуем окружность Circle");
	}
	void dispose(){
		System.out.println("Стираем окружность Circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	Triangle(int i){
		super(i);
		System.out.println("Рисуем треугольник Triangle");
	}
	void dispose(){
		System.out.println("Стираем треугольник Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Рисуем линию Line: " + start + ", " + end);
	}
	void dispose(){
		System.out.println("Стираем линию Line: " + start + ", " + end);
		super.dispose();
	}
}