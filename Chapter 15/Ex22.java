import java.lang.reflect.Constructor;
import java.util.*;

public class Ex22 {
	public static void start(){
		Object[] args = {"Yeaaah"};
		ClassAsFactory caf = new ClassAsFactory(HeavyMetall.class, args);
	}
}

class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind, Object[] args) {
		try{
			Constructor[] constr = kind.getDeclaredConstructors();
			for (Constructor c : constr)
				c.newInstance(args);
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class HeavyMetall{
	HeavyMetall(String msg){
		System.out.println(msg);
	}
}