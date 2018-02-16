import java.util.*;
import second.*;

public class Chapter7 {

	public static void main(String[] args) {
		Bathroom mybath = new Bathroom();
		System.out.println(mybath);
		C c = new C();
		Advanced adv = new Advanced();
		Advanced adv1 = new Advanced(4);
		Stem stm = new Stem(1,2,3);
		ExtOverride over = new ExtOverride();
		over.over();
		over.over(1);
		over.over('a');
		over.over("super");
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
		Prot2 prt = new Prot2();
		Frog frg = new Frog();
		Amphibian.hello(frg);
		frg.voice("Frog");
		System.out.println(Final.VAL_1);
		Final fnl = new Final();
		System.out.println(fnl.val3);
		Final fnl2 = new Final("Final 2");
		System.out.println(fnl2.val3);
		try{}
		finally{
			stm.dispose();
			c.dispose();
			adv.dispose();
		}
	}
}
	
class Soap{
		String name = "Dove";
	}
	
	class Bath{
		Soap mysoap;
		public String toString(){
			if (mysoap == null) mysoap = new Soap();
			return mysoap.name;
		}
	}
	class Bathroom{
		String name = "Vannaj";
		private Bath mybath = new Bath();
		public String toString(){
			return mybath.toString() + " " + name;
		}
	}
	class A{
		A(int i){
			System.out.println("Constructor A");
		}
		void dispose(){
			System.out.println("A finalize ");
		}
	}
	class B{
		B(int i){
			System.out.println("Constructor B");
		}
		void dispose(){
			System.out.println("B finalize ");
		}
	}
	class C extends A{
		C(){
			super(1);
		}
		B b = new B(1);
		void dispose(){
			System.out.println("C finalize ");
			super.dispose();
			b.dispose();
		}
	}
	class Base{
		Base(int i){
			System.out.println("Base consructor " + i);
		}	
		void dispose(){
			System.out.println("Base finalize ");
		}
	}
	class Advanced extends Base{
		Advanced(){
			super(2);
		}
		Advanced(int i){
			super(i);
		}
		void dispose(){
			System.out.println("Advanced finalize ");
			super.dispose();
		}
	}
	class Stem extends Root{
		Stem(int a, int b, int c){
			super(a,b,c);
			System.out.println("Stem constructor");
		}
		void dispose(){
			System.out.println("Stem finalize ");
			super.dispose();
		}
	}
	class ExtOverride extends Override{
		void over(String i){
			System.out.println("Over String " + i);
		}
	}
	class Prot2 extends Prot{
		Prot2(){
			super.protect();
		}
	}
