import java.util.*;
import static net.mindview.util.Print.*;

public class Chapter4 {
	public static void main(String[] args) {
		//for (int i = 1; i < 101; i++) print(i);
		Random rnd = new Random();
		for (int i=0; i < 25; i++){
			int a = rnd.nextInt();
			int b = rnd.nextInt();
			if (a>b) print(a + " > " + b);
			if (a<b) print(a + " < " + b);
			if (a==b) print(a + " = " + b);
		}
		for (int i = 3; i < 100; i++)
			for (int k = 2; k <= i; k ++){
				if (k == i) print (i);
				if (i % k == 0) break;
				
			}
		IfElse2 ifelse = new IfElse2();
		print(ifelse.test(4,5,10));
		for (int i = 0; i < 5; i++)
			switch(i){
			case 0: print(i); 
			case 1: print(i); 
			case 2: print(i); 
			case 3: print(i);
			case 4: print(i); 
			}
		
	}
}
