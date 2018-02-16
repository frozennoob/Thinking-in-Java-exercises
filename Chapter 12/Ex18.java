
import java.util.*;

public class Ex18 {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	void third() throws ThirdException{
		throw new ThirdException();
	}
	public static void start(){
		try {
			Ex18 lm = new Ex18();
			try{
				lm.f();
			try{
				lm.dispose();
			} finally{
				lm.dispose();
			} 
		} finally {
			lm.third();
		}
		}catch (Exception e){
			System.out.println(e);}
}
}

class VeryImportantException extends Exception {
	public String toString(){
		return "Очень важное исключение!";
	}
}

class HoHumException extends Exception {
	public String toString(){
		return "Второстепенное исключение";
	}
}

class ThirdException extends Exception{
	public String toString(){
		return "Третье исключение";
	}
}