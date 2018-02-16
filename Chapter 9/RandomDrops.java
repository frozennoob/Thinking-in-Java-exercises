import java.util.Random;

public class RandomDrops {
	public static void startDrops(DropsFactory drops){
		Drops s = drops.getDrops();
		s.dropResult();
	}
	public static void start(){
		startDrops(new CubesFactory());
		startDrops(new CoinsFactory());
		startDrops(Coins.factory);
		startDrops(Cubes.factory);
	}
}

interface Drops{
	Random RAND = new Random();	
	void dropResult();
}
interface DropsFactory{
	Drops getDrops();
}

class Cubes implements Drops{
	public void dropResult(){
		System.out.println("Кубик 1: " + (RAND.nextInt(6) + 1));
		System.out.println("Кубик 2: " + (RAND.nextInt(6) + 1));
	}
	public static DropsFactory factory = new DropsFactory(){
		public Drops getDrops(){return new  Cubes();}
	};
}
class CubesFactory implements DropsFactory{
	public Drops getDrops(){return new Cubes();}
}
class Coins implements Drops{
	public void dropResult(){
	if (RAND.nextInt(2) == 1) System.out.println("Орел");
	else
			System.out.println("Решка");
	}
	public static DropsFactory factory = new DropsFactory(){
		public Drops getDrops(){return new  Coins();}
	};
}
class CoinsFactory implements DropsFactory{
	public Drops getDrops(){return new Coins();}
}