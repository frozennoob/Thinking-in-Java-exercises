import java.util.*;

public class Ex3 {
	public static void start(){
		int a[] = {1,2,3};
		try{
			a[3] = a[4];
		} catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace(System.out);
		}
	}
}
