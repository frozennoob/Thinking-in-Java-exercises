
public class StaticTest {
	static String str = "abracadabra";
	static int a;
	String str1;
	static {
		a = 10;
	}
	{
		str1 = "Lambdastr";
	}
	static void test(){	
		System.out.println(str + a);
	}
}