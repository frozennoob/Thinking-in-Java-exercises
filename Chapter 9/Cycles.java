
public class Cycles {
	public static void createCycle(CycleFactory cycle){
		Cycle s = cycle.getCycle();
		System.out.println(s.getCycles());
	}
	public static void start(){
		createCycle(new UnicycleFactory());
		createCycle(new BicycleFactory());
		createCycle(new TricycleFactory());
	}
}

interface Cycle {
	int getCycles();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public int getCycles(){return 1;}
}

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Unicycle();}
}

class Bicycle implements Cycle{
	public int getCycles(){return 2;}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Bicycle();}
}

class Tricycle implements Cycle{
	public int getCycles(){return 3;}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Tricycle();}
}
