import java.util.*;

public class Ex8 {
	public static void start() throws MyException8{
		try{
			throw new MyException8("Exc 8");
		}catch (MyException8 ex){
			ex.exception();}	
	}
}

class MyException8 extends Exception{
	private String exception;
	MyException8(String str){
		exception = str;
	}
	public void exception(){
		System.out.println(exception);
	}
}