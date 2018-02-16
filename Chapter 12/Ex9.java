import java.util.*;

public class Ex9 {
	public static void start(){
		MyException10 exc10 = null;
		try{
			//f(1);
			//f(-1);
			//f(0);
			throw exc10;
		}catch (Exception e){
			e.printStackTrace(System.out);
		}
		finally{
			System.out.println("Finally Ex9");
		}
	}
	static void f(int a) throws MyException9, MyException10, MyException11{
		if (a > 0)
			throw new MyException9();
		if (a < 0)
			throw new MyException10();
		throw new MyException11();
	}
}

class MyException9 extends Exception{
	public String getMessage(){
		return "Exception 9";
	}
}
class MyException10 extends Exception{
	public String getMessage(){
		return "Exception 10";
	}
}
class MyException11 extends Exception{
	public String getMessage(){
		return "Exception 11";
	}
}
