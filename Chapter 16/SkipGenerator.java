import java.util.*;
import net.mindview.util.*;
import net.mindview.util.CountingGenerator.Character;

public class SkipGenerator {
	 public static class
	  Boolean implements Generator<java.lang.Boolean> {
		 Boolean(int step){
			 step_ = step;
		 }
	    private boolean value = false;
	    public java.lang.Boolean next() {
	    	for (int i = 0 ; i < step_; i++)
	    		value = !value; // Just flips back and forth
	      return value;
	    }
	  }
	  public static class
	  Byte implements Generator<java.lang.Byte> {
		  Byte(int step){
				 step_ = step;
			 }
	    private byte value = 0;
	    public java.lang.Byte next() { 
	    	for (int i = 0 ; i < step_; i++, value++);
	    	return value; 
	    	}
	  }
	  static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
	    "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	  public static class
	  Character implements Generator<java.lang.Character> {
		  Character(int step){
				 step_ = step;
			 }
	    int index = -1;
	    public java.lang.Character next() {
	      index = (index + 1 + step_) % chars.length;
	      return chars[index];
	    }
	  }
	  public static class
	  String implements Generator<java.lang.String> {
		  String(int step){
				 step_ = step;
			 }
	    private int length = 7;
	    Generator<java.lang.Character> cg = new Character(step_);
	    public String(int step, int length) { this.length = length; step_ = step; }
	    public java.lang.String next() {
	      char[] buf = new char[length];
	      for(int i = 0; i < length; i++)
	        buf[i] = cg.next();
	      return new java.lang.String(buf);
	    }
	  }
	  public static class
	  Short implements Generator<java.lang.Short> {
		  Short(int step){
				 step_ = step;
			 }
	    private short value = 0;
	    public java.lang.Short next() { value += (short)step_;return value; }
	  }
	  public static class
	  Integer implements Generator<java.lang.Integer> {
		  Integer(int step){
				 step_ = step;
			 }
	    private int value = 0;
	    public java.lang.Integer next() {value += step_; return value; }
	  }
	  public static class
	  Long implements Generator<java.lang.Long> {
		  Long(int step){
				 step_ = step;
			 }
	    private long value = 0;
	    public java.lang.Long next() {value += step_; return value; }
	  }
	  public static class
	  Float implements Generator<java.lang.Float> {
		  Float(int step){
				 step_ = step;
			 }
	    private float value = 0;
	    public java.lang.Float next() {
	    	value += step_;
	      float result = value;
	      //value += 1.0;
	      return result;
	    }
	  }
	  public static class
	  Double implements Generator<java.lang.Double> {
		  Double(int step){
				 step_ = step;
			 }
	    private double value = 0.0;
	    public java.lang.Double next() {
	    	value += step_;
	      double result = value;
	      //value += 1.0;
	      return result;
	    }
	  }
	  static int step_ = 0;
}
