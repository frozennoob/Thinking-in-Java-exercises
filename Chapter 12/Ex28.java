import java.util.*;

public class Ex28 {
	public static void start() throws MyException2{
		throw new MyException2("Ex4 Exception");
		
	}
}

class MyException2 extends RuntimeException{
	private String exception;
	MyException2(String str){
		exception = str;
	}
	public void exception(){
		System.out.println(exception);
	}
}