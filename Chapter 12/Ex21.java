import java.util.*;

public class Ex21 {
	public static void start() throws Exc21{
		AdvExc ae = new AdvExc();
	}
}

class BaseExc {
	BaseExc() throws Exc21 {
		throw new Exc21();
	}
}

class AdvExc extends BaseExc {
	AdvExc() throws Exc21 {
		try{
			BaseExc be = new BaseExc();
		} catch(Exc21 e){
			System.out.println("Exception Ex21");
		}
	}
}

class Exc21 extends Exception {}