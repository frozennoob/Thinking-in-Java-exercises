import java.util.*;

public class Ex8 {
	public static void start(){
		ArrayList<Gerbil2> gerbil = new ArrayList<Gerbil2>();
		gerbil.add(new Gerbil2());
		gerbil.add(new Gerbil2(1));
		gerbil.add(new Gerbil2(3));
		gerbil.add(new Gerbil2(5));
		display(gerbil.iterator());
	}
	public static void display(Iterator<Gerbil2> it){
		while(it.hasNext()){
			Gerbil2 g = it.next();
			g.hop();
		}
	}
}

class Gerbil2 {
	private int gerbilNumber;
	Gerbil2(int x){
		gerbilNumber = x;
	}
	Gerbil2(){
		gerbilNumber = 0;
	}
	public void hop(){
		System.out.println("gerbilNubmer = " + gerbilNumber);
	}
}