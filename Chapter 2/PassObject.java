import static net.mindview.util.Print.print;

class Letter{
	char c;
}

public class PassObject {
	static void f(Letter y){
		y.c = 'z';
	}
	public static void init(){
		Letter x = new Letter();
		x.c = 'a';
		print("1: x.c: " + x.c);
		f(x);
		print("2: x.c: " + x.c);
	}
}
