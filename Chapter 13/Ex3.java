import java.io.*;
import java.util.*;

public class Ex3 {
	private String name;
	private Formatter f;
	public Ex3(String name, Formatter f){
		this.name = name;
		this.f = f;
	}
	public void move(int x, int y){
		f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}
	public static void start(){
		PrintStream outAlias = System.err;
		Ex3 tommy = new Ex3("Tommy", 
				new Formatter(outAlias));
		Ex3 terry = new Ex3("Terry", 
				new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}
