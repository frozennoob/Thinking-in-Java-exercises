/** My First Experience with Java! 
*
* Main class
*/
public class Ex2 {
	static int i = 47;
	static void increment(){Ex2.i++;} 
	static int storage(String s){
		return s.length() *2;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		class AtypeName {
			int name = 123;
		}
		AtypeName a = new AtypeName();
		a.name = 234;
		System.out.println(a.name);
		class DataOnly{
			int i;
			double d;
			boolean b;
		}
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
		increment();
		System.out.println(Ex2.i);
		int length = storage("Hi man!");
		System.out.println(length);
		StaticTest a1 = new StaticTest();
		StaticTest a2 = new StaticTest();
		StaticTest a3 = new StaticTest();
		a1.decrement();
		a2.decrement();
		a3.decrement();
		System.out.println(a1.number);
		System.out.println(a2.number);
		System.out.println(a3.number);
		int b2 = 0;
		Integer b1 = b2;
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		AllTheColorsOfTheRainbow r1 = new AllTheColorsOfTheRainbow();
		System.out.println(r1.anIntegerRepresentingColors);
		r1.changeTheHueOfTheColor(3);
		System.out.println(r1.anIntegerRepresentingColors);
	}
	
}
