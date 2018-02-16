import java.lang.reflect.*;
import java.util.*;

import hiddenmethods.HiddenMethods;

// стр 500
public class Ex25 {
	public static void start(){
		HiddenMethods hm = new HiddenMethods();
		for (Method m: hm.getClass().getDeclaredMethods()){
			m.setAccessible(true);
			try {
				m.invoke(hm);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
