import java.util.*;

public class Ex6 {
	public static void start(){
		try{
			f();
		} catch(MyException3 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		} catch(MyException4 e){
			e.printStackTrace(System.out);
		}
	}
	static void f() throws MyException3 {
		throw new  MyException3();
	}
	static void g() throws MyException4 {
		throw new  MyException4();
	}
}

class MyException3 extends Exception{
	public String getMessage(){
		return "MyException 3 " + super.getMessage();
	}
}
class MyException4 extends Exception{
	public String getMessage(){
		return "MyException 4  ";
	}
}