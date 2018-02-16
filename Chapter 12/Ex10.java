import java.util.*;

public class Ex10 {
	public static void start(){
		try{
			f();
		} catch (Exception e){
			e.printStackTrace(System.out);
		}

	}
	static void f() throws MyException13{
		try{
			g();
		} catch (MyException12 e){
			e.printStackTrace(System.out);
			throw new RuntimeException(e);
			//throw new MyException13();
		}
	}
	static void g() throws MyException12{
		throw new MyException12();
	}
}

class MyException12 extends Exception{
	public String getMessage(){
		return "Exc 12";
	}
}
class MyException13 extends Exception{
	public String getMessage(){
		return "Exc 13";
	}
}