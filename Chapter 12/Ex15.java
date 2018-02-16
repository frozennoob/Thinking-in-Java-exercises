import java.util.*;

public class Ex15 {
	static Switch sw = new Switch();
	public static void start(){
		try {
			sw.on();
			Ex14.f();
			//throw new RuntimeException();
		} catch(OnOffException1 e){
			System.out.println("OnOffException1");
		} catch(OnOffException2 e){
			System.out.println("OnOffException2");
		}finally{
			sw.off();
		}
	}
}

