import java.util.*;

public class Ex5 {
	public static void start(){
		boolean error = true;
		int a[] = {1,2,3,4};
		int m = 10;
		while (error){
			try{
				a[1] = a[m];
				error = false;
				System.out.println(m);
			} catch (ArrayIndexOutOfBoundsException ex){
				m--;
			}
		}
	}
}
