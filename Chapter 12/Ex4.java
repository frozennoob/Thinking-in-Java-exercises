import java.util.*;

public class Ex4 {
	public static void start() throws MyException2{
		try{
			throw new MyException2("Ex4 Exception");
		}catch (MyException2 ex){
			ex.exception();}
	}
}
class MyException2 extends Exception{
	private String exception;
	MyException2(String str){
		exception = str;
	}
	public void exception(){
		System.out.println(exception);
	}
}
