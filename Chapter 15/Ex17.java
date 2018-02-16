import java.util.*;

public class Ex17 {
	enum Color {GREEN, RED, BLUE, YELLOW, WHITE, BLACK,MAGENTA}
	public static void start(){
		EnumSet<Color> s1 = EnumSet.of(Color.GREEN, Color.RED, Color.YELLOW);
		EnumSet<Color> s2 = EnumSet.of(Color.WHITE, Color.BLACK, Color.YELLOW);
		EnumSet<Color> s3 = Sets2.union(s1, s2);
		System.out.println(s3);
		s3 = Sets2.intersection(s1, s2);
		System.out.println(s3);
		s3 = Sets2.difference(s1, s2);
		System.out.println(s3);
		s3 = Sets2.complement(s1, s2);
		System.out.println(s3);
	}
}

class Sets2 {
	public static <T extends Enum<T>> EnumSet<T> union(EnumSet<T> a, EnumSet<T> b) {
	    EnumSet<T> result = a.clone();
	    result.addAll(b);
	    return result;
	  }
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
	    Set<T> result = new HashSet<T>(a);
	    result.addAll(b);
	    return result;
	  }
	public static <T extends Enum<T>> EnumSet<T> intersection(EnumSet<T> a, EnumSet<T> b) {
	    EnumSet<T> result = a.clone();
	    result.retainAll(b);
	    return result;
	  }
	  public static <T>
	  Set<T> intersection(Set<T> a, Set<T> b) {
	    Set<T> result = new HashSet<T>(a);
	    result.retainAll(b);
	    return result;
	  }	
	  // Subtract subset from superset:
	  public static <T extends Enum<T>> EnumSet<T> difference(EnumSet<T> a, EnumSet<T> b) {
		    EnumSet<T> result = a.clone();
		    result.removeAll(b);
		    return result;
		  }
	  public static <T> Set<T>
	  difference(Set<T> superset, Set<T> subset) {
	    Set<T> result = new HashSet<T>(superset);
	    result.removeAll(subset);
	    return result;
	  }
	  // Reflexive--everything not in the intersection:
	  public static <T extends Enum<T>> EnumSet<T> complement(EnumSet<T> a, EnumSet<T> b) {
		    return difference(union(a, b), intersection(a, b));
		  }
	  public static <T> Set<T> complement(Set<T> a, Set<T> b) {
	    return difference(union(a, b), intersection(a, b));
	  }
	}