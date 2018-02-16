import java.util.*;

public class Ex1 {
	public static void start() throws MyException{
		try{
			throw new MyException("Возбуждено в start()");
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		finally{
			System.out.println("Finally");
		}
	}
}

class MyException extends Exception{
	public MyException(){}
	public MyException(String msg) { super(msg); }
}