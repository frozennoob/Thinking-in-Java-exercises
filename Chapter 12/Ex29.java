import java.util.*;

public class Ex29 extends Inning2 implements Storm2, Umpire2{
	public Ex29() {}
	public Ex29(String s) {}
	public void umpire(){
		throw new UmpireException();
	}
	public void rainHard(){}
	public void event(){}
	public void atBat(){}
	public static void start(){
		Ex29 si = new Ex29();
		si.atBat();
		Inning2 i = new Ex29();
		i.atBat();
		
	}
}

class UmpireException extends RuntimeException{}
interface Umpire2{
	public void umpire();
}
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning2{
	public Inning2(){}
	public void event(){}
	public abstract void atBat();
	public void walk(){}
}
class StormException extends RuntimeException{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm2{
	public void event();
	public void rainHard();
}

