import java.util.*;

public class Ex30 {
	public static void start(){
		for (int i = 0; i < 2; i++)
			try{
				if(i == 0)
					throw new Sneeze();
				else
					throw new Annoyance();
			} catch (Sneeze s){
				System.out.println("Перехвачено Sneeze");
			} catch (Annoyance a){
				System.out.println("Перехвачено Annoyance");
			}
	}
}

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}