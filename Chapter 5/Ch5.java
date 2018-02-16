import java.util.*;
import static net.mindview.util.Print.*;

public class Ch5 {
	static String str = "str";
	static int number; 
	Ch5(){
		number = 45; 
	}
	static void f(String...args){
		for (String i : args)
			print(i);
	}
	public enum Money {
		TEN, TWENTYFIVE, FIFTY, HUNDRED, THOUTHAND, MILLION
	}
	public static void main(String[] args) {
		print(str);
		print (number);
		DefCons dc = new DefCons();
		DefCons dc2 = new DefCons("Hakamader");
		Dog pluto = new Dog();
		pluto.bark();
		pluto.bark(2, "р-р-р");
		pluto.bark("ауу", 3);
		TwoMethods tm = new TwoMethods();
		tm.userMsg("Rubic");
		OverConstr oc = new OverConstr("HIHO!");
		FinalTest ft = new FinalTest();
		new FinalTest();
		System.gc();
		Tank t1 = new Tank();
		new Tank();
		System.gc();
		StaticTest.test();
		String [] str = new String[]{
				"str1", "str2", "str3"
		};
		for (int i = 0; i < str.length; i++)
			System.out.print(str[i] + " ");
		StringArray [] strArr = new StringArray[5];
		for (int i = 0; i < strArr.length; i++)
			strArr[i] = new StringArray("str " + i);
		String[] f1 = new String[] {"tula", "moscow", "spb"};
		f("z", "yu", "new");
		f(f1);
		for (Money i : Money.values()){
			System.out.println(i + ", ordinal " + i.ordinal());
			switch (i){
			case TEN: System.out.println("TEN"); break;
			case TWENTYFIVE: System.out.println("TWENTYFIVE"); break;
			case FIFTY: System.out.println("FIFTY"); break;
			case HUNDRED: System.out.println("HUNDRED"); break;
			case THOUTHAND: System.out.println("THOUTHAND"); break;
			case MILLION: System.out.println("MILLION"); break;
			}
		}	
	}
}
