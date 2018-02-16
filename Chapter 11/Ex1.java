import java.util.*;

public class Ex1 {
	public static void start(){
		ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
		gerbil.add(new Gerbil());
		gerbil.add(new Gerbil(1));
		gerbil.add(new Gerbil(3));
		gerbil.add(new Gerbil(5));
		for (int i = 0; i < gerbil.size(); i++)
			gerbil.get(i).hop();
	}
	
}

class Gerbil {
	private int gerbilNumber;
	Gerbil(int x){
		gerbilNumber = x;
	}
	Gerbil(){
		gerbilNumber = 0;
	}
	public void hop(){
		System.out.println("gerbilNubmer = " + gerbilNumber);
	}
}