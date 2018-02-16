import java.util.*;

public class Exc22 {
	public static void start(){
		try{
			FailingConstructor fc = new FailingConstructor();
		} catch(Exception e){
			
		}
	}
}

class FailingConstructor{
	FC fc;
	FailingConstructor() throws Exception{
		try{
			fc = new FC();
		}catch (Exception e){
			throw new Exception();
		}
		fc.dispose();
		fc = new FC();
	}
	void dispose(){
		System.out.println("Failing Constructor освобожден");
	}
}

class FC {
	void dispose(){
		System.out.println("FC освобожден");
	}
}