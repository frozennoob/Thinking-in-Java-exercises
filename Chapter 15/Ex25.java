import java.util.*;

public class Ex25 {
	static <T extends Ex25Int> void Ex25Method (T x){}
	static <T extends Ex25Int2> void Ex25Method2 (T x){}
	public static void start(){
		Ex25Cl cl = new Ex25Cl();
		Ex25Method(cl);
		Ex25Method2(cl);
	}
}

interface Ex25Int{}
interface Ex25Int2{}
class Ex25Cl implements Ex25Int, Ex25Int2{}