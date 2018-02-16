import java.util.*;
import static net.mindview.util.Print.*;

public class Chapter8 {
	static void ride(Cycle cycle){
		System.out.println(cycle.wheels() + " wheels");
	}
	public static void main(String[] args) {
		Cycle cycle = new Cycle();
		Unicycle unicycle = new Unicycle();
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		ride(cycle);
		ride(unicycle);
		ride(bicycle);
		ride(tricycle);
		Shapes.start();
		Rodents.start();
		Extend.start();
		ReferenceCounting.start();
		PolyConstructors.start();
		Starship.start();
		Cycle [] cyc = {new Unicycle(), new Bicycle(), new Tricycle()};
		((Unicycle)cyc[0]).balance();
		((Bicycle)cyc[1]).balance();
		
	}

}


class Cycle{
	int wheels(){return 0;}
}

class Unicycle extends Cycle{
	int wheels(){return 1;}
	public void balance(){System.out.println("Uni balance");}
}
class Bicycle extends Cycle{
	int wheels(){return 2;}
	public void balance(){System.out.println("Bi balance");}
}
class Tricycle extends Cycle{
	int wheels(){return 3;}
}