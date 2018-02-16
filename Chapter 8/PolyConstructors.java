
public class PolyConstructors{
	static void start(){
		new RoundGlyph(5);
		new RectangularGlyph(5,4);
	}
}
class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r){
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw (){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class Glyph{
	void draw() {System.out.println("Glyph.draw()");}
	Glyph(){
		System.out.println("Glyph перед вызовом draw()");
		draw();
		System.out.println("Glyph после вызова draw()");
	}
}

class RectangularGlyph extends Glyph{
	private int width = 1, height  = 1;
	RectangularGlyph(int a, int b){
		width = a;
		height = b;
		System.out.println("RectangularGlyph.RectangularGlyph(), width = " + 
		width + " height = " + height);
	}
	void draw(){
		System.out.println("RectangularGlyph.draw(), width = " + 
				width + " height = " + height);
	}
}