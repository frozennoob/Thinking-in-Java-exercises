import java.util.*;

public class Ex14 {
	public static void start(){
		System.out.println("Входим в первый блок try");
		try {
			System.out.println("Входим во второй блок try");
			try{
				throw new FourException();
			} finally{
				System.out.println("finally во втором блоке try");
			}
		} catch(FourException e){
			System.out.println("Перехвачено FourException в первом блоке try");
		} finally {
			System.out.println("finally в первом блоке try");
		}
		/*try{
			throw new RuntimeException();
		} finally{} */
	}
	private static Switch sw = new Switch();
	public static void start2(){
		try{
			sw.on();
			f();
			sw.off();
			// throw new RuntimeException();
		} catch (OnOffException1 e){
			System.out.println("OnOffException1");
			sw.off();
		} catch(OnOffException2 e){
			System.out.println("OnOffException2");
			sw.off();
		}
	}
	public static void f() throws OnOffException1, OnOffException2 {}
}
class FourException extends Exception{}
class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}