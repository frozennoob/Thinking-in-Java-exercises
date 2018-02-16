import java.util.*;

public class Ex27 {
	public static void start(){
		int a[] = {1,2,3};
		try{
			a[3] = a[4];
		} catch(ArrayIndexOutOfBoundsException ex){
			throw new RuntimeException(ex);
		}
	}
}
