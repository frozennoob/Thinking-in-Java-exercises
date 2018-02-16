import java.util.*;

public class Ex20 extends Inning implements Storm, Umpire{
	public Ex20() 
			throws RainedOut, BaseballException{}
	public Ex20(String s) 
			throws Foul, BaseballException{}
	public void umpire() throws UmpireException{
		throw new UmpireException();
	}
	public void rainHard() throws RainedOut{}
	public void event(){}
	public void atBat() throws PopFoul{}
	public static void start(){
		try {
			Ex20 si = new Ex20();
			si.atBat();
			si.umpire();
		} catch(PopFoul e){
			System.out.println("Pop Foul");
		} catch(RainedOut e){
			System.out.println("Rained out");
		} catch(BaseballException e){
			System.out.println("Generic Baseball exception");
		} catch (UmpireException e){
			System.out.println("Umpire exception");
		}
		try {
			Inning i = new Ex20();
			i.atBat();
		} catch(Strike e){
			System.out.println("Strike");
		} catch(Foul e){
			System.out.println("Foul");
		} catch(RainedOut e){
			System.out.println("Rained out");
		} catch(BaseballException e){
			System.out.println("общее исключение");
		}
	}
}

class UmpireException extends Exception{}
interface Umpire{
	public void umpire() throws UmpireException;
}
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){}
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

